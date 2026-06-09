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

/**
 * Parity Order Book module for Java 21+.
 * 
 * <p>This module provides high-performance order book reconstruction and management
 * for the Parity Trading System. It includes support for order lifecycle management,
 * market data updates, and trade execution tracking.</p>
 * 
 * @since 0.7.1
 */
module com.paritytrading.parity.book {
    requires it.unimi.dsi.fastutil;
    
    exports com.paritytrading.parity.book;
}
