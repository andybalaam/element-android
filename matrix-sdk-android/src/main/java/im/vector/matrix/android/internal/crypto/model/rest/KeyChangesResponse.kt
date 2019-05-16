/*
 * Copyright 2017 Vector Creations Ltd
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
package im.vector.matrix.android.internal.crypto.model.rest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * This class describes the key changes response
 */
@JsonClass(generateAdapter = true)
data class KeyChangesResponse(
        // list of user ids which have new devices
        @Json(name = "changed")
        var changed: List<String>? = null,

        //  List of user ids who are no more tracked.
        @Json(name = "left")
        var left: List<String>? = null
)
