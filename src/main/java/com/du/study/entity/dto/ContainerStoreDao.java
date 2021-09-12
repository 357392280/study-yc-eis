package com.du.study.entity.dto;

import com.du.study.entity.po.ContainerStore;

public interface ContainerStoreDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ContainerStore record);

    int insertSelective(ContainerStore record);

    ContainerStore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContainerStore record);

    int updateByPrimaryKey(ContainerStore record);
}