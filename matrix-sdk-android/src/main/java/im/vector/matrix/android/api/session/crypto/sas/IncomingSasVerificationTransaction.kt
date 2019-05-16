/*
 * Copyright 2019 New Vector Ltd
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

package im.vector.matrix.android.api.session.crypto.sas

interface IncomingSasVerificationTransaction {
    val uxState: UxState

    fun performAccept()

    enum class UxState {
        UNKNOWN,
        SHOW_ACCEPT,
        WAIT_FOR_KEY_AGREEMENT,
        SHOW_SAS,
        WAIT_FOR_VERIFICATION,
        VERIFIED,
        CANCELLED_BY_ME,
        CANCELLED_BY_OTHER
    }
}