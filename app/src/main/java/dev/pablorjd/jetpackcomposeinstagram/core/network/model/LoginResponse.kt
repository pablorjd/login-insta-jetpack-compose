package dev.pablorjd.jetpackcomposeinstagram.core.network.model

import com.google.gson.annotations.SerializedName

data class LoginResponse(@SerializedName("isLogin") val success: Boolean )
