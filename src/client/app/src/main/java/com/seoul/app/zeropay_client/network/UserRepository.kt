package com.seoul.app.zeropay_client.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object UserRepository {
    private const val BASE_URL = "http://13.209.19.33:8090/"

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