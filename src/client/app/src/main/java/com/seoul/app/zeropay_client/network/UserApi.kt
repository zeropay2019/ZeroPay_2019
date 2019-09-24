package com.seoul.app.zeropay_client.network

import com.seoul.app.zeropay_client.model.UserMno
import com.seoul.app.zeropay_client.network.request.*
import com.seoul.app.zeropay_client.network.response.*
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface UserApi {
    //로그인
    @POST("login")
    fun requestLogin(@Body loginRequest: LoginRequest): Call<ServerResponse<LoginResponse>>
    //회원가입
    @POST("register")
    fun requestRegistration(@Body registerUserRequest: RegisterUserRequest): Call<ServerResponse<Any>>
    //아이디찾기
    @POST("searchId")
    fun searchId(@Body searchIdRequest: SearchIdRequest): Call<ServerResponse<FindIdResponse>>
    //비밀번호찾기
    @POST("searchPw")
    fun searchPw(@Body searchPwRequest: SearchPwRequest): Call<ServerResponse<UserPWResponse>>
    //카드등록하기
    @POST("enrollCard")
    fun enrollCard(@Body enrollCardRequest: EnrollCardRequest): Call<ServerResponse<Any>>
    //카드목록가져오기
    @POST("cardList")
    fun getCard(@Body userMno: UserMno): Call<ServerResponse<ArrayList<UserCardResponse?>>>
    //유저정보가져오기
    @POST("memberInfo")
    fun getUserInfo(@Body getCardRequest: GetCardRequest): Call<ServerResponse<UserInfoResponse>>
    //카드삭제하기
    @POST("deleteCard")
    fun deleteCard(@Body deleteCardRequest: DeleteCardRequest): Call<ServerResponse<Any>>
    //가맹점위치가져오기
    @GET("list")
    fun getShopList(@Body shopListRequest: ShopListRequest): Call<ServerResponse<ShopListResponse>>
}