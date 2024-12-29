package dev.pablorjd.jetpackcomposeinstagram.login.ui

import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {

    private val _email = MutableLiveData<String>()
    val email: LiveData<String> = _email
    
    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password
    
    private val _isEnable = MutableLiveData<Boolean>()
    val isEnable: LiveData<Boolean> = _isEnable

    fun onLoginChanege(email:String, password:String) {
        _email.value = email
        _password.value = password
        _isEnable.value = enableLogin(email, password)
    }
    private fun enableLogin(email: String,password: String):Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches() &&
                password.length > 6
    }

}