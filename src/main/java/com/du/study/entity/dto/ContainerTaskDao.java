package com.du.study.entity.dto;

import com.du.study.entity.po.ContainerTask;

public interface ContainerTaskDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ContainerTask record);

    int insertSelective(ContainerTask record);

    ContainerTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContainerTask record);

    int updateByPrimaryKey(ContainerTask record);
}