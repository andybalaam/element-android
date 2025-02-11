/*
 * Copyright (c) 2021 New Vector Ltd
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

package im.vector.app.features.spaces.manage

import io.reactivex.functions.Predicate
import org.matrix.android.sdk.api.extensions.orFalse
import org.matrix.android.sdk.api.session.room.model.SpaceChildInfo

class SpaceChildInfoMatchFilter : Predicate<SpaceChildInfo> {
    var filter: String = ""

    override fun test(spaceChildInfo: SpaceChildInfo): Boolean {
        if (filter.isEmpty()) {
            // No filter
            return true
        }
        // if filter is "Jo Do", it should match "John Doe"
        return filter.split(" ").all {
            spaceChildInfo.name?.contains(it, ignoreCase = true).orFalse() ||
                    spaceChildInfo.topic?.contains(it, ignoreCase = true).orFalse()
        }
    }
}
