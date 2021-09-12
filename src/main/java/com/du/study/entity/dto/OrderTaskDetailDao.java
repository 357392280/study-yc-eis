package com.du.study.entity.dto;

import com.du.study.entity.po.OrderTaskDetail;

public interface OrderTaskDetailDao {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderTaskDetail record);

    int insertSelective(OrderTaskDetail record);

    OrderTaskDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderTaskDetail record);

    int updateByPrimaryKey(OrderTaskDetail record);
}