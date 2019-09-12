package com.seoul.zero.app.service.impl;

import com.seoul.zero.app.model.mapper.MarketMapper;
import com.seoul.zero.app.model.vo.Market;
import com.seoul.zero.app.model.wrapper.ResponseWrapper;
import com.seoul.zero.app.service.MarketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MarketServiceImpl implements MarketService {

    @Resource
    private MarketMapper marketMapper;

    public ResponseWrapper createWrapper() {
        ResponseWrapper response = new ResponseWrapper();
        response.setResultCode(0);
        response.setMessage("success");
        return response;
    }
    @Override
    public ResponseWrapper marketList(Market param) {
        ResponseWrapper wrapper = createWrapper();
        List<Market> aList =  marketMapper.marketList(param);
        if(aList == null){
            wrapper.setMessage("가맹점 리스트 출력에 실패했습니다.");
            wrapper.setResultCode(107);
        }else{
            wrapper.setParam(aList);
        }
        return wrapper;
    }
}
