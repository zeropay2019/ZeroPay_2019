package com.seoul.zero.app.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Member {
    private int mno;
    private String id;
    private String name;
    private String pwd;
    private String phone;
    private String payPwd;
    private String address;
    private String email;
}
