// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/query.proto

package com.google.firestore.v1;

/**
 * <pre>
 * A position in a query result set.
 * </pre>
 *
 * Protobuf type {@code google.firestore.v1.Cursor}
 */
public final class Cursor extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.firestore.v1.Cursor)
    CursorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Cursor.newBuilder() to construct.
  private Cursor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Cursor() {
    values_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Cursor();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Cursor(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              values_ = new java.util.ArrayList<com.google.firestore.v1.Value>();
              mutable_bitField0_ |= 0x00000001;
            }
            values_.add(
                input.readMessage(com.google.firestore.v1.Value.parser(), extensionRegistry));
            break;
          }
          case 16: {

            before_ = input.readBool();
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
        values_ = java.util.Collections.unmodifiableList(values_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.firestore.v1.QueryProto.internal_static_google_firestore_v1_Cursor_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.v1.QueryProto.internal_static_google_firestore_v1_Cursor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.v1.Cursor.class, com.google.firestore.v1.Cursor.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  private java.util.List<com.google.firestore.v1.Value> values_;
  /**
   * <pre>
   * The values that represent a position, in the order they appear in
   * the order by clause of a query.
   * Can contain fewer values than specified in the order by clause.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Value values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.firestore.v1.Value> getValuesList() {
    return values_;
  }
  /**
   * <pre>
   * The values that represent a position, in the order they appear in
   * the order by clause of a query.
   * Can contain fewer values than specified in the order by clause.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Value values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.firestore.v1.ValueOrBuilder> 
      getValuesOrBuilderList() {
    return values_;
  }
  /**
   * <pre>
   * The values that represent a position, in the order they appear in
   * the order by clause of a query.
   * Can contain fewer values than specified in the order by clause.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Value values = 1;</code>
   */
  @java.lang.Override
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <pre>
   * The values that represent a position, in the order they appear in
   * the order by clause of a query.
   * Can contain fewer values than specified in the order by clause.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Value values = 1;</code>
   */
  @java.lang.Override
  public com.google.firestore.v1.Value getValues(int index) {
    return values_.get(index);
  }
  /**
   * <pre>
   * The values that represent a position, in the order they appear in
   * the order by clause of a query.
   * Can contain fewer values than specified in the order by clause.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Value values = 1;</code>
   */
  @java.lang.Override
  public com.google.firestore.v1.ValueOrBuilder getValuesOrBuilder(
      int index) {
    return values_.get(index);
  }

  public static final int BEFORE_FIELD_NUMBER = 2;
  private boolean before_;
  /**
   * <pre>
   * If the position is just before or just after the given values, relative
   * to the sort order defined by the query.
   * </pre>
   *
   * <code>bool before = 2;</code>
   * @return The before.
   */
  @java.lang.Override
  public boolean getBefore() {
    return before_;
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
    for (int i = 0; i < values_.size(); i++) {
      output.writeMessage(1, values_.get(i));
    }
    if (before_ != false) {
      output.writeBool(2, before_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < values_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, values_.get(i));
    }
    if (before_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, before_);
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
    if (!(obj instanceof com.google.firestore.v1.Cursor)) {
      return super.equals(obj);
    }
    com.google.firestore.v1.Cursor other = (com.google.firestore.v1.Cursor) obj;

    if (!getValuesList()
        .equals(other.getValuesList())) return false;
    if (getBefore()
        != other.getBefore()) return false;
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
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (37 * hash) + BEFORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBefore());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.v1.Cursor parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.v1.Cursor parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.v1.Cursor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.v1.Cursor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.v1.Cursor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.v1.Cursor parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.v1.Cursor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.firestore.v1.Cursor parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.firestore.v1.Cursor parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.firestore.v1.Cursor parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.firestore.v1.Cursor parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.firestore.v1.Cursor parseFrom(
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
  public static Builder newBuilder(com.google.firestore.v1.Cursor prototype) {
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
   * A position in a query result set.
   * </pre>
   *
   * Protobuf type {@code google.firestore.v1.Cursor}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.firestore.v1.Cursor)
      com.google.firestore.v1.CursorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.firestore.v1.QueryProto.internal_static_google_firestore_v1_Cursor_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.v1.QueryProto.internal_static_google_firestore_v1_Cursor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.v1.Cursor.class, com.google.firestore.v1.Cursor.Builder.class);
    }

    // Construct using com.google.firestore.v1.Cursor.newBuilder()
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
        getValuesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        valuesBuilder_.clear();
      }
      before_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.firestore.v1.QueryProto.internal_static_google_firestore_v1_Cursor_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.v1.Cursor getDefaultInstanceForType() {
      return com.google.firestore.v1.Cursor.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.v1.Cursor build() {
      com.google.firestore.v1.Cursor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.v1.Cursor buildPartial() {
      com.google.firestore.v1.Cursor result = new com.google.firestore.v1.Cursor(this);
      int from_bitField0_ = bitField0_;
      if (valuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          values_ = java.util.Collections.unmodifiableList(values_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.values_ = values_;
      } else {
        result.values_ = valuesBuilder_.build();
      }
      result.before_ = before_;
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
      if (other instanceof com.google.firestore.v1.Cursor) {
        return mergeFrom((com.google.firestore.v1.Cursor)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.v1.Cursor other) {
      if (other == com.google.firestore.v1.Cursor.getDefaultInstance()) return this;
      if (valuesBuilder_ == null) {
        if (!other.values_.isEmpty()) {
          if (values_.isEmpty()) {
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValuesIsMutable();
            values_.addAll(other.values_);
          }
          onChanged();
        }
      } else {
        if (!other.values_.isEmpty()) {
          if (valuesBuilder_.isEmpty()) {
            valuesBuilder_.dispose();
            valuesBuilder_ = null;
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
            valuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValuesFieldBuilder() : null;
          } else {
            valuesBuilder_.addAllMessages(other.values_);
          }
        }
      }
      if (other.getBefore() != false) {
        setBefore(other.getBefore());
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
      com.google.firestore.v1.Cursor parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.firestore.v1.Cursor) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.firestore.v1.Value> values_ =
      java.util.Collections.emptyList();
    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = new java.util.ArrayList<com.google.firestore.v1.Value>(values_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.firestore.v1.Value, com.google.firestore.v1.Value.Builder, com.google.firestore.v1.ValueOrBuilder> valuesBuilder_;

    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public java.util.List<com.google.firestore.v1.Value> getValuesList() {
      if (valuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(values_);
      } else {
        return valuesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public int getValuesCount() {
      if (valuesBuilder_ == null) {
        return values_.size();
      } else {
        return valuesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public com.google.firestore.v1.Value getValues(int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);
      } else {
        return valuesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public Builder setValues(
        int index, com.google.firestore.v1.Value value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.set(index, value);
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public Builder setValues(
        int index, com.google.firestore.v1.Value.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.set(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public Builder addValues(com.google.firestore.v1.Value value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public Builder addValues(
        int index, com.google.firestore.v1.Value value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(index, value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public Builder addValues(
        com.google.firestore.v1.Value.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public Builder addValues(
        int index, com.google.firestore.v1.Value.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends com.google.firestore.v1.Value> values) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, values_);
        onChanged();
      } else {
        valuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public Builder clearValues() {
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public Builder removeValues(int index) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.remove(index);
        onChanged();
      } else {
        valuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public com.google.firestore.v1.Value.Builder getValuesBuilder(
        int index) {
      return getValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public com.google.firestore.v1.ValueOrBuilder getValuesOrBuilder(
        int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);  } else {
        return valuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public java.util.List<? extends com.google.firestore.v1.ValueOrBuilder> 
         getValuesOrBuilderList() {
      if (valuesBuilder_ != null) {
        return valuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(values_);
      }
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public com.google.firestore.v1.Value.Builder addValuesBuilder() {
      return getValuesFieldBuilder().addBuilder(
          com.google.firestore.v1.Value.getDefaultInstance());
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public com.google.firestore.v1.Value.Builder addValuesBuilder(
        int index) {
      return getValuesFieldBuilder().addBuilder(
          index, com.google.firestore.v1.Value.getDefaultInstance());
    }
    /**
     * <pre>
     * The values that represent a position, in the order they appear in
     * the order by clause of a query.
     * Can contain fewer values than specified in the order by clause.
     * </pre>
     *
     * <code>repeated .google.firestore.v1.Value values = 1;</code>
     */
    public java.util.List<com.google.firestore.v1.Value.Builder> 
         getValuesBuilderList() {
      return getValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.firestore.v1.Value, com.google.firestore.v1.Value.Builder, com.google.firestore.v1.ValueOrBuilder> 
        getValuesFieldBuilder() {
      if (valuesBuilder_ == null) {
        valuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.firestore.v1.Value, com.google.firestore.v1.Value.Builder, com.google.firestore.v1.ValueOrBuilder>(
                values_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        values_ = null;
      }
      return valuesBuilder_;
    }

    private boolean before_ ;
    /**
     * <pre>
     * If the position is just before or just after the given values, relative
     * to the sort order defined by the query.
     * </pre>
     *
     * <code>bool before = 2;</code>
     * @return The before.
     */
    @java.lang.Override
    public boolean getBefore() {
      return before_;
    }
    /**
     * <pre>
     * If the position is just before or just after the given values, relative
     * to the sort order defined by the query.
     * </pre>
     *
     * <code>bool before = 2;</code>
     * @param value The before to set.
     * @return This builder for chaining.
     */
    public Builder setBefore(boolean value) {
      
      before_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If the position is just before or just after the given values, relative
     * to the sort order defined by the query.
     * </pre>
     *
     * <code>bool before = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBefore() {
      
      before_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.firestore.v1.Cursor)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.v1.Cursor)
  private static final com.google.firestore.v1.Cursor DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.firestore.v1.Cursor();
  }

  public static com.google.firestore.v1.Cursor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Cursor>
      PARSER = new com.google.protobuf.AbstractParser<Cursor>() {
    @java.lang.Override
    public Cursor parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Cursor(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Cursor> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Cursor> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.v1.Cursor getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

