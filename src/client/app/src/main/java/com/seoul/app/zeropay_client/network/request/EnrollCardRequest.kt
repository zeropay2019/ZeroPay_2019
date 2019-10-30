package com.seoul.app.zeropay_client.network.request

/*
요청 URL : /mem/enrollCard
method : POST
parameter : mno, cardNumber, nick, company
return : <성공시> { "resultCode": 0, "message": "success", "param": null }
<실패시> { "resultCode": 104, "message": "카드등록에 실패 했습니다.", "param": null }
* */

data class EnrollCardRequest(var mno: Int, var cardNumber: String, var nick: String, var company: String)