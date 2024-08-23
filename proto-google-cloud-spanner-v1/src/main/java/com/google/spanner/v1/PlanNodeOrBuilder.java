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
// source: google/spanner/v1/query_plan.proto

// Protobuf Java Version: 3.25.4
package com.google.spanner.v1;

public interface PlanNodeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.PlanNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The `PlanNode`'s index in [node list][google.spanner.v1.QueryPlan.plan_nodes].
   * </pre>
   *
   * <code>int32 index = 1;</code>
   *
   * @return The index.
   */
  int getIndex();

  /**
   *
   *
   * <pre>
   * Used to determine the type of node. May be needed for visualizing
   * different kinds of nodes differently. For example, If the node is a
   * [SCALAR][google.spanner.v1.PlanNode.Kind.SCALAR] node, it will have a condensed representation
   * which can be used to directly embed a description of the node in its
   * parent.
   * </pre>
   *
   * <code>.google.spanner.v1.PlanNode.Kind kind = 2;</code>
   *
   * @return The enum numeric value on the wire for kind.
   */
  int getKindValue();
  /**
   *
   *
   * <pre>
   * Used to determine the type of node. May be needed for visualizing
   * different kinds of nodes differently. For example, If the node is a
   * [SCALAR][google.spanner.v1.PlanNode.Kind.SCALAR] node, it will have a condensed representation
   * which can be used to directly embed a description of the node in its
   * parent.
   * </pre>
   *
   * <code>.google.spanner.v1.PlanNode.Kind kind = 2;</code>
   *
   * @return The kind.
   */
  com.google.spanner.v1.PlanNode.Kind getKind();

  /**
   *
   *
   * <pre>
   * The display name for the node.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name for the node.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * List of child node `index`es and their relationship to this parent.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.PlanNode.ChildLink child_links = 4;</code>
   */
  java.util.List<com.google.spanner.v1.PlanNode.ChildLink> getChildLinksList();
  /**
   *
   *
   * <pre>
   * List of child node `index`es and their relationship to this parent.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.PlanNode.ChildLink child_links = 4;</code>
   */
  com.google.spanner.v1.PlanNode.ChildLink getChildLinks(int index);
  /**
   *
   *
   * <pre>
   * List of child node `index`es and their relationship to this parent.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.PlanNode.ChildLink child_links = 4;</code>
   */
  int getChildLinksCount();
  /**
   *
   *
   * <pre>
   * List of child node `index`es and their relationship to this parent.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.PlanNode.ChildLink child_links = 4;</code>
   */
  java.util.List<? extends com.google.spanner.v1.PlanNode.ChildLinkOrBuilder>
      getChildLinksOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of child node `index`es and their relationship to this parent.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.PlanNode.ChildLink child_links = 4;</code>
   */
  com.google.spanner.v1.PlanNode.ChildLinkOrBuilder getChildLinksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Condensed representation for [SCALAR][google.spanner.v1.PlanNode.Kind.SCALAR] nodes.
   * </pre>
   *
   * <code>.google.spanner.v1.PlanNode.ShortRepresentation short_representation = 5;</code>
   *
   * @return Whether the shortRepresentation field is set.
   */
  boolean hasShortRepresentation();
  /**
   *
   *
   * <pre>
   * Condensed representation for [SCALAR][google.spanner.v1.PlanNode.Kind.SCALAR] nodes.
   * </pre>
   *
   * <code>.google.spanner.v1.PlanNode.ShortRepresentation short_representation = 5;</code>
   *
   * @return The shortRepresentation.
   */
  com.google.spanner.v1.PlanNode.ShortRepresentation getShortRepresentation();
  /**
   *
   *
   * <pre>
   * Condensed representation for [SCALAR][google.spanner.v1.PlanNode.Kind.SCALAR] nodes.
   * </pre>
   *
   * <code>.google.spanner.v1.PlanNode.ShortRepresentation short_representation = 5;</code>
   */
  com.google.spanner.v1.PlanNode.ShortRepresentationOrBuilder getShortRepresentationOrBuilder();

  /**
   *
   *
   * <pre>
   * Attributes relevant to the node contained in a group of key-value pairs.
   * For example, a Parameter Reference node could have the following
   * information in its metadata:
   *
   *     {
   *       "parameter_reference": "param1",
   *       "parameter_type": "array"
   *     }
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 6;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Attributes relevant to the node contained in a group of key-value pairs.
   * For example, a Parameter Reference node could have the following
   * information in its metadata:
   *
   *     {
   *       "parameter_reference": "param1",
   *       "parameter_type": "array"
   *     }
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 6;</code>
   *
   * @return The metadata.
   */
  com.google.protobuf.Struct getMetadata();
  /**
   *
   *
   * <pre>
   * Attributes relevant to the node contained in a group of key-value pairs.
   * For example, a Parameter Reference node could have the following
   * information in its metadata:
   *
   *     {
   *       "parameter_reference": "param1",
   *       "parameter_type": "array"
   *     }
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 6;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * The execution statistics associated with the node, contained in a group of
   * key-value pairs. Only present if the plan was returned as a result of a
   * profile query. For example, number of executions, number of rows/time per
   * execution etc.
   * </pre>
   *
   * <code>.google.protobuf.Struct execution_stats = 7;</code>
   *
   * @return Whether the executionStats field is set.
   */
  boolean hasExecutionStats();
  /**
   *
   *
   * <pre>
   * The execution statistics associated with the node, contained in a group of
   * key-value pairs. Only present if the plan was returned as a result of a
   * profile query. For example, number of executions, number of rows/time per
   * execution etc.
   * </pre>
   *
   * <code>.google.protobuf.Struct execution_stats = 7;</code>
   *
   * @return The executionStats.
   */
  com.google.protobuf.Struct getExecutionStats();
  /**
   *
   *
   * <pre>
   * The execution statistics associated with the node, contained in a group of
   * key-value pairs. Only present if the plan was returned as a result of a
   * profile query. For example, number of executions, number of rows/time per
   * execution etc.
   * </pre>
   *
   * <code>.google.protobuf.Struct execution_stats = 7;</code>
   */
  com.google.protobuf.StructOrBuilder getExecutionStatsOrBuilder();
}
