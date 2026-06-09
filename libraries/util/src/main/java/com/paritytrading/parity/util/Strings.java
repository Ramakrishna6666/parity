/*
 * Copyright 2014 Parity authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.paritytrading.parity.util;

/**
 * Utility class for string operations.
 * Updated to use Java 11+ String.repeat() method for better performance.
 */
class Strings {

    /**
     * Repeat a character count times.
     * Uses Java 11+ String.repeat() for better performance.
     *
     * @param c the character to repeat
     * @param count the number of times to repeat
     * @return a string with the character repeated count times
     */
    static String repeat(char c, int count) {
        return String.valueOf(c).repeat(count);
    }

}
