package com.seoul.app.zeropay_client.network

import com.seoul.app.zeropay_client.network.request.*
import com.seoul.app.zeropay_client.network.response.ServerResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {
    //로그인
    @POST("login")
    fun requestLogin(@Body loginRequest: LoginRequest): Call<ServerResponse>
    //회원가입
    @POST("register")
    fun requestRegistration(@Body registerUserRequest: RegisterUserRequest): Call<ServerResponse>
    //아이디찾기
    @POST("searchId")
    fun searchId(@Body searchIdRequest: SearchIdRequest): Call<ServerResponse>
    //비밀번호찾기
    @POST("searchPw")
    fun searchPw(@Body searchPwRequest: SearchPwRequest): Call<ServerResponse>
    //카드등록하기
    @POST("enrollCard")
    fun enrollCard(@Body enrollCardRequest: EnrollCardRequest): Call<ServerResponse>
    //카드목록가져오기
    @POST("cardList")
    fun getCard(@Body getCardRequest: GetCardRequest): Call<ServerResponse>
}