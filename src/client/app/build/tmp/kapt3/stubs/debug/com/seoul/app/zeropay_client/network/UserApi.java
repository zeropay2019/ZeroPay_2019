package com.seoul.app.zeropay_client.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J2\u0010\n\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\f`\r0\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\'J8\u0010\u0010\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00110\u000bj\b\u0012\u0004\u0012\u00020\u0011`\r0\u00040\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\'J\u001e\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00040\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\'J\u001e\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00040\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'J\u001e\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u001e\u001a\u00020\u001fH\'J\u001e\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00040\u00032\b\b\u0001\u0010\"\u001a\u00020#H\'J\u001e\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00040\u00032\b\b\u0001\u0010&\u001a\u00020\'H\'\u00a8\u0006("}, d2 = {"Lcom/seoul/app/zeropay_client/network/UserApi;", "", "deleteCard", "Lretrofit2/Call;", "Lcom/seoul/app/zeropay_client/network/response/ServerResponse;", "deleteCardRequest", "Lcom/seoul/app/zeropay_client/network/request/DeleteCardRequest;", "enrollCard", "enrollCardRequest", "Lcom/seoul/app/zeropay_client/network/request/EnrollCardRequest;", "getCard", "Ljava/util/ArrayList;", "Lcom/seoul/app/zeropay_client/network/response/UserCardResponse;", "Lkotlin/collections/ArrayList;", "userMno", "Lcom/seoul/app/zeropay_client/model/UserMno;", "getShopList", "Lcom/seoul/app/zeropay_client/network/response/ShopListResponse;", "lat", "", "lon", "getUserInfo", "Lcom/seoul/app/zeropay_client/network/response/UserInfoResponse;", "getCardRequest", "Lcom/seoul/app/zeropay_client/network/request/GetCardRequest;", "requestLogin", "Lcom/seoul/app/zeropay_client/network/response/LoginResponse;", "loginRequest", "Lcom/seoul/app/zeropay_client/network/request/LoginRequest;", "requestRegistration", "registerUserRequest", "Lcom/seoul/app/zeropay_client/network/request/RegisterUserRequest;", "searchId", "Lcom/seoul/app/zeropay_client/network/response/FindIdResponse;", "searchIdRequest", "Lcom/seoul/app/zeropay_client/network/request/SearchIdRequest;", "searchPw", "Lcom/seoul/app/zeropay_client/network/response/UserPWResponse;", "searchPwRequest", "Lcom/seoul/app/zeropay_client/network/request/SearchPwRequest;", "app_debug"})
public abstract interface UserApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "mem/login")
    public abstract retrofit2.Call<com.seoul.app.zeropay_client.network.response.ServerResponse<com.seoul.app.zeropay_client.network.response.LoginResponse>> requestLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.seoul.app.zeropay_client.network.request.LoginRequest loginRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "mem/register")
    public abstract retrofit2.Call<com.seoul.app.zeropay_client.network.response.ServerResponse<java.lang.Object>> requestRegistration(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.seoul.app.zeropay_client.network.request.RegisterUserRequest registerUserRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "mem/searchId")
    public abstract retrofit2.Call<com.seoul.app.zeropay_client.network.response.ServerResponse<com.seoul.app.zeropay_client.network.response.FindIdResponse>> searchId(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.seoul.app.zeropay_client.network.request.SearchIdRequest searchIdRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "mem/searchPw")
    public abstract retrofit2.Call<com.seoul.app.zeropay_client.network.response.ServerResponse<com.seoul.app.zeropay_client.network.response.UserPWResponse>> searchPw(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.seoul.app.zeropay_client.network.request.SearchPwRequest searchPwRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "mem/enrollCard")
    public abstract retrofit2.Call<com.seoul.app.zeropay_client.network.response.ServerResponse<java.lang.Object>> enrollCard(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.seoul.app.zeropay_client.network.request.EnrollCardRequest enrollCardRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "mem/cardList")
    public abstract retrofit2.Call<com.seoul.app.zeropay_client.network.response.ServerResponse<java.util.ArrayList<com.seoul.app.zeropay_client.network.response.UserCardResponse>>> getCard(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.seoul.app.zeropay_client.model.UserMno userMno);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "mem/memberInfo")
    public abstract retrofit2.Call<com.seoul.app.zeropay_client.network.response.ServerResponse<com.seoul.app.zeropay_client.network.response.UserInfoResponse>> getUserInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.seoul.app.zeropay_client.network.request.GetCardRequest getCardRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "mem/deleteCard")
    public abstract retrofit2.Call<com.seoul.app.zeropay_client.network.response.ServerResponse<java.lang.Object>> deleteCard(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.seoul.app.zeropay_client.network.request.DeleteCardRequest deleteCardRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "mar/list")
    public abstract retrofit2.Call<com.seoul.app.zeropay_client.network.response.ServerResponse<java.util.ArrayList<com.seoul.app.zeropay_client.network.response.ShopListResponse>>> getShopList(@retrofit2.http.Query(value = "lat")
    double lat, @retrofit2.http.Query(value = "lon")
    double lon);
}