package com.du.study.entity.dto;

import com.du.study.entity.po.OrderTask;

public interface OrderTaskDao {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderTask record);

    int insertSelective(OrderTask record);

    OrderTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderTask record);

    int updateByPrimaryKey(OrderTask record);
}