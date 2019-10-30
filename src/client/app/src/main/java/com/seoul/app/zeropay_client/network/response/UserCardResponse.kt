package com.seoul.app.zeropay_client.network.response

/**
 * mno": 3, "cardNumber": "3838292918182929", "nick": "시으응", "company": "신" }, { "mno": 3, "cardNumber": "2271282710281728", "nick": "콜", "company": "국민" }
 */
data class UserCardResponse (var mno: Int, var cardNumber: String, var nick: String, var company: String)