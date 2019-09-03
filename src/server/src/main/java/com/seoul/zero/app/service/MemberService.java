package com.seoul.zero.app.service;

import com.seoul.zero.app.model.vo.Member;
import com.seoul.zero.app.model.wrapper.ResponseWrapper;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {

    // 로그인(이름, 비밀번호 확인)
    ResponseWrapper login(Member param);

    // 회원가입
    ResponseWrapper register(Member param);

    // 아이디찾기
    ResponseWrapper searchId(Member param);

    // 비밀번호 찾기
    ResponseWrapper searchPw(Member param);
}
