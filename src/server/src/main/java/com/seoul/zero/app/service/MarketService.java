package com.seoul.zero.app.service;

import com.seoul.zero.app.model.vo.Market;
import com.seoul.zero.app.model.wrapper.ResponseWrapper;

public interface MarketService {

    // 가맹점 리스트
    ResponseWrapper marketList(Market param);
}
