# ZeroPay_2019

## 1. 로그인
- 요청 URL : /mem/login
- method : POST
- parameter : id, pwd
- return : 

<성공시> 
{
    "resultCode": 0,
    "message": "success",
    "param": {
        "mno": 3,
        "id": "test",
        "name": "이종민2",
        "pwd": "tnthd2351",
        "phone": "01095490520",
        "payPwd": "052500",
        "address": null,
        "email": null
    }
}

<실패시>
{
    "resultCode": 100,
    "message": "존재하지 않은 사용자입니다.",
    "param": null
}

<br />

## 2. 회원가입
- 요청 URL : /mem/register
- method : POST
- parameter : id, name, pwd, phone, paypwd, address, email
- return :

<성공시>
{
    "resultCode": 0,
    "message": "success",
    "param": null
}

<실패시>
{
    "resultCode": 101,
    "message": "회원가입에 실패했습니다",
    "param": null
}

<br />

## 3. 아이디 찾기
- 요청 URL : /mem/searchId
- method : POST
- parameter : name, phone
- return :

<성공시>
{
    "resultCode": 0,
    "message": "success",
    "param": "test" // 아이디
}

<실패시>
{
    "resultCode": 102,
    "message": "일치하는 ID가 존재하지 않습니다.",
    "param": null
}

<br />

## 4. 비밀번호 찾기
- 요청 URL : /mem/searchPw
- method : POST
- parameter : id, name, phone
- return :

<성공시>
{
    "resultCode": 0,
    "message": "success",
    "param": "tnthd2351" // 비밀번호
}

<실패시>
{
    "resultCode": 103,
    "message": "일치하는 비밀번호가 존재하지 않습니다.",
    "param": null
}

<br />

## 5. 카드등록
- 요청 URL : /mem/enrollCard
- method : POST
- parameter : mno, cardNumber, nick, company
- return :
<성공시>
{
    "resultCode": 0,
    "message": "success",
    "param": null
}

<실패시>
{
    "resultCode": 104,
    "message": "카드등록에 실패 했습니다.",
    "param": null
}

<br />

## 6. 사용자 카드 목록
- 요청 URL : /mem/cardList
- method : POST
- parameter : mno
- return :
<성공시>
{
    "resultCode": 0,
    "message": "success",
    "param": [
        {
            "mno": 3,
            "cardNumber": "3838292918182929",
            "nick": "시으응",
            "company": "신"
        },
        {
            "mno": 3,
            "cardNumber": "2271282710281728",
            "nick": "콜",
            "company": "국민"
        }
    ]
}

<실패시>
{
    "resultCode": 105,
    "message": "카드 리스트 찾기에 실패했습니다.",
    "param": null
}
<br />

## 7. 사용자 정보 출력
- 요청 URL : /mem/memberInfo
- method : POST
- parameter : id
- return :

<성공시>
{
    "resultCode": 0,
    "message": "success",
    "param": {
        "mno": 3,
        "id": "test",
        "name": "이종민2",
        "pwd": "tnthd2351",
        "phone": "01095490520",
        "payPwd": "052500",
        "address": null,
        "email": null
    }
}

<실패시>
{
    "resultCode": 106,
    "message": "회원정보 출력에 실패했습니다.",
    "param": null
}

<br />

## 8. 카드 삭제
- URL : /mem/deleteCard
- method : POST
- parameter : mno, cardNUmber
- return :

<성공시>
{
    "resultCode": 0,
    "message": "success",
    "param": null
}

<실패시>
{
    "resultCode": 108,
    "message": "카드 삭제에 실패했습니다.",
    "param": null
}

<br />

## 9. 가맹점 리스트
- URL : /mar/list
- method : GET
- parameter : lat(위도), lon(경도)
- // 600m 이내에 있는 것 출력
- return :

<성공시>
{
    "resultCode": 0,
    "message": "success",
    "param": [
        {
            "marketName": "또바기",
            "address": "서울 은평구 연서로29길 7-12 지층",
            "category": "포장마차",
            "lat": 37.6183579,
            "lon": 126.918985
        },
        {
            "marketName": "해오름달",
            "address": "서울 은평구 연서로29길 7-10",
            "category": "바(BAR)",
            "lat": 37.6184537,
            "lon": 126.919054
        }
    ]
}

<실패시>
{
    "resultCode": 106,
    "message": "회원정보 출력에 실패했습니다.",
    "param": null
}

<br />

## 10. 공지사항 리스트
- URL : /board/list
- method : GET
- parameter : none(없음)
- return :

<성공시>
{
    "resultCode": 0,
    "message": "success",
    "param": [
        {
            "bno": 1,
            "title": "(중요) 제로페이 결제 스미싱 주의",
            "content": null,
            "readcount": 2,
            "time": "2019-09-22 06:24:12.0"
        },
        {
            "bno": 2,
            "title": "제로페이모바일상품권 법인대량구매 안내",
            "content": null,
            "readcount": 0,
            "time": "2019-09-22 06:25:53.0"
        },
        // 생략
        ]
}

<실패시>
{
    "resultCode": 109,
    "message": "공지사항을 가져오는데 실패 했습니다.",
    "param": null
}

<br />

## 11. 글 상세보기
- URL : /board/detail
- method : GET
- parameter : bno(글번호)
- return : 

<성공시>
{
    "resultCode": 0,
    "message": "success",
    "param": {
        "bno": 2,
        "title": "제로페이모바일상품권 법인대량구매 안내",
        "content": "제로페이모바일상품권 법인대량구매 안내드립니다. \n\n\n\n* 구매방법 : 대량구매 신청 → 구매대금 납부 → 대량구매법인 및 계정 등록 → 모바일 상품권 대량구매 → 대상자에게 LMS 대량발송 \n                   (자세한 내용은 첨부파일 참고) \n\n* 대량구매 신청방법 : 대량구매법인 및 계정 등록양식, 대량구매 등록양식 작성 후 담당자(khj_2216@zpay.or.kr)에게 메일 발송 \n\n* 대량발송대상자 등록양식은 관리자페이지에서 직접 업로드 \n\n* 문의 : 1670-0582, 1522-2270",
        "readcount": 0,
        "time": "2019-09-22 06:25:53.0"
    }
}


<실패시>

{
    "resultCode": 110,
    "message": "공지사항 글을 가져오는데 실패 했습니다.",
    "param": null
}
