package dev.pablorjd.jetpackcomposeinstagram.login.domain

import dev.pablorjd.jetpackcomposeinstagram.login.data.LoginRepository

class LoginUseCase {

    private val repository = LoginRepository()

    suspend operator fun invoke(username:String, password:String):Boolean {
        return repository.doLoging(username = username, password = password)
    }
}