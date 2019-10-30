package com.seoul.app.zeropay_client.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserInfo(@PrimaryKey var mno: Int, var id: String, var name: String, var pwd: String, var phone: String, var payPwd: String, var address: String?, var email: String?)
