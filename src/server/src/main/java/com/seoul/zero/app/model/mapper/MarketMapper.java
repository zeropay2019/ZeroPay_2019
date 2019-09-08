package com.seoul.zero.app.model.mapper;

import com.seoul.zero.app.model.vo.Market;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MarketMapper {

    // 가맹점 리스트
    List marketList(Market param);
}
