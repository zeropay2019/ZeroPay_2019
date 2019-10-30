package com.seoul.zero.app.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Market {
    private String marketName;
    private String address;
    private String category;
    private double lat;
    private double lon;
}
