package dev.pablorjd.jetpackcomposeinstagram.login.data

import dev.pablorjd.jetpackcomposeinstagram.login.data.network.LoginService

class LoginRepository {

    private val api = LoginService()

    suspend fun doLoging(username:String, password:String): Boolean {
        return api.doLogin(username, password)
    }
}