package com.seoul.app.zeropay_client.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object UserNetwork {
    private const val BASE_URL = "localhost:8080/mem/"

    private lateinit var userApiImpl: UserApi

    init {
        buildRetrofit()
    }

    fun getInstance(): UserApi {
        return userApiImpl
    }

    private fun buildRetrofit() {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        userApiImpl = retrofit.create(UserApi::class.java)
    }
}