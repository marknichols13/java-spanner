/*
 * Copyright 2024 Google LLC
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
// source: google/spanner/executor/v1/cloud_executor.proto

// Protobuf Java Version: 3.25.4
package com.google.spanner.executor.v1;

/**
 *
 *
 * <pre>
 * Generate database partitions for the given query. Successful outcomes will
 * contain database partitions in the db_partition field.
 * </pre>
 *
 * Protobuf type {@code google.spanner.executor.v1.GenerateDbPartitionsForQueryAction}
 */
public final class GenerateDbPartitionsForQueryAction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.executor.v1.GenerateDbPartitionsForQueryAction)
    GenerateDbPartitionsForQueryActionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GenerateDbPartitionsForQueryAction.newBuilder() to construct.
  private GenerateDbPartitionsForQueryAction(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GenerateDbPartitionsForQueryAction() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GenerateDbPartitionsForQueryAction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.spanner.executor.v1.CloudExecutorProto
        .internal_static_google_spanner_executor_v1_GenerateDbPartitionsForQueryAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.executor.v1.CloudExecutorProto
        .internal_static_google_spanner_executor_v1_GenerateDbPartitionsForQueryAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction.class,
            com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction.Builder.class);
  }

  private int bitField0_;
  public static final int QUERY_FIELD_NUMBER = 1;
  private com.google.spanner.executor.v1.QueryAction query_;
  /**
   *
   *
   * <pre>
   * Query to generate partitions for.
   * </pre>
   *
   * <code>.google.spanner.executor.v1.QueryAction query = 1;</code>
   *
   * @return Whether the query field is set.
   */
  @java.lang.Override
  public boolean hasQuery() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Query to generate partitions for.
   * </pre>
   *
   * <code>.google.spanner.executor.v1.QueryAction query = 1;</code>
   *
   * @return The query.
   */
  @java.lang.Override
  public com.google.spanner.executor.v1.QueryAction getQuery() {
    return query_ == null
        ? com.google.spanner.executor.v1.QueryAction.getDefaultInstance()
        : query_;
  }
  /**
   *
   *
   * <pre>
   * Query to generate partitions for.
   * </pre>
   *
   * <code>.google.spanner.executor.v1.QueryAction query = 1;</code>
   */
  @java.lang.Override
  public com.google.spanner.executor.v1.QueryActionOrBuilder getQueryOrBuilder() {
    return query_ == null
        ? com.google.spanner.executor.v1.QueryAction.getDefaultInstance()
        : query_;
  }

  public static final int DESIRED_BYTES_PER_PARTITION_FIELD_NUMBER = 2;
  private long desiredBytesPerPartition_ = 0L;
  /**
   *
   *
   * <pre>
   * Desired size of data in each partition. Spanner doesn't guarantee to
   * respect this value.
   * </pre>
   *
   * <code>optional int64 desired_bytes_per_partition = 2;</code>
   *
   * @return Whether the desiredBytesPerPartition field is set.
   */
  @java.lang.Override
  public boolean hasDesiredBytesPerPartition() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Desired size of data in each partition. Spanner doesn't guarantee to
   * respect this value.
   * </pre>
   *
   * <code>optional int64 desired_bytes_per_partition = 2;</code>
   *
   * @return The desiredBytesPerPartition.
   */
  @java.lang.Override
  public long getDesiredBytesPerPartition() {
    return desiredBytesPerPartition_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getQuery());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(2, desiredBytesPerPartition_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getQuery());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, desiredBytesPerPartition_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction)) {
      return super.equals(obj);
    }
    com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction other =
        (com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction) obj;

    if (hasQuery() != other.hasQuery()) return false;
    if (hasQuery()) {
      if (!getQuery().equals(other.getQuery())) return false;
    }
    if (hasDesiredBytesPerPartition() != other.hasDesiredBytesPerPartition()) return false;
    if (hasDesiredBytesPerPartition()) {
      if (getDesiredBytesPerPartition() != other.getDesiredBytesPerPartition()) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasQuery()) {
      hash = (37 * hash) + QUERY_FIELD_NUMBER;
      hash = (53 * hash) + getQuery().hashCode();
    }
    if (hasDesiredBytesPerPartition()) {
      hash = (37 * hash) + DESIRED_BYTES_PER_PARTITION_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getDesiredBytesPerPartition());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Generate database partitions for the given query. Successful outcomes will
   * contain database partitions in the db_partition field.
   * </pre>
   *
   * Protobuf type {@code google.spanner.executor.v1.GenerateDbPartitionsForQueryAction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.executor.v1.GenerateDbPartitionsForQueryAction)
      com.google.spanner.executor.v1.GenerateDbPartitionsForQueryActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.executor.v1.CloudExecutorProto
          .internal_static_google_spanner_executor_v1_GenerateDbPartitionsForQueryAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.executor.v1.CloudExecutorProto
          .internal_static_google_spanner_executor_v1_GenerateDbPartitionsForQueryAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction.class,
              com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction.Builder.class);
    }

    // Construct using
    // com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getQueryFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      query_ = null;
      if (queryBuilder_ != null) {
        queryBuilder_.dispose();
        queryBuilder_ = null;
      }
      desiredBytesPerPartition_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.executor.v1.CloudExecutorProto
          .internal_static_google_spanner_executor_v1_GenerateDbPartitionsForQueryAction_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction
        getDefaultInstanceForType() {
      return com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction build() {
      com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction buildPartial() {
      com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction result =
          new com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.query_ = queryBuilder_ == null ? query_ : queryBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.desiredBytesPerPartition_ = desiredBytesPerPartition_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction) {
        return mergeFrom((com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction other) {
      if (other
          == com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction.getDefaultInstance())
        return this;
      if (other.hasQuery()) {
        mergeQuery(other.getQuery());
      }
      if (other.hasDesiredBytesPerPartition()) {
        setDesiredBytesPerPartition(other.getDesiredBytesPerPartition());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getQueryFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                desiredBytesPerPartition_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.spanner.executor.v1.QueryAction query_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.executor.v1.QueryAction,
            com.google.spanner.executor.v1.QueryAction.Builder,
            com.google.spanner.executor.v1.QueryActionOrBuilder>
        queryBuilder_;
    /**
     *
     *
     * <pre>
     * Query to generate partitions for.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction query = 1;</code>
     *
     * @return Whether the query field is set.
     */
    public boolean hasQuery() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Query to generate partitions for.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction query = 1;</code>
     *
     * @return The query.
     */
    public com.google.spanner.executor.v1.QueryAction getQuery() {
      if (queryBuilder_ == null) {
        return query_ == null
            ? com.google.spanner.executor.v1.QueryAction.getDefaultInstance()
            : query_;
      } else {
        return queryBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Query to generate partitions for.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction query = 1;</code>
     */
    public Builder setQuery(com.google.spanner.executor.v1.QueryAction value) {
      if (queryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        query_ = value;
      } else {
        queryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Query to generate partitions for.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction query = 1;</code>
     */
    public Builder setQuery(com.google.spanner.executor.v1.QueryAction.Builder builderForValue) {
      if (queryBuilder_ == null) {
        query_ = builderForValue.build();
      } else {
        queryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Query to generate partitions for.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction query = 1;</code>
     */
    public Builder mergeQuery(com.google.spanner.executor.v1.QueryAction value) {
      if (queryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && query_ != null
            && query_ != com.google.spanner.executor.v1.QueryAction.getDefaultInstance()) {
          getQueryBuilder().mergeFrom(value);
        } else {
          query_ = value;
        }
      } else {
        queryBuilder_.mergeFrom(value);
      }
      if (query_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Query to generate partitions for.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction query = 1;</code>
     */
    public Builder clearQuery() {
      bitField0_ = (bitField0_ & ~0x00000001);
      query_ = null;
      if (queryBuilder_ != null) {
        queryBuilder_.dispose();
        queryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Query to generate partitions for.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction query = 1;</code>
     */
    public com.google.spanner.executor.v1.QueryAction.Builder getQueryBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getQueryFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Query to generate partitions for.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction query = 1;</code>
     */
    public com.google.spanner.executor.v1.QueryActionOrBuilder getQueryOrBuilder() {
      if (queryBuilder_ != null) {
        return queryBuilder_.getMessageOrBuilder();
      } else {
        return query_ == null
            ? com.google.spanner.executor.v1.QueryAction.getDefaultInstance()
            : query_;
      }
    }
    /**
     *
     *
     * <pre>
     * Query to generate partitions for.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.QueryAction query = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.executor.v1.QueryAction,
            com.google.spanner.executor.v1.QueryAction.Builder,
            com.google.spanner.executor.v1.QueryActionOrBuilder>
        getQueryFieldBuilder() {
      if (queryBuilder_ == null) {
        queryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.spanner.executor.v1.QueryAction,
                com.google.spanner.executor.v1.QueryAction.Builder,
                com.google.spanner.executor.v1.QueryActionOrBuilder>(
                getQuery(), getParentForChildren(), isClean());
        query_ = null;
      }
      return queryBuilder_;
    }

    private long desiredBytesPerPartition_;
    /**
     *
     *
     * <pre>
     * Desired size of data in each partition. Spanner doesn't guarantee to
     * respect this value.
     * </pre>
     *
     * <code>optional int64 desired_bytes_per_partition = 2;</code>
     *
     * @return Whether the desiredBytesPerPartition field is set.
     */
    @java.lang.Override
    public boolean hasDesiredBytesPerPartition() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Desired size of data in each partition. Spanner doesn't guarantee to
     * respect this value.
     * </pre>
     *
     * <code>optional int64 desired_bytes_per_partition = 2;</code>
     *
     * @return The desiredBytesPerPartition.
     */
    @java.lang.Override
    public long getDesiredBytesPerPartition() {
      return desiredBytesPerPartition_;
    }
    /**
     *
     *
     * <pre>
     * Desired size of data in each partition. Spanner doesn't guarantee to
     * respect this value.
     * </pre>
     *
     * <code>optional int64 desired_bytes_per_partition = 2;</code>
     *
     * @param value The desiredBytesPerPartition to set.
     * @return This builder for chaining.
     */
    public Builder setDesiredBytesPerPartition(long value) {

      desiredBytesPerPartition_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Desired size of data in each partition. Spanner doesn't guarantee to
     * respect this value.
     * </pre>
     *
     * <code>optional int64 desired_bytes_per_partition = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDesiredBytesPerPartition() {
      bitField0_ = (bitField0_ & ~0x00000002);
      desiredBytesPerPartition_ = 0L;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.spanner.executor.v1.GenerateDbPartitionsForQueryAction)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.executor.v1.GenerateDbPartitionsForQueryAction)
  private static final com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction();
  }

  public static com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateDbPartitionsForQueryAction> PARSER =
      new com.google.protobuf.AbstractParser<GenerateDbPartitionsForQueryAction>() {
        @java.lang.Override
        public GenerateDbPartitionsForQueryAction parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<GenerateDbPartitionsForQueryAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateDbPartitionsForQueryAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.executor.v1.GenerateDbPartitionsForQueryAction
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
