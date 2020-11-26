package com.crisav2.obtioniaproject.network.sessionServices

import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface SessionAPI {
    @GET("user")
    fun getUserLoginAsync(): Deferred<UserNetwork>

}