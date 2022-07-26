// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/firestore.proto

package com.google.firestore.v1;

/**
 * <pre>
 * The request for [Firestore.Commit][google.firestore.v1.Firestore.Commit].
 * </pre>
 *
 * Protobuf type {@code google.firestore.v1.CommitRequest}
 */
public final class CommitRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.firestore.v1.CommitRequest)
    CommitRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommitRequest.newBuilder() to construct.
  private CommitRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommitRequest() {
    database_ = "";
    writes_ = java.util.Collections.emptyList();
    transaction_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommitRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CommitRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            database_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              writes_ = new java.util.ArrayList<com.google.firestore.v1.Write>();
              mutable_bitField0_ |= 0x00000001;
            }
            writes_.add(
                input.readMessage(com.google.firestore.v1.Write.parser(), extensionRegistry));
            break;
          }
          case 26: {

            transaction_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        writes_ = java.util.Collections.unmodifiableList(writes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.firestore.v1.FirestoreProto.internal_static_google_firestore_v1_CommitRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.v1.FirestoreProto.internal_static_google_firestore_v1_CommitRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.v1.CommitRequest.class, com.google.firestore.v1.CommitRequest.Builder.class);
  }

  public static final int DATABASE_FIELD_NUMBER = 1;
  private volatile java.lang.Object database_;
  /**
   * <pre>
   * Required. The database name. In the format:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The database.
   */
  @java.lang.Override
  public java.lang.String getDatabase() {
    java.lang.Object ref = database_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      database_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The database name. In the format:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for database.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDatabaseBytes() {
    java.lang.Object ref = database_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      database_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WRITES_FIELD_NUMBER = 2;
  private java.util.List<com.google.firestore.v1.Write> writes_;
  /**
   * <pre>
   * The writes to apply.
   * Always executed atomically and in order.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Write writes = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.firestore.v1.Write> getWritesList() {
    return writes_;
  }
  /**
   * <pre>
   * The writes to apply.
   * Always executed atomically and in order.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Write writes = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.firestore.v1.WriteOrBuilder> 
      getWritesOrBuilderList() {
    return writes_;
  }
  /**
   * <pre>
   * The writes to apply.
   * Always executed atomically and in order.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Write writes = 2;</code>
   */
  @java.lang.Override
  public int getWritesCount() {
    return writes_.size();
  }
  /**
   * <pre>
   * The writes to apply.
   * Always executed atomically and in order.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Write writes = 2;</code>
   */
  @java.lang.Override
  public com.google.firestore.v1.Write getWrites(int index) {
    return writes_.get(index);
  }
  /**
   * <pre>
   * The writes to apply.
   * Always executed atomically and in order.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Write writes = 2;</code>
   */
  @java.lang.Override
  public com.google.firestore.v1.WriteOrBuilder getWritesOrBuilder(
      int index) {
    return writes_.get(index);
  }

  public static final int TRANSACTION_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString transaction_;
  /**
   * <pre>
   * If set, applies all writes in this transaction, and commits it.
   * </pre>
   *
   * <code>bytes transaction = 3;</code>
   * @return The transaction.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTransaction() {
    return transaction_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(database_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, database_);
    }
    for (int i = 0; i < writes_.size(); i++) {
      output.writeMessage(2, writes_.get(i));
    }
    if (!transaction_.isEmpty()) {
      output.writeBytes(3, transaction_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(database_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, database_);
    }
    for (int i = 0; i < writes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, writes_.get(i));
    }
    if (!transaction_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, transaction_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.firestore.v1.CommitRequest)) {
      return super.equals(obj);
    }
    com.google.firestore.v1.CommitRequest other = (com.google.firestore.v1.CommitRequest) obj;

    if (!getDatabase()
        .equals(other.getDatabase())) return false;
    if (!getWritesList()
        .equals(other.getWritesList())) return false;
    if (!getTransaction()
        .equals(other.getTransaction())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DATABASE_FIELD_NUMBER;
    hash = (53 * hash) + getDatabase().hashCode();
    if (getWritesCount() > 0) {
      hash = (37 * hash) + WRITES_FIELD_NUMBER;
      hash = (53 * hash) + getWritesList().hashCode();
    }
    hash = (37 * hash) + TRANSACTION_FIELD_NUMBER;
    hash = (53 * hash) + getTransaction().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.v1.CommitRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.v1.CommitRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.v1.CommitRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.v1.CommitRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.v1.CommitRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.v1.CommitRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.v1.CommitRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.firestore.v1.CommitRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.firestore.v1.CommitRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.firestore.v1.CommitRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.firestore.v1.CommitRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.firestore.v1.CommitRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.firestore.v1.CommitRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The request for [Firestore.Commit][google.firestore.v1.Firestore.Commit].
   * </pre>
   *
   * Protobuf type {@code google.firestore.v1.CommitRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.firestore.v1.CommitRequest)
      com.google.firestore.v1.CommitRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.firestore.v1.FirestoreProto.internal_static_google_firestore_v1_CommitRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.v1.FirestoreProto.internal_static_google_firestore_v1_CommitRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.v1.CommitRequest.class, com.google.firestore.v1.CommitRequest.Builder.class);
    }

    // Construct using com.google.firestore.v1.CommitRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getWritesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      database_ = "";

      if (writesBuilder_ == null) {
        writes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        writesBuilder_.clear();
      }
      transaction_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.firestore.v1.FirestoreProto.internal_static_google_firestore_v1_CommitRequest_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.v1.CommitRequest getDefaultInstanceForType() {
      return com.google.firestore.v1.CommitRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.v1.CommitRequest build() {
      com.google.firestore.v1.CommitRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.v1.CommitRequest buildPartial() {
      com.google.firestore.v1.CommitRequest result = new com.google.firestore.v1.CommitRequest(this);
      int from_bitField0_ = bitField0_;
      result.database_ = database_;
      if (writesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          writes_ = java.util.Collections.unmodifiableList(writes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.writes_ = writes_;
      } else {
        result.writes_ = writesBuilder_.build();
      }
      result.transaction_ = transaction_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.firestore.v1.CommitRequest) {
        return mergeFrom((com.google.firestore.v1.CommitRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.v1.CommitRequest other) {
      if (other == com.google.firestore.v1.CommitRequest.getDefaultInstance()) return this;
      if (!other.getDatabase().isEmpty()) {
        database_ = other.database_;
        onChanged();
      }
      if (writesBuilder_ == null) {
        if (!other.writes_.isEmpty()) {
          if (writes_.isEmpty()) {
            writes_ = other.writes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWritesIsMutable();
            writes_.addAll(other.writes_);
          }
          onChanged();
        }
      } else {
        if (!other.writes_.isEmpty()) {
          if (writesBuilder_.isEmpty()) {
            writesBuilder_.dispose();
            writesBuilder_ = null;
            writes_ = other.writes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            writesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWritesFieldBuilder() : null;
          } else {
            writesBuilder_.addAllMessages(other.writes_);
          }
        }
      }
      if (other.getTransaction() != com.google.protobuf.ByteString.EMPTY) {
        setTransaction(other.getTransaction());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.firestore.v1.CommitRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.firestore.v1.CommitRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object database_ = "";
    /**
     * <pre>
     * Required. The database name. In the format:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The database.
     */
    public java.lang.String getDatabase() {
      java.lang.Object ref = database_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        database_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The database name. In the format:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for database.
     */
    public com.google.protobuf.ByteString
        getDatabaseBytes() {
      java.lang.Object ref = database_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        database_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The database name. In the format:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The database to set.
     * @return This builder for chaining.
     */
    public Builder setDatabase(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      database_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The database name. In the format:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearDatabase() {
      
      database_ = getDefaultInstance().getDatabase();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The database name. In the format:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for database to set.
     * @return This builder for chaining.
     */
    public Builder setDatabaseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      database_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.firestore.v1.Write> writes_ =
      java.util.Collections.emptyList();
    private void ensureWritesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        writes_ = new java.util.ArrayList<com.google.firestore.v1.Write>(writes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.firestore.v1.Write, com.google.firestore.v1.Write.Builder, com.google.firestore.v1.WriteOrBuilder> writesBuilder_;

    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public java.util.List<com.google.firestore.v1.Write> getWritesList() {
      if (writesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(writes_);
      } else {
        return writesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public int getWritesCount() {
      if (writesBuilder_ == null) {
        return writes_.size();
      } else {
        return writesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public com.google.firestore.v1.Write getWrites(int index) {
      if (writesBuilder_ == null) {
        return writes_.get(index);
      } else {
        return writesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public Builder setWrites(
        int index, com.google.firestore.v1.Write value) {
      if (writesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWritesIsMutable();
        writes_.set(index, value);
        onChanged();
      } else {
        writesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public Builder setWrites(
        int index, com.google.firestore.v1.Write.Builder builderForValue) {
      if (writesBuilder_ == null) {
        ensureWritesIsMutable();
        writes_.set(index, builderForValue.build());
        onChanged();
      } else {
        writesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public Builder addWrites(com.google.firestore.v1.Write value) {
      if (writesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWritesIsMutable();
        writes_.add(value);
        onChanged();
      } else {
        writesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public Builder addWrites(
        int index, com.google.firestore.v1.Write value) {
      if (writesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWritesIsMutable();
        writes_.add(index, value);
        onChanged();
      } else {
        writesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public Builder addWrites(
        com.google.firestore.v1.Write.Builder builderForValue) {
      if (writesBuilder_ == null) {
        ensureWritesIsMutable();
        writes_.add(builderForValue.build());
        onChanged();
      } else {
        writesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public Builder addWrites(
        int index, com.google.firestore.v1.Write.Builder builderForValue) {
      if (writesBuilder_ == null) {
        ensureWritesIsMutable();
        writes_.add(index, builderForValue.build());
        onChanged();
      } else {
        writesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public Builder addAllWrites(
        java.lang.Iterable<? extends com.google.firestore.v1.Write> values) {
      if (writesBuilder_ == null) {
        ensureWritesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, writes_);
        onChanged();
      } else {
        writesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public Builder clearWrites() {
      if (writesBuilder_ == null) {
        writes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        writesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public Builder removeWrites(int index) {
      if (writesBuilder_ == null) {
        ensureWritesIsMutable();
        writes_.remove(index);
        onChanged();
      } else {
        writesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public com.google.firestore.v1.Write.Builder getWritesBuilder(
        int index) {
      return getWritesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public com.google.firestore.v1.WriteOrBuilder getWritesOrBuilder(
        int index) {
      if (writesBuilder_ == null) {
        return writes_.get(index);  } else {
        return writesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public java.util.List<? extends com.google.firestore.v1.WriteOrBuilder> 
         getWritesOrBuilderList() {
      if (writesBuilder_ != null) {
        return writesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(writes_);
      }
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public com.google.firestore.v1.Write.Builder addWritesBuilder() {
      return getWritesFieldBuilder().addBuilder(
          com.google.firestore.v1.Write.getDefaultInstance());
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public com.google.firestore.v1.Write.Builder addWritesBuilder(
        int index) {
      return getWritesFieldBuilder().addBuilder(
          index, com.google.firestore.v1.Write.getDefaultInstance());
    }
    /**
     * <pre>
     * The writes to apply.
     * Always executed atomically and in order.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Write writes = 2;</code>
     */
    public java.util.List<com.google.firestore.v1.Write.Builder> 
         getWritesBuilderList() {
      return getWritesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.firestore.v1.Write, com.google.firestore.v1.Write.Builder, com.google.firestore.v1.WriteOrBuilder> 
        getWritesFieldBuilder() {
      if (writesBuilder_ == null) {
        writesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.firestore.v1.Write, com.google.firestore.v1.Write.Builder, com.google.firestore.v1.WriteOrBuilder>(
                writes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        writes_ = null;
      }
      return writesBuilder_;
    }

    private com.google.protobuf.ByteString transaction_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * If set, applies all writes in this transaction, and commits it.
     * </pre>
     *
     * <code>bytes transaction = 3;</code>
     * @return The transaction.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTransaction() {
      return transaction_;
    }
    /**
     * <pre>
     * If set, applies all writes in this transaction, and commits it.
     * </pre>
     *
     * <code>bytes transaction = 3;</code>
     * @param value The transaction to set.
     * @return This builder for chaining.
     */
    public Builder setTransaction(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      transaction_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, applies all writes in this transaction, and commits it.
     * </pre>
     *
     * <code>bytes transaction = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTransaction() {
      
      transaction_ = getDefaultInstance().getTransaction();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.firestore.v1.CommitRequest)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.v1.CommitRequest)
  private static final com.google.firestore.v1.CommitRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.firestore.v1.CommitRequest();
  }

  public static com.google.firestore.v1.CommitRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommitRequest>
      PARSER = new com.google.protobuf.AbstractParser<CommitRequest>() {
    @java.lang.Override
    public CommitRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CommitRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CommitRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommitRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.v1.CommitRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

