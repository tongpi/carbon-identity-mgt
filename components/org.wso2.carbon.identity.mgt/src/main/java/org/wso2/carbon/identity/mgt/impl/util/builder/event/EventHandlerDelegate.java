/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.mgt.impl.util.builder.event;


import org.wso2.carbon.identity.mgt.exception.UserNotFoundException;

/**
 * Functional interface to be used to execute the main logic in the interceptor after firing PRE-events
 * and before firing POST-events.
 * @param <T> Handler delegate type.
 */
@FunctionalInterface
public interface EventHandlerDelegate<T> {

    /**
     * The primary task needs to be implemented in the execute method.
     *
     * @param <X1> Generics exception.
     * @return the value of generic type T
     * @throws X1 which is a "generics" exception
     */
    <X1 extends Exception> T execute() throws X1, UserNotFoundException;
}
