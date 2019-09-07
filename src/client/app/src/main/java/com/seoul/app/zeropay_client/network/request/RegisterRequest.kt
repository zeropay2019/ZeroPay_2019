package com.seoul.app.zeropay_client.network.request

data class RegisterRequest(val id: String, val name: String, val pwd: String, val phone: String,
                           val payPwd: String, val country: String, val address: String, val email: String)