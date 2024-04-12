package com.example.cleantodoapp.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel: ViewModel() {
    val errorLivedata: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}