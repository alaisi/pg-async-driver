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

package com.github.pgasync;

import com.github.pgasync.callback.ErrorHandler;
import com.github.pgasync.callback.TransactionCompletedHandler;

/**
 * A unit of work. Transactions must be commited or rolled back, otherwise
 * a connection left is a stale state.
 * 
 * @author Antti Laisi
 */
public interface Transaction {

    /**
     * Commits a transaction.
     * 
     * @param onCompleted Called when commit completes
     * @param onError Called on exception thrown
     */
	void commit(TransactionCompletedHandler onCompleted, ErrorHandler onError);

	/**
	 * Rollbacks a transaction.
	 * 
	 * @param onCompleted Called when rollback completes
	 * @param onError Called on exception thrown
	 */
	void rollback(TransactionCompletedHandler onCompleted, ErrorHandler onError);

}