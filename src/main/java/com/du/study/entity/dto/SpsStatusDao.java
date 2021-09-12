package com.du.study.entity.dto;

import com.du.study.entity.po.SpsStatus;

public interface SpsStatusDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SpsStatus record);

    int insertSelective(SpsStatus record);

    SpsStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpsStatus record);

    int updateByPrimaryKey(SpsStatus record);
}