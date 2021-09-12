package com.du.study.entity.dto;

import com.du.study.entity.po.OpenDisk;

public interface OpenDiskDao {
    int deleteByPrimaryKey(Integer id);

    int insert(OpenDisk record);

    int insertSelective(OpenDisk record);

    OpenDisk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpenDisk record);

    int updateByPrimaryKey(OpenDisk record);
}