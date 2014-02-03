/*
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

package com.github.pgasync.impl.message;

public class Startup implements Message {

    final int protocol = 196608;
    final String username;
    final String database;

    public Startup(String username, String database) {
        this.username = username;
        this.database = database;
    }

    public int getProtocol() {
        return protocol;
    }

    public String getUsername() {
        return username;
    }

    public String getDatabase() {
        return database;
    }
}