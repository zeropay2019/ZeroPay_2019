package com.seoul.zero.app.service.impl;

import com.seoul.zero.app.model.mapper.BoardMapper;
import com.seoul.zero.app.model.vo.Board;
import com.seoul.zero.app.model.wrapper.ResponseWrapper;
import com.seoul.zero.app.service.BoardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Resource
    private BoardMapper boardMapper;

    public ResponseWrapper createWrapper() {
        ResponseWrapper response = new ResponseWrapper();
        response.setResultCode(0);
        response.setMessage("success");
        return response;
    }

    // 공지사항 목록
    @Override
    public ResponseWrapper boardList() {
        ResponseWrapper wrapper = createWrapper();
        List<Board> bList = boardMapper.boardList();
        if(bList.size()==0){
            wrapper.setResultCode(109);
            wrapper.setMessage("공지사항을 가져오는데 실패 했습니다.");
        }else{
            wrapper.setParam(bList);
        }
        return wrapper;
    }

    // 공지사항 상세 보기
    @Override
    public ResponseWrapper detailBoard(Board param) {
        ResponseWrapper wrapper = createWrapper();
        Board board = boardMapper.detailBoard(param);
        if(board == null){
            wrapper.setResultCode(110);
            wrapper.setMessage("공지사항 글을 가져오는데 실패 했습니다.");
        }else{
            wrapper.setParam(board);
            // 조회수 증가
            boardMapper.plusCount(param);
        }
        return wrapper;
    }
}
