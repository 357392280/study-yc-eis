package com.du.study.entity.dto;

import com.du.study.entity.po.PickOrder;

public interface PickOrderDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PickOrder record);

    int insertSelective(PickOrder record);

    PickOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PickOrder record);

    int updateByPrimaryKey(PickOrder record);
}