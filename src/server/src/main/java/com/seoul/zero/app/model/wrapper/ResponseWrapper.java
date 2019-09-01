package com.seoul.zero.app.model.wrapper;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResponseWrapper {
    int resultCode;
    String message;
    Object param;
}
