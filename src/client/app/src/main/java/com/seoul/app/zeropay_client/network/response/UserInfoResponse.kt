package com.seoul.app.zeropay_client.network.response

/*
{ "resultCode": 0, "message": "success", "param":
{ "mno": 3, "id": "test", "name": "이종민2", "pwd": "tnthd2351", "phone": "01095490520", "payPwd": "052500", "address": null, "email": null }
* */
data class UserInfoResponse(var mno: Int, var id: String, var name: String, var pwd: String, var phone: String, var payPwd: String, var address: String, var email: String)
