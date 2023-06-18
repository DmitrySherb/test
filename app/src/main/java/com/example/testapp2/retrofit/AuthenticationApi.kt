package com.example.testapp2.retrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface AuthenticationApi {


    @POST("auth/login")
    suspend fun auth(@Body authRequest: AuthRequest): User
    @GET("products")
    suspend fun getAllProducts():Products

    companion object {
        fun create(): AuthenticationApi {

            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY

            val client = OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build()

            val retrofit = Retrofit.Builder()
                .baseUrl("https://dummyjson.com/").client(client)
                .addConverterFactory(GsonConverterFactory.create()).build()
            return retrofit.create(AuthenticationApi::class.java)
        }

    }
}