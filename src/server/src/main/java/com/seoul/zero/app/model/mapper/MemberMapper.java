package com.seoul.zero.app.model.mapper;

import com.seoul.zero.app.model.vo.Member;
import com.seoul.zero.app.model.vo.request.EnrollCard;
import com.seoul.zero.app.model.vo.response.Card;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface MemberMapper {
    // 로그인(이름, 비밀번호 확인)
    int login(Member param);

    // 회원정보
    Member memberInfo(Member param);

    // 회원가입
    int register(Member param);

    // 아이디 찾기
    String searchId(Member param);

    // 비밀번호 찾기
    String searchPw(Member param);

    // 카드 등록
    int enrollCard(EnrollCard param);

    // 카드 리스트
    List<Card> searchCard(Card param);

    // 카드 삭제
    int deleteCard(Card param);
}
