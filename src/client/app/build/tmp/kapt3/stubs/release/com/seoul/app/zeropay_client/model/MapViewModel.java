package com.seoul.app.zeropay_client.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/seoul/app/zeropay_client/model/MapViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "responseShopList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/seoul/app/zeropay_client/network/response/ShopListResponse;", "getResponseShopList", "()Landroidx/lifecycle/MutableLiveData;", "setResponseShopList", "(Landroidx/lifecycle/MutableLiveData;)V", "userNetWork", "Lcom/seoul/app/zeropay_client/network/UserApi;", "getShopList", "", "shopListRequest", "Lcom/seoul/app/zeropay_client/network/request/ShopListRequest;", "app_release"})
public final class MapViewModel extends androidx.lifecycle.ViewModel {
    private com.seoul.app.zeropay_client.network.UserApi userNetWork;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.seoul.app.zeropay_client.network.response.ShopListResponse>> responseShopList;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.seoul.app.zeropay_client.network.response.ShopListResponse>> getResponseShopList() {
        return null;
    }
    
    public final void setResponseShopList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.seoul.app.zeropay_client.network.response.ShopListResponse>> p0) {
    }
    
    public final void getShopList(@org.jetbrains.annotations.NotNull()
    com.seoul.app.zeropay_client.network.request.ShopListRequest shopListRequest) {
    }
    
    public MapViewModel() {
        super();
    }
}