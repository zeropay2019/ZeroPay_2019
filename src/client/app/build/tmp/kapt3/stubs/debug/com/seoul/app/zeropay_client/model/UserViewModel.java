package com.seoul.app.zeropay_client.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010#\u001a\u00020$J\u000e\u0010\u001c\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020%J\u0006\u0010&\u001a\u00020$J\u0006\u0010\'\u001a\u00020$J\u000e\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\fJ\u0006\u0010-\u001a\u00020$R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR&\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR(\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/seoul/app/zeropay_client/model/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "buttonState", "Landroidx/lifecycle/MutableLiveData;", "", "getButtonState", "()Landroidx/lifecycle/MutableLiveData;", "setButtonState", "(Landroidx/lifecycle/MutableLiveData;)V", "list", "Ljava/util/ArrayList;", "", "payPwd", "getPayPwd", "setPayPwd", "transactionNumList", "getTransactionNumList", "setTransactionNumList", "transactionPassword", "getTransactionPassword", "setTransactionPassword", "transactionPasswordLength", "", "getTransactionPasswordLength", "setTransactionPasswordLength", "userCardList", "Lcom/seoul/app/zeropay_client/network/response/UserCardResponse;", "getUserCardList", "setUserCardList", "userMno", "getUserMno", "setUserMno", "userNetWork", "Lcom/seoul/app/zeropay_client/network/UserApi;", "deletePassword", "", "Lcom/seoul/app/zeropay_client/model/UserMno;", "initList", "initViewModels", "registerUserCard", "enrollCardRequest", "Lcom/seoul/app/zeropay_client/network/request/EnrollCardRequest;", "setPassword", "clickedNumber", "shuffleList", "Companion", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> transactionNumList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> transactionPassword;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> transactionPasswordLength;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> payPwd;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> buttonState;
    private final java.util.ArrayList<java.lang.String> list = null;
    private com.seoul.app.zeropay_client.network.UserApi userNetWork;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.seoul.app.zeropay_client.network.response.UserCardResponse>> userCardList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> userMno;
    private static final int PASSWORD_LENGTH = 4;
    public static final com.seoul.app.zeropay_client.model.UserViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getTransactionNumList() {
        return null;
    }
    
    public final void setTransactionNumList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTransactionPassword() {
        return null;
    }
    
    public final void setTransactionPassword(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getTransactionPasswordLength() {
        return null;
    }
    
    public final void setTransactionPasswordLength(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPayPwd() {
        return null;
    }
    
    public final void setPayPwd(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getButtonState() {
        return null;
    }
    
    public final void setButtonState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.seoul.app.zeropay_client.network.response.UserCardResponse>> getUserCardList() {
        return null;
    }
    
    public final void setUserCardList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.seoul.app.zeropay_client.network.response.UserCardResponse>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getUserMno() {
        return null;
    }
    
    public final void setUserMno(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    public final void initList() {
    }
    
    public final void initViewModels() {
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String clickedNumber) {
    }
    
    public final void deletePassword() {
    }
    
    public final void shuffleList() {
    }
    
    public final void registerUserCard(@org.jetbrains.annotations.NotNull()
    com.seoul.app.zeropay_client.network.request.EnrollCardRequest enrollCardRequest) {
    }
    
    public final void getUserCardList(@org.jetbrains.annotations.NotNull()
    com.seoul.app.zeropay_client.model.UserMno userMno) {
    }
    
    public UserViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/seoul/app/zeropay_client/model/UserViewModel$Companion;", "", "()V", "PASSWORD_LENGTH", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}