package com.du.study.entity.dto;

import com.du.study.entity.po.SynGoodsInfo;

public interface SynGoodsInfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SynGoodsInfo record);

    int insertSelective(SynGoodsInfo record);

    SynGoodsInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SynGoodsInfo record);

    int updateByPrimaryKey(SynGoodsInfo record);
}