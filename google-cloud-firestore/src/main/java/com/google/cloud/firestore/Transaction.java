/*
 * Copyright 2017 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.firestore;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.cloud.firestore.TransactionOptions.TransactionOptionsType;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.firestore.v1.BeginTransactionRequest;
import com.google.firestore.v1.BeginTransactionResponse;
import com.google.firestore.v1.RollbackRequest;
import com.google.firestore.v1.TransactionOptions.ReadOnly;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import io.opencensus.trace.Tracing;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * A Transaction is passed to a Function to provide the methods to read and write data within the
 * transaction context.
 *
 * @see Firestore#runTransaction(Function)
 */
public final class Transaction extends UpdateBuilder<Transaction> {

  private static final String READ_BEFORE_WRITE_ERROR_MSG =
      "Firestore transactions require all reads to be executed before all writes";

  /**
   * User callback that takes a Firestore Transaction.
   *
   * @param <T> The result type of the user callback.
   */
  public interface Function<T> {

    T updateCallback(Transaction transaction) throws Exception;
  }

  /**
   * User callback that takes a Firestore Async Transaction.
   *
   * @param <T> The result type of the user async callback.
   */
  public interface AsyncFunction<T> {

    ApiFuture<T> updateCallback(Transaction transaction);
  }

  private final TransactionOptions transactionOptions;
  private ByteString transactionId;

  Transaction(
      FirestoreImpl firestore,
      TransactionOptions transactionOptions,
      @Nullable Transaction previousTransaction) {
    super(firestore);
    this.transactionOptions = transactionOptions;
    this.transactionId = previousTransaction != null ? previousTransaction.transactionId : null;
  }

  public boolean hasTransactionId() {
    return transactionId != null;
  }

  Transaction wrapResult(int writeIndex) {
    return this;
  }

  /** Starts a transaction and obtains the transaction id. */
  ApiFuture<Void> begin() {
    Tracing.getTracer().getCurrentSpan().addAnnotation(TraceUtil.SPAN_NAME_BEGINTRANSACTION);
    BeginTransactionRequest.Builder beginTransaction = BeginTransactionRequest.newBuilder();
    beginTransaction.setDatabase(firestore.getDatabaseName());

    if (TransactionOptionsType.READ_WRITE.equals(transactionOptions.getType())
        && transactionId != null) {
      beginTransaction.getOptionsBuilder().getReadWriteBuilder().setRetryTransaction(transactionId);
    } else if (TransactionOptionsType.READ_ONLY.equals(transactionOptions.getType())) {
      final ReadOnly.Builder readOnlyBuilder = ReadOnly.newBuilder();
      if (transactionOptions.getReadTime() != null) {
        readOnlyBuilder.setReadTime(transactionOptions.getReadTime());
      }
      beginTransaction.getOptionsBuilder().setReadOnly(readOnlyBuilder);
    }

    ApiFuture<BeginTransactionResponse> transactionBeginFuture =
        firestore.sendRequest(
            beginTransaction.build(), firestore.getClient().beginTransactionCallable());

    return ApiFutures.transform(
        transactionBeginFuture,
        beginTransactionResponse -> {
          transactionId = beginTransactionResponse.getTransaction();
          return null;
        },
        MoreExecutors.directExecutor());
  }

  /** Commits a transaction. */
  ApiFuture<List<WriteResult>> commit() {
    return super.commit(transactionId);
  }

  /** Rolls a transaction back and releases all read locks. */
  ApiFuture<Void> rollback() {
    Tracing.getTracer().getCurrentSpan().addAnnotation(TraceUtil.SPAN_NAME_ROLLBACK);
    RollbackRequest.Builder reqBuilder = RollbackRequest.newBuilder();
    reqBuilder.setTransaction(transactionId);
    reqBuilder.setDatabase(firestore.getDatabaseName());

    ApiFuture<Empty> rollbackFuture =
        firestore.sendRequest(reqBuilder.build(), firestore.getClient().rollbackCallable());

    return ApiFutures.transform(
        rollbackFuture, beginTransactionResponse -> null, MoreExecutors.directExecutor());
  }

  /**
   * Reads the document referred to by the provided DocumentReference. Holds a pessimistic lock on
   * the returned document.
   *
   * @return The contents of the Document at this DocumentReference.
   */
  @Nonnull
  public ApiFuture<DocumentSnapshot> get(@Nonnull DocumentReference documentRef) {
    Preconditions.checkState(isEmpty(), READ_BEFORE_WRITE_ERROR_MSG);
    Tracing.getTracer().getCurrentSpan().addAnnotation(TraceUtil.SPAN_NAME_GETDOCUMENT);
    return ApiFutures.transform(
        firestore.getAll(new DocumentReference[] {documentRef}, /*fieldMask=*/ null, transactionId),
        snapshots -> snapshots.isEmpty() ? null : snapshots.get(0),
        MoreExecutors.directExecutor());
  }

  /**
   * Retrieves multiple documents from Firestore. Holds a pessimistic lock on all returned
   * documents.
   *
   * @param documentReferences List of Document References to fetch.
   */
  @Nonnull
  public ApiFuture<List<DocumentSnapshot>> getAll(
      @Nonnull DocumentReference... documentReferences) {
    Preconditions.checkState(isEmpty(), READ_BEFORE_WRITE_ERROR_MSG);

    return firestore.getAll(documentReferences, /*fieldMask=*/ null, transactionId);
  }

  /**
   * Retrieves multiple documents from Firestore, while optionally applying a field mask to reduce
   * the amount of data transmitted from the backend. Holds a pessimistic lock on all returned
   * documents.
   *
   * @param documentReferences Array with Document References to fetch.
   * @param fieldMask If set, specifies the subset of fields to return.
   */
  @Nonnull
  public ApiFuture<List<DocumentSnapshot>> getAll(
      @Nonnull DocumentReference[] documentReferences, @Nullable FieldMask fieldMask) {
    Preconditions.checkState(isEmpty(), READ_BEFORE_WRITE_ERROR_MSG);

    return firestore.getAll(documentReferences, fieldMask, transactionId);
  }

  /**
   * Returns the result set from the provided query. Holds a pessimistic lock on all returned
   * documents.
   *
   * @return The contents of the Document at this DocumentReference.
   */
  @Nonnull
  public ApiFuture<QuerySnapshot> get(@Nonnull Query query) {
    Preconditions.checkState(isEmpty(), READ_BEFORE_WRITE_ERROR_MSG);

    return query.get(transactionId);
  }

  /**
   * Returns the result from the provided aggregate query. Holds a pessimistic lock on all accessed
   * documents.
   *
   * @return The result of the aggregation.
   */
  @Nonnull
  public ApiFuture<AggregateQuerySnapshot> get(@Nonnull AggregateQuery query) {
    Preconditions.checkState(isEmpty(), READ_BEFORE_WRITE_ERROR_MSG);

    return query.get(transactionId);
  }
}
