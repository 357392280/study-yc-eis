package com.du.study.entity.dto;

import com.du.study.entity.po.SxStoreLocationGroup;

public interface SxStoreLocationGroupDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SxStoreLocationGroup record);

    int insertSelective(SxStoreLocationGroup record);

    SxStoreLocationGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SxStoreLocationGroup record);

    int updateByPrimaryKey(SxStoreLocationGroup record);
}