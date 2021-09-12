package com.du.study.entity.dto;

import com.du.study.entity.po.WmsOutboundTaskUnclockMx;

public interface WmsOutboundTaskUnclockMxDao {
    int deleteByPrimaryKey(Integer id);

    int insert(WmsOutboundTaskUnclockMx record);

    int insertSelective(WmsOutboundTaskUnclockMx record);

    WmsOutboundTaskUnclockMx selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WmsOutboundTaskUnclockMx record);

    int updateByPrimaryKey(WmsOutboundTaskUnclockMx record);
}