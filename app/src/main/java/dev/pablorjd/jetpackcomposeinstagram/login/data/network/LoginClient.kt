package dev.pablorjd.jetpackcomposeinstagram.login.data.network

import dev.pablorjd.jetpackcomposeinstagram.login.data.network.model.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Path

interface LoginClient {

    @GET(value = "v3/0220c249-341b-4d3d-b8c3-b2dbb0efaa82")
    suspend fun doLogin(
    ): Response<LoginResponse>
}