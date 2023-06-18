package com.example.testapp2.authentication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testapp2.retrofit.AuthRequest
import com.example.testapp2.retrofit.AuthenticationApi
import com.example.testapp2.retrofit.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AuthenticationViewModel : ViewModel() {
    val liveData: MutableLiveData<User> = MutableLiveData()
    private val authenticationApi = AuthenticationApi.create()

    fun authRequest(username: String, password: String) {

        viewModelScope.launch(Dispatchers.IO) {
            val user = authenticationApi.auth(
                AuthRequest(
                    username = username,
                    password = password
                )
            )
            liveData.postValue(user)

        }

    }
}