/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.tika.batch;

import java.io.InputStream;

import org.apache.tika.metadata.Metadata;

/**
 * Sentinel class for the crawler to add to the queue to let
 * the consumers know that they should shutdown.
 */
class PoisonFileResource implements FileResource {

    /**
     * always returns null
     */
    @Override
    public Metadata getMetadata() {
        return null;
    }

    /**
     * always returns null
     */
    @Override
    public InputStream openInputStream() {
        return null;
    }

    /**
     * always returns null
     */
    @Override
    public String getResourceId() {
        return null;
    }

}
