package com.seoul.app.zeropay_client.network.response

data class ServerResponse<T> (var code: Int,
                              var message: String?,
                              var body: T? = null)
