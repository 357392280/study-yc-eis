package com.du.study.entity.dto;

import com.du.study.entity.po.StoreAreaDirection;

public interface StoreAreaDirectionDao {
    int deleteByPrimaryKey(Integer id);

    int insert(StoreAreaDirection record);

    int insertSelective(StoreAreaDirection record);

    StoreAreaDirection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StoreAreaDirection record);

    int updateByPrimaryKey(StoreAreaDirection record);
}