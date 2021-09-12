package com.du.study.entity.dto;

import com.du.study.entity.po.WorkInfoHistory;

public interface WorkInfoHistoryDao {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkInfoHistory record);

    int insertSelective(WorkInfoHistory record);

    WorkInfoHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkInfoHistory record);

    int updateByPrimaryKey(WorkInfoHistory record);
}