/*
 * Copyright 2015 Bryan Emmanuel
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
package com.piusvelte.okoauth;

import android.support.annotation.NonNull;

import java.util.Set;

/**
 * Created by bemmanuel on 6/14/15.
 */
public class RequestTokenRequestBuilder extends RequestBuilder {

    @NonNull
    private String mCallbackUrl;

    public RequestTokenRequestBuilder(@NonNull String consumerKey, @NonNull String consumerSecret, @NonNull String callbackUrl) {
        super(consumerKey, consumerSecret);
        mCallbackUrl = callbackUrl;
    }

    @Override
    protected void onAddOAuthParameters(@NonNull Set<String> parameters) {
        parameters.add(OAuthParameter.oauth_callback.name() + "=" + mCallbackUrl);
    }
}
