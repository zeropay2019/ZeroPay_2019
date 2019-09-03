package com.seoul.zero.app.service.impl;

import com.seoul.zero.app.model.mapper.MemberMapper;
import com.seoul.zero.app.model.vo.Member;
import com.seoul.zero.app.model.wrapper.ResponseWrapper;
import com.seoul.zero.app.service.MemberService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

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
        int result = memberMapper.login(param);
        if (result == 0) {
            wrapper.setMessage("존재하지 않은 사용자입니다.");
            wrapper.setResultCode(100);
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
}
