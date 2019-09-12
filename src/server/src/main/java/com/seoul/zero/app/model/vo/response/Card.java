package com.seoul.zero.app.model.vo.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Card {
    private int mno;
    private String cardNumber;
    private String nick;
    private  String company;
}
