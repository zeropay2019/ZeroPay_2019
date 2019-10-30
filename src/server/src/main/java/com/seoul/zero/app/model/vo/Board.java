package com.seoul.zero.app.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Board {
    private int bno;
    private String title;
    private String content;
    private int readcount;
    private String time;
}

/*
* create table board(
    bno number,
    title varchar2(200),
    content clob,
    readcount number default 0,
    time date default sysdate
);
*
* sequence bno_seq
* */