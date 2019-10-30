package com.seoul.app.zeropay_client.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\n"}, d2 = {"Lcom/seoul/app/zeropay_client/database/UserInfoDao;", "", "delete", "", "userInfo", "Lcom/seoul/app/zeropay_client/database/UserInfo;", "getAll", "Landroidx/lifecycle/LiveData;", "insert", "update", "app_release"})
public abstract interface UserInfoDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM userinfo ORDER BY mno")
    public abstract androidx.lifecycle.LiveData<com.seoul.app.zeropay_client.database.UserInfo> getAll();
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.seoul.app.zeropay_client.database.UserInfo userInfo);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.seoul.app.zeropay_client.database.UserInfo userInfo);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.seoul.app.zeropay_client.database.UserInfo userInfo);
}