package dev.pablorjd.jetpackcomposeinstagram.login.data.network

import dev.pablorjd.jetpackcomposeinstagram.core.network.model.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

interface LoginClient  {

    @GET(value = "v3/0220c249-341b-4d3d-b8c3-b2dbb0efaa82")
    suspend fun doLogin(user:String, password:String): Response<LoginResponse>
}