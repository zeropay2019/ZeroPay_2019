package com.seoul.app.zeropay_client.network.request

/*
요청 URL : /mem/cardList
method : POST
parameter : mno
return : <성공시> { "resultCode": 0, "message": "success", "param": [ { "mno": 3, "cardNumber": "3838292918182929", "nick": "시으응", "company": "신" }, { "mno": 3, "cardNumber": "2271282710281728", "nick": "콜", "company": "국민" } ] }
<실패시> { "resultCode": 105, "message": "카드 리스트 찾기에 실패했습니다.", "param": null }
* */

data class GetCardRequest (var mno: Int)