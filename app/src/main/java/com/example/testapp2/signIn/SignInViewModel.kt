package com.example.testapp2.signIn

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignInViewModel : ViewModel() {
    val liveData: MutableLiveData<String> = MutableLiveData()

    fun rename(email: String) {
        liveData.value = email
    }
}