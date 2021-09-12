package com.du.study.entity.dto;

import com.du.study.entity.po.SxStoreLocation;

public interface SxStoreLocationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SxStoreLocation record);

    int insertSelective(SxStoreLocation record);

    SxStoreLocation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SxStoreLocation record);

    int updateByPrimaryKey(SxStoreLocation record);
}