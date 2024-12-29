package dev.pablorjd.jetpackcomposeinstagram.login.data.network.model

import com.google.gson.annotations.SerializedName

data class LoginResponse(@SerializedName("isLogin") val success: Boolean )
