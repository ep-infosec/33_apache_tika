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

package org.apache.tika.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Locale;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TranslatorExampleTest {
    TranslatorExample translatorExample;

    @BeforeEach
    public void setUp() {
        translatorExample = new TranslatorExample();
    }

    @Test
    public void testMicrosoftTranslateToFrench() {
        String text = "hello";
        String expected = "salut";
        String translated = translatorExample.microsoftTranslateToFrench(text);
        // The user may not have set the id and secret. So, we have to check if we just
        // got the same text back.
        if (!translated.equals(text)) {
            assertEquals(expected, translated.toLowerCase(Locale.ROOT));
        }
    }
}
