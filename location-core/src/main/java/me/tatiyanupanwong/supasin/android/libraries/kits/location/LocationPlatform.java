/*
 * Copyright 2020 Supasin Tatiyanupanwong
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

package me.tatiyanupanwong.supasin.android.libraries.kits.location;

import androidx.annotation.NonNull;

import me.tatiyanupanwong.supasin.android.libraries.kits.location.internal.LocationFactory;

/**
 * @since 1.0.0
 */
public final class LocationPlatform {

    private static LocationPlatform sPlatform;
    @NonNull
    private final LocationFactory factory;

    public static synchronized void init(@NonNull LocationFactory factory) {
        sPlatform = new LocationPlatform(factory);
    }


    static synchronized LocationPlatform get() {
        return sPlatform;
    }

    private LocationPlatform(@NonNull LocationFactory factory) {
        this.factory = factory;
    }

    @NonNull public LocationFactory getFactory() {
        return factory;
    }
}
