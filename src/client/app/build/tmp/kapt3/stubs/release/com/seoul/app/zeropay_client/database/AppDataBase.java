package com.seoul.app.zeropay_client.database;

import java.lang.System;

@androidx.room.Database(entities = {com.seoul.app.zeropay_client.database.UserInfo.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/seoul/app/zeropay_client/database/AppDataBase;", "Landroidx/room/RoomDatabase;", "()V", "UserInfoDao", "Lcom/seoul/app/zeropay_client/database/UserInfoDao;", "app_release"})
public abstract class AppDataBase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.seoul.app.zeropay_client.database.UserInfoDao UserInfoDao();
    
    public AppDataBase() {
        super();
    }
}