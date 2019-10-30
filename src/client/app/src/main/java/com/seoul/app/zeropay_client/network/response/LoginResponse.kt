package com.seoul.app.zeropay_client.network.response

data class LoginResponse(var mno: Int, var id: String, var name: String, var pwd: String, var phone: String, var payPwd: String, var address: String?, var email: String? )