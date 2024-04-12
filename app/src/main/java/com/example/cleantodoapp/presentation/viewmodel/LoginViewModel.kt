package com.example.cleantodoapp.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {

    val emailErrorLiveData: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    val passwordErrorLiveData: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    fun validateFormAndLogin(email: String?, password: String?) {
        if (email.isNullOrEmpty()) {
            emailErrorLiveData.value = "Empty email"
            return
        }

        if (password.isNullOrEmpty()) {
            passwordErrorLiveData.value = "Empty password"
            return
        }

        viewModelScope.launch {
            login(email, password)
        }


    }

    private suspend fun login(email: String?, password: String?) {
        delay(2000)
        Log.d("Loggin", "loggin!")
    }
}