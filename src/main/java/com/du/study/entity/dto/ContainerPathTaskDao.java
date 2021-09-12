package com.du.study.entity.dto;

import com.du.study.entity.po.ContainerPathTask;

public interface ContainerPathTaskDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ContainerPathTask record);

    int insertSelective(ContainerPathTask record);

    ContainerPathTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContainerPathTask record);

    int updateByPrimaryKey(ContainerPathTask record);
}