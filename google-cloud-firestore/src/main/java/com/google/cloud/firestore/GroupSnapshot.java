/*
 * Copyright 2022 Google LLC
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

import com.google.cloud.Timestamp;
import java.util.Date;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface GroupSnapshot extends AggregateSnapshot {

  @Nonnull
  Map<FieldPath, Object> getFields();

  boolean contains(@Nonnull String field);

  boolean contains(@Nonnull FieldPath field);

  @Nullable
  Object get(@Nonnull String field);

  @Nullable
  <T> T get(@Nonnull String field, @Nonnull Class<T> valueType);

  @Nullable
  Object get(@Nonnull FieldPath field);

  @Nullable
  <T> T get(@Nonnull FieldPath field, @Nonnull Class<T> valueType);

  @Nullable
  Boolean getBoolean(@Nonnull String field);

  @Nullable
  Boolean getBoolean(@Nonnull FieldPath field);

  @Nullable
  Double getDouble(@Nonnull String field);

  @Nullable
  Double getDouble(@Nonnull FieldPath field);

  @Nullable
  String getString(@Nonnull String field);

  @Nullable
  String getString(@Nonnull FieldPath field);

  @Nullable
  Long getLong(@Nonnull String field);

  @Nullable
  Long getLong(@Nonnull FieldPath field);

  @Nullable
  Date getDate(@Nonnull String field);

  @Nullable
  Date getDate(@Nonnull FieldPath field);

  @Nullable
  Timestamp getTimestamp(@Nonnull String field);

  @Nullable
  Timestamp getTimestamp(@Nonnull FieldPath field);

  @Nullable
  Blob getBlob(@Nonnull String field);

  @Nullable
  Blob getBlob(@Nonnull FieldPath field);

  @Nullable
  GeoPoint getGeoPoint(@Nonnull String field);

  @Nullable
  GeoPoint getGeoPoint(@Nonnull FieldPath field);
}
