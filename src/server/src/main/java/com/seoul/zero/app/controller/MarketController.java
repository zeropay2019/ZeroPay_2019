package com.seoul.zero.app.controller;

import com.seoul.zero.app.model.vo.Market;
import com.seoul.zero.app.model.wrapper.ResponseWrapper;
import com.seoul.zero.app.service.MarketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/mar")
public class MarketController {
    private static Logger logger = LoggerFactory.getLogger(MemberController.class);
    private MarketService marketService;

    @Autowired
    public MarketController(MarketService marketService) {
        this.marketService = marketService;
    }

    // 가맹점 리스트
    @RequestMapping(value="/list", method = RequestMethod.GET)
    public ResponseEntity<ResponseWrapper> marketList(@RequestBody Market param){
        logger.info("가맹점 정보 출력요청...........");
        ResponseWrapper response = marketService.marketList(param);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
