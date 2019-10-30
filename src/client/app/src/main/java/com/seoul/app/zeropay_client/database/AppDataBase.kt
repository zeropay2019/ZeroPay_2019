package com.seoul.app.zeropay_client.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [UserInfo::class], version = 1)
abstract class AppDataBase : RoomDatabase(){
    abstract fun UserInfoDao(): UserInfoDao
}