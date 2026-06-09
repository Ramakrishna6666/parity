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
 * Parity Trading System module for Java 21.
 * Provides the core trading system functionality.
 */
module com.paritytrading.parity.system {
    requires com.paritytrading.parity.match;
    requires com.paritytrading.parity.net;
    requires com.paritytrading.foundation;
    requires com.paritytrading.nassau.core;
    requires com.typesafe.config;
    requires it.unimi.dsi.fastutil;
    requires org.jvirtanen.config.extras;
    requires org.jvirtanen.util.extras;
    
    exports com.paritytrading.parity.system;
}
