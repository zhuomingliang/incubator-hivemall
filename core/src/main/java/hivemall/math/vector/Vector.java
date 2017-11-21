/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package hivemall.math.vector;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

public interface Vector {

    public double get(@Nonnegative int index);

    public float get(@Nonnegative int index, float defaultValue);

    public double get(@Nonnegative int index, double defaultValue);

    /**
     * @throws UnsupportedOperationException
     */
    public void set(@Nonnegative int index, double value);

    /**
     * @throws UnsupportedOperationException
     */
    public void set(@Nonnegative int index, float value);

    public void incr(@Nonnegative int index, double delta);

    public void each(@Nonnull VectorProcedure procedure);

    public int size();

    public void clear();

    @Nonnull
    public double[] toArray();

}