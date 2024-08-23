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
// source: google/spanner/admin/database/v1/backup.proto

// Protobuf Java Version: 3.25.4
package com.google.spanner.admin.database.v1;

public interface CreateBackupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.database.v1.CreateBackupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the instance in which the backup will be
   * created. This must be the same instance that contains the database the
   * backup will be created from. The backup will be stored in the
   * location(s) specified in the instance configuration of this
   * instance. Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the instance in which the backup will be
   * created. This must be the same instance that contains the database the
   * backup will be created from. The backup will be stored in the
   * location(s) specified in the instance configuration of this
   * instance. Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The id of the backup to be created. The `backup_id` appended to
   * `parent` forms the full backup name of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/backups/&lt;backup_id&gt;`.
   * </pre>
   *
   * <code>string backup_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The backupId.
   */
  java.lang.String getBackupId();
  /**
   *
   *
   * <pre>
   * Required. The id of the backup to be created. The `backup_id` appended to
   * `parent` forms the full backup name of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/backups/&lt;backup_id&gt;`.
   * </pre>
   *
   * <code>string backup_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for backupId.
   */
  com.google.protobuf.ByteString getBackupIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The backup to create.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.Backup backup = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the backup field is set.
   */
  boolean hasBackup();
  /**
   *
   *
   * <pre>
   * Required. The backup to create.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.Backup backup = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The backup.
   */
  com.google.spanner.admin.database.v1.Backup getBackup();
  /**
   *
   *
   * <pre>
   * Required. The backup to create.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.Backup backup = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.spanner.admin.database.v1.BackupOrBuilder getBackupOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The encryption configuration used to encrypt the backup. If this
   * field is not specified, the backup will use the same encryption
   * configuration as the database by default, namely
   * [encryption_type][google.spanner.admin.database.v1.CreateBackupEncryptionConfig.encryption_type]
   * = `USE_DATABASE_ENCRYPTION`.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.CreateBackupEncryptionConfig encryption_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the encryptionConfig field is set.
   */
  boolean hasEncryptionConfig();
  /**
   *
   *
   * <pre>
   * Optional. The encryption configuration used to encrypt the backup. If this
   * field is not specified, the backup will use the same encryption
   * configuration as the database by default, namely
   * [encryption_type][google.spanner.admin.database.v1.CreateBackupEncryptionConfig.encryption_type]
   * = `USE_DATABASE_ENCRYPTION`.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.CreateBackupEncryptionConfig encryption_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The encryptionConfig.
   */
  com.google.spanner.admin.database.v1.CreateBackupEncryptionConfig getEncryptionConfig();
  /**
   *
   *
   * <pre>
   * Optional. The encryption configuration used to encrypt the backup. If this
   * field is not specified, the backup will use the same encryption
   * configuration as the database by default, namely
   * [encryption_type][google.spanner.admin.database.v1.CreateBackupEncryptionConfig.encryption_type]
   * = `USE_DATABASE_ENCRYPTION`.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.CreateBackupEncryptionConfig encryption_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.spanner.admin.database.v1.CreateBackupEncryptionConfigOrBuilder
      getEncryptionConfigOrBuilder();
}
