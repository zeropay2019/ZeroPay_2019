package com.seoul.zero.app.model.mapper;

import com.seoul.zero.app.model.vo.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberMapper {
    // 로그인(이름, 비밀번호 확인)
    int login(Member param);

    // 회원가입
    int register(Member param);

    // 아이디 찾기
    String searchId(Member param);

    // 비밀번호 찾기
    String searchPw(Member param);
}
