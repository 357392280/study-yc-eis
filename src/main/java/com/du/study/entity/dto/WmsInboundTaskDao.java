package com.du.study.entity.dto;

import com.du.study.entity.po.WmsInboundTask;

public interface WmsInboundTaskDao {
    int deleteByPrimaryKey(Integer id);

    int insert(WmsInboundTask record);

    int insertSelective(WmsInboundTask record);

    WmsInboundTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WmsInboundTask record);

    int updateByPrimaryKey(WmsInboundTask record);
}