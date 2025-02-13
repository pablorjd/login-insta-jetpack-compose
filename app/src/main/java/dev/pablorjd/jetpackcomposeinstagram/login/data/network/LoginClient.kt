package dev.pablorjd.jetpackcomposeinstagram.login.data.network

import dev.pablorjd.jetpackcomposeinstagram.login.data.network.model.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Path

interface LoginClient {

    @GET(value = "v3/fc524a29-2dfb-48f9-ab33-8fa6f3d41337")
    suspend fun doLogin(
    ): Response<LoginResponse>
}