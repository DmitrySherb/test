package com.example.testapp2.signIn

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testapp2.retrofit.ProductApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SignInViewModel : ViewModel() {
    val liveData: MutableLiveData<String> = MutableLiveData()
    private val productApi = ProductApi.create()

    fun productRequest(id: Int) {

        viewModelScope.launch(Dispatchers.IO) {
            val product = productApi.getProductById(id)
            liveData.postValue(product.title)
        }

    }
}