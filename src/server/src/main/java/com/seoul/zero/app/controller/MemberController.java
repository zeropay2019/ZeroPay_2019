package com.seoul.zero.app.controller;


import com.seoul.zero.app.model.vo.Member;
import com.seoul.zero.app.model.vo.request.EnrollCard;
import com.seoul.zero.app.model.vo.response.Card;
import com.seoul.zero.app.model.wrapper.ResponseWrapper;
import com.seoul.zero.app.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.Request;


@Controller
@RequestMapping("/mem")
public class MemberController {
    private static Logger logger = LoggerFactory.getLogger(MemberController.class);
    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 로그인 요청
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<ResponseWrapper> login(@RequestBody Member param) {
        logger.info("로그인 요청............");
        ResponseWrapper response = memberService.login(param);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // 회원정보 출력
    @RequestMapping(value="/memberInfo", method= RequestMethod.POST)
    public ResponseEntity<ResponseWrapper> memberInfo(@RequestBody Member param){
        logger.info("회원정보 출력............");
        ResponseWrapper response = memberService.memberInfo(param);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    // 회원가입
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<ResponseWrapper> register(@RequestBody Member param) {
        logger.info("회원가입 요청............");
        logger.info("Member name : " + param.getName() + param.getPayPwd());
        ResponseWrapper response = memberService.register(param);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // 아이디 찾기
    @RequestMapping(value="/searchId", method=RequestMethod.POST)
    public ResponseEntity<ResponseWrapper> searchId(@RequestBody Member param){
        logger.info("아이디 찾기 ............");
        ResponseWrapper response = memberService.searchId(param);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // 비밀번호 찾기
    @RequestMapping(value="/searchPw", method = RequestMethod.POST)
    public ResponseEntity<ResponseWrapper> searchPw(@RequestBody Member param){
        logger.info("비밀번호 찾기............");
        ResponseWrapper response = memberService.searchPw(param);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // 카드 등록
    @RequestMapping(value="/enrollCard", method = RequestMethod.POST)
    public ResponseEntity<ResponseWrapper> enrollCard(@RequestBody EnrollCard param){
        logger.info("카드등록 요청............");
        ResponseWrapper response = memberService.enrollCard(param);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // 카드 리스트
    @RequestMapping(value="/cardList", method=RequestMethod.POST)
    public ResponseEntity<ResponseWrapper> searchCard(@RequestBody Card param){
        logger.info("카드리스트 출력............");
        ResponseWrapper response = memberService.searchCard(param);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
