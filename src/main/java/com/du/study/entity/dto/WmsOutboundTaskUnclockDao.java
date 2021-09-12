package com.du.study.entity.dto;

import com.du.study.entity.po.WmsOutboundTaskUnclock;

public interface WmsOutboundTaskUnclockDao {
    int deleteByPrimaryKey(Integer id);

    int insert(WmsOutboundTaskUnclock record);

    int insertSelective(WmsOutboundTaskUnclock record);

    WmsOutboundTaskUnclock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WmsOutboundTaskUnclock record);

    int updateByPrimaryKey(WmsOutboundTaskUnclock record);
}