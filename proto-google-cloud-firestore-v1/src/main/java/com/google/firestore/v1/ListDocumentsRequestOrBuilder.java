/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/firestore.proto

package com.google.firestore.v1;

public interface ListDocumentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.ListDocumentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name. In the format:
   * `projects/{project_id}/databases/{database_id}/documents` or
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * For example:
   * `projects/my-project/databases/my-database/documents` or
   * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource name. In the format:
   * `projects/{project_id}/databases/{database_id}/documents` or
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * For example:
   * `projects/my-project/databases/my-database/documents` or
   * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The collection ID, relative to `parent`, to list. For example: `chatrooms`
   * or `messages`.
   * </pre>
   *
   * <code>string collection_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   *
   *
   * <pre>
   * Required. The collection ID, relative to `parent`, to list. For example: `chatrooms`
   * or `messages`.
   * </pre>
   *
   * <code>string collection_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString getCollectionIdBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of documents to return.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The `next_page_token` value returned from a previous List request, if any.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The `next_page_token` value returned from a previous List request, if any.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The order to sort results by. For example: `priority desc, name`.
   * </pre>
   *
   * <code>string order_by = 6;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * The order to sort results by. For example: `priority desc, name`.
   * </pre>
   *
   * <code>string order_by = 6;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * The fields to return. If not set, returns all fields.
   * If a document has a field that is not present in this mask, that field
   * will not be returned in the response.
   * </pre>
   *
   * <code>.google.firestore.v1.DocumentMask mask = 7;</code>
   *
   * @return Whether the mask field is set.
   */
  boolean hasMask();
  /**
   *
   *
   * <pre>
   * The fields to return. If not set, returns all fields.
   * If a document has a field that is not present in this mask, that field
   * will not be returned in the response.
   * </pre>
   *
   * <code>.google.firestore.v1.DocumentMask mask = 7;</code>
   *
   * @return The mask.
   */
  com.google.firestore.v1.DocumentMask getMask();
  /**
   *
   *
   * <pre>
   * The fields to return. If not set, returns all fields.
   * If a document has a field that is not present in this mask, that field
   * will not be returned in the response.
   * </pre>
   *
   * <code>.google.firestore.v1.DocumentMask mask = 7;</code>
   */
  com.google.firestore.v1.DocumentMaskOrBuilder getMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Reads documents in a transaction.
   * </pre>
   *
   * <code>bytes transaction = 8;</code>
   *
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();
  /**
   *
   *
   * <pre>
   * Reads documents in a transaction.
   * </pre>
   *
   * <code>bytes transaction = 8;</code>
   *
   * @return The transaction.
   */
  com.google.protobuf.ByteString getTransaction();

  /**
   *
   *
   * <pre>
   * Reads documents as they were at the given time.
   * This may not be older than 270 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 10;</code>
   *
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * Reads documents as they were at the given time.
   * This may not be older than 270 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 10;</code>
   *
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * Reads documents as they were at the given time.
   * This may not be older than 270 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * If the list should show missing documents. A missing document is a
   * document that does not exist but has sub-documents. These documents will
   * be returned with a key but will not have fields, [Document.create_time][google.firestore.v1.Document.create_time],
   * or [Document.update_time][google.firestore.v1.Document.update_time] set.
   * Requests with `show_missing` may not specify `where` or
   * `order_by`.
   * </pre>
   *
   * <code>bool show_missing = 12;</code>
   *
   * @return The showMissing.
   */
  boolean getShowMissing();

  public com.google.firestore.v1.ListDocumentsRequest.ConsistencySelectorCase
      getConsistencySelectorCase();
}
