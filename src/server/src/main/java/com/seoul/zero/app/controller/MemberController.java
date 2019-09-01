package com.seoul.zero.app.controller;


import com.seoul.zero.app.model.vo.Member;
import com.seoul.zero.app.model.wrapper.ResponseWrapper;
import com.seoul.zero.app.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/mem")
public class MemberController {

    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 로그인 요청
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<ResponseWrapper> login(Member param) {
        ResponseWrapper response = memberService.login(param);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // 회원가입
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<ResponseWrapper> register(Member param) {
        ResponseWrapper response = memberService.register(param);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    
}
