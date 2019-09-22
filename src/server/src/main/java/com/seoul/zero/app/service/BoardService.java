package com.seoul.zero.app.service;

import com.seoul.zero.app.model.vo.Board;
import com.seoul.zero.app.model.wrapper.ResponseWrapper;

public interface BoardService {

    // 공지사항 목록 출력
    ResponseWrapper boardList();

    // 공지사항 상세내용 출력
    ResponseWrapper detailBoard(Board param);

}
