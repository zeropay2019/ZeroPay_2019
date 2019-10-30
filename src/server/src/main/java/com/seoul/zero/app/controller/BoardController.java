package com.seoul.zero.app.controller;

import com.seoul.zero.app.model.vo.Board;
import com.seoul.zero.app.model.wrapper.ResponseWrapper;
import com.seoul.zero.app.service.BoardService;
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
@RequestMapping("/board")
public class BoardController {

    private static Logger logger = LoggerFactory.getLogger(MemberController.class);
    private BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    // 공지사항 조회
    @RequestMapping(value="/list", method= RequestMethod.GET)
    public ResponseEntity<ResponseWrapper> boardList(){
        logger.info("공지사항 리스트 요청..........");
        ResponseWrapper response = boardService.boardList();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // 공지사항 상세보기
    @RequestMapping(value="/detail", method=RequestMethod.GET)
    public ResponseEntity<ResponseWrapper> detailBoard(@RequestBody Board param){
        logger.info("공지사항 상세보기 요청...........");
        ResponseWrapper response = boardService.detailBoard(param);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // 이벤트 조회

}
