package dev.pablorjd.jetpackcomposeinstagram.login.data.network

import dev.pablorjd.jetpackcomposeinstagram.core.network.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import javax.inject.Inject

class LoginService @Inject constructor(private val provideLoginCLient: LoginClient) {

//    private val retrofit = RetrofitHelper.getRetrofit()
    suspend fun doLogin(username: String, password: String): Boolean {
        return withContext(Dispatchers.IO) {
//            val response = retrofit.create(LoginClient::class.java).doLogin()
            val response = provideLoginCLient.doLogin()
            response.body()?.success ?: false
        }
    }
}