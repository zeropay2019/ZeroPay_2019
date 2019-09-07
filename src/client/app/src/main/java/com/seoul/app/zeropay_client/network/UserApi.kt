package com.seoul.app.zeropay_client.network

import com.seoul.app.zeropay_client.network.request.LoginRequest
import com.seoul.app.zeropay_client.network.request.RegisterRequest
import com.seoul.app.zeropay_client.network.request.SearchIdRequest
import com.seoul.app.zeropay_client.network.request.SearchPwRequest
import com.seoul.app.zeropay_client.network.response.ServerResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {
    //로그인
    @POST("login/")
    fun requestLogin(@Body loginRequest: LoginRequest): Call<ServerResponse>
    //회원가입
    @POST("register/")
    fun requestRegist(@Body registerRequest: RegisterRequest): Call<ServerResponse>
    //아이디찾기
    @POST("searchId/")
    fun searchId(@Body searchIdRequest: SearchIdRequest): Call<ServerResponse>
    //비밀번호찾기
    @POST("searchPw/")
    fun searchPw(@Body searchPwRequest: SearchPwRequest): Call<ServerResponse>
}