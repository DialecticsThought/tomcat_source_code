/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$29 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$29() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SSL_CONF_cmd",
        constants$25.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "SSL_CONF_cmd_value_type",
        constants$12.const$2
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "OPENSSL_init_ssl",
        constants$29.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "ERR_get_error",
        constants$0.const$4
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "ERR_peek_last_error",
        constants$0.const$4
    );
}

