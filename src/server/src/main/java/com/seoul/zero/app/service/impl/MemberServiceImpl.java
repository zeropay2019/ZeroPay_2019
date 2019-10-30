package com.seoul.zero.app.service.impl;

import com.seoul.zero.app.model.mapper.MemberMapper;
import com.seoul.zero.app.model.vo.Member;
import com.seoul.zero.app.model.vo.request.EnrollCard;
import com.seoul.zero.app.model.vo.response.Card;
import com.seoul.zero.app.model.wrapper.ResponseWrapper;
import com.seoul.zero.app.service.MemberService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberMapper memberMapper;

    public ResponseWrapper createWrapper() {
        ResponseWrapper response = new ResponseWrapper();
        response.setResultCode(0);
        response.setMessage("success");
        return response;
    }

    @Override
    public ResponseWrapper login(Member param) {
        ResponseWrapper wrapper = createWrapper();
        Member member = null;
        int result = memberMapper.login(param);
        if (result == 0) {
            wrapper.setMessage("존재하지 않은 사용자입니다.");
            wrapper.setResultCode(100);
        }else{
            member = memberMapper.memberInfo(param);
            wrapper.setParam(member);
        }
        return wrapper;
    }

    @Override
    public ResponseWrapper memberInfo(Member param) {
        ResponseWrapper wrapper = createWrapper();
        Member member = memberMapper.memberInfo(param);
        if(member == null){
            wrapper.setMessage("회원정보 출력에 실패했습니다.");
            wrapper.setResultCode(106);
        }else{
            wrapper.setParam(member);
        }
        return wrapper;
    }

    @Override
    public ResponseWrapper register(Member param) {
        ResponseWrapper wrapper = createWrapper();
        int result = 0;
        try{
            result = memberMapper.register(param);
        }catch(Exception e){
            wrapper.setMessage("회원가입에 실패 했습니다.");
            wrapper.setResultCode(101);
        }
        if(result == 0){
            wrapper.setMessage("회원가입에 실패 했습니다.");
            wrapper.setResultCode(101);
        }
        return wrapper;
    }

    @Override
    public ResponseWrapper searchId(Member param) {
        ResponseWrapper wrapper = createWrapper();
        String id = memberMapper.searchId(param);
        if(id == null){
            wrapper.setMessage("일치하는 ID가 존재하지 않습니다.");
            wrapper.setResultCode(102);
        }else{
            wrapper.setParam(id);
        }
        return wrapper;
    }

    @Override
    public ResponseWrapper searchPw(Member param) {
        ResponseWrapper wrapper = createWrapper();
        String pw = memberMapper.searchPw(param);
        if(pw == null){
            wrapper.setMessage("일치하는 비밀번호가 존재하지 않습니다.");
            wrapper.setResultCode(103);
        }else{
            wrapper.setParam(pw);
        }
        return wrapper;
    }

    @Override
    public ResponseWrapper enrollCard(EnrollCard param) {
        ResponseWrapper wrapper = createWrapper();
        int result = 0;
        try{
            result = memberMapper.enrollCard(param);
        }catch(Exception e){
            wrapper.setMessage("카드등록에 실패 했습니다.");
            wrapper.setResultCode(104);
        }
        if(result == 0){
            wrapper.setMessage("카드등록에 실패 했습니다.");
            wrapper.setResultCode(104);
        }
        return wrapper;
    }

    @Override
    public ResponseWrapper searchCard(Card param) {
        ResponseWrapper wrapper = createWrapper();
        List<Card> aList = memberMapper.searchCard(param);
        if(aList == null){
            wrapper.setMessage("카드 리스트 찾기에 실패했습니다.");
            wrapper.setResultCode(105);
        }else{
            wrapper.setParam(aList);
        }
        return wrapper;
    }

    @Override
    public ResponseWrapper deleteCard(Card param) {
        ResponseWrapper wrapper = createWrapper();
        int result = memberMapper.deleteCard(param);
        if(result==0){
            wrapper.setMessage("카드 삭제에 실패했습니다.");
            wrapper.setResultCode(108);
        }
        return wrapper;
    }
}
