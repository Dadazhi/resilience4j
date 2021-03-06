/*
 * Copyright 2017 Bohdan Storozhuk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.resilience4j.ratelimiter.monitoring.model;

import java.util.List;


public class RateLimiterEndpointResponse {

    private List<String> rateLimitersNames;

    // created for spring to be able to construct POJO
    public RateLimiterEndpointResponse() {}

    public RateLimiterEndpointResponse(List<String> rateLimitersNames) {
        this.rateLimitersNames = rateLimitersNames;
    }

    public List<String> getRateLimitersNames() {
        return rateLimitersNames;
    }

    public void setRateLimitersNames(List<String> rateLimitersNames) {
        this.rateLimitersNames = rateLimitersNames;
    }
}
