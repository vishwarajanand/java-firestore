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

public interface AggregateSnapshot {

  @Nonnull
  Timestamp getReadTime();

  @Nonnull
  Map<AggregateField, Object> getAggregations();

  boolean contains(@Nonnull AggregateField field);

  @Nullable
  Object get(@Nonnull AggregateField field);

  @Nullable
  <T> T get(@Nonnull AggregateField field, @Nonnull Class<T> valueType);

  // Overload get() specifically for COUNT since it has a well-defined type (i.e. long).
  @Nullable
  Long get(@Nonnull AggregateField.CountAggregateField field);

  // Overload get() specifically for SUM since it has a well-defined type (i.e. double).
  @Nullable
  Double get(@Nonnull AggregateField.SumAggregateField field);

  // Overload get() specifically for AVERAGE since it has a well-defined type (i.e. double).
  @Nullable
  Double get(@Nonnull AggregateField.AverageAggregateField field);

  @Nullable
  Boolean getBoolean(@Nonnull AggregateField field);

  @Nullable
  Double getDouble(@Nonnull AggregateField field);

  @Nullable
  String getString(@Nonnull AggregateField field);

  @Nullable
  Long getLong(@Nonnull AggregateField field);

  @Nullable
  Date getDate(@Nonnull AggregateField field);

  @Nullable
  Timestamp getTimestamp(@Nonnull AggregateField field);

  @Nullable
  Blob getBlob(@Nonnull AggregateField field);

  @Nullable
  GeoPoint getGeoPoint(@Nonnull AggregateField field);

  @Override
  boolean equals(Object obj);

  @Override
  int hashCode();
}
