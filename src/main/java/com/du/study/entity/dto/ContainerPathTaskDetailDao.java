package com.du.study.entity.dto;

import com.du.study.entity.po.ContainerPathTaskDetail;

public interface ContainerPathTaskDetailDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ContainerPathTaskDetail record);

    int insertSelective(ContainerPathTaskDetail record);

    ContainerPathTaskDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContainerPathTaskDetail record);

    int updateByPrimaryKey(ContainerPathTaskDetail record);
}