package com.seoul.zero.app.model.mapper;

import com.seoul.zero.app.model.vo.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BoardMapper {

    // 공지사항 글 목록
    List<Board> boardList();

    // 공지사항 글 상세보기
    Board detailBoard(Board param);

    // 공지사항 조회수 증가
    void plusCount(Board param);
}
