package com.seoul.app.zeropay_client.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserInfoDao{
    @Query("SELECT * FROM userinfo ORDER BY mno")
    fun getAll(): LiveData<UserInfo>

    @Insert
    fun insert(userInfo: UserInfo)

    @Update
    fun update(userInfo: UserInfo)

    @Delete
    fun delete(userInfo: UserInfo)
}