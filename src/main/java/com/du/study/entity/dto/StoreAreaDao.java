package com.du.study.entity.dto;

import com.du.study.entity.po.StoreArea;

public interface StoreAreaDao {
    int deleteByPrimaryKey(Integer id);

    int insert(StoreArea record);

    int insertSelective(StoreArea record);

    StoreArea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StoreArea record);

    int updateByPrimaryKey(StoreArea record);
}