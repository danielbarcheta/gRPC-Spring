// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contrato.proto

package generated;

/**
 * <pre>
 * Mensagem recebida para operacao de 1 long e 8 longs
 * </pre>
 *
 * Protobuf type {@code proto.long_request}
 */
public  final class long_request extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.long_request)
    long_requestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use long_request.newBuilder() to construct.
  private long_request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private long_request() {
    input_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new long_request();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private long_request(
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
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              input_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            input_.addLong(input.readInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              input_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              input_.addLong(input.readInt64());
            }
            input.popLimit(limit);
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        input_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.UserProtos.internal_static_proto_long_request_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.UserProtos.internal_static_proto_long_request_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.long_request.class, generated.long_request.Builder.class);
  }

  public static final int INPUT_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList input_;
  /**
   * <code>repeated int64 input = 1;</code>
   * @return A list containing the input.
   */
  public java.util.List<java.lang.Long>
      getInputList() {
    return input_;
  }
  /**
   * <code>repeated int64 input = 1;</code>
   * @return The count of input.
   */
  public int getInputCount() {
    return input_.size();
  }
  /**
   * <code>repeated int64 input = 1;</code>
   * @param index The index of the element to return.
   * @return The input at the given index.
   */
  public long getInput(int index) {
    return input_.getLong(index);
  }
  private int inputMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getInputList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(inputMemoizedSerializedSize);
    }
    for (int i = 0; i < input_.size(); i++) {
      output.writeInt64NoTag(input_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < input_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(input_.getLong(i));
      }
      size += dataSize;
      if (!getInputList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      inputMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof generated.long_request)) {
      return super.equals(obj);
    }
    generated.long_request other = (generated.long_request) obj;

    if (!getInputList()
        .equals(other.getInputList())) return false;
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
    if (getInputCount() > 0) {
      hash = (37 * hash) + INPUT_FIELD_NUMBER;
      hash = (53 * hash) + getInputList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.long_request parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.long_request parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.long_request parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.long_request parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.long_request parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.long_request parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.long_request parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.long_request parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.long_request parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.long_request parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.long_request parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.long_request parseFrom(
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
  public static Builder newBuilder(generated.long_request prototype) {
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
   * Mensagem recebida para operacao de 1 long e 8 longs
   * </pre>
   *
   * Protobuf type {@code proto.long_request}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.long_request)
      generated.long_requestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.UserProtos.internal_static_proto_long_request_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.UserProtos.internal_static_proto_long_request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.long_request.class, generated.long_request.Builder.class);
    }

    // Construct using generated.long_request.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      input_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.UserProtos.internal_static_proto_long_request_descriptor;
    }

    @java.lang.Override
    public generated.long_request getDefaultInstanceForType() {
      return generated.long_request.getDefaultInstance();
    }

    @java.lang.Override
    public generated.long_request build() {
      generated.long_request result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.long_request buildPartial() {
      generated.long_request result = new generated.long_request(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        input_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.input_ = input_;
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
      if (other instanceof generated.long_request) {
        return mergeFrom((generated.long_request)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.long_request other) {
      if (other == generated.long_request.getDefaultInstance()) return this;
      if (!other.input_.isEmpty()) {
        if (input_.isEmpty()) {
          input_ = other.input_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureInputIsMutable();
          input_.addAll(other.input_);
        }
        onChanged();
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
      generated.long_request parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.long_request) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList input_ = emptyLongList();
    private void ensureInputIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        input_ = mutableCopy(input_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 input = 1;</code>
     * @return A list containing the input.
     */
    public java.util.List<java.lang.Long>
        getInputList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(input_) : input_;
    }
    /**
     * <code>repeated int64 input = 1;</code>
     * @return The count of input.
     */
    public int getInputCount() {
      return input_.size();
    }
    /**
     * <code>repeated int64 input = 1;</code>
     * @param index The index of the element to return.
     * @return The input at the given index.
     */
    public long getInput(int index) {
      return input_.getLong(index);
    }
    /**
     * <code>repeated int64 input = 1;</code>
     * @param index The index to set the value at.
     * @param value The input to set.
     * @return This builder for chaining.
     */
    public Builder setInput(
        int index, long value) {
      ensureInputIsMutable();
      input_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 input = 1;</code>
     * @param value The input to add.
     * @return This builder for chaining.
     */
    public Builder addInput(long value) {
      ensureInputIsMutable();
      input_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 input = 1;</code>
     * @param values The input to add.
     * @return This builder for chaining.
     */
    public Builder addAllInput(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureInputIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, input_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 input = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInput() {
      input_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:proto.long_request)
  }

  // @@protoc_insertion_point(class_scope:proto.long_request)
  private static final generated.long_request DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.long_request();
  }

  public static generated.long_request getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<long_request>
      PARSER = new com.google.protobuf.AbstractParser<long_request>() {
    @java.lang.Override
    public long_request parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new long_request(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<long_request> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<long_request> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.long_request getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
