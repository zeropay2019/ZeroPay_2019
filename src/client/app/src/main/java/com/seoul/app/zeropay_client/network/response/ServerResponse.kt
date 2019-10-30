package com.seoul.app.zeropay_client.network.response

data class ServerResponse<T>(var resultCode: Int, var message: String, var param: T? = null)

