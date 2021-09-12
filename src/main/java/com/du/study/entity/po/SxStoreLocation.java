package com.du.study.entity.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sx_store_location
 * @author 
 */
@Data
public class SxStoreLocation implements Serializable {
    /**
     * 货位id
     */
    private Integer id;

    /**
     * 货位编号
     */
    private String storeNo;

    /**
     * 货位组id
     */
    private Integer storeLocationGroupId;

    /**
     * 层
     */
    private Integer layer;

    /**
     * x轴
     */
    private Integer x;

    /**
     * y轴
     */
    private Integer y;

    /**
     * 相邻货位id1
     */
    private Integer storeLocationId1;

    /**
     * 相邻货位id2
     */
    private Integer storeLocationId2;

    /**
     * 货位升位锁
     */
    private Integer ascentLockState;

    /**
     * 货位组位置索引(从上到下、从左到右)
     */
    private Integer locationIndex;

    /**
     * 货位深度
     */
    private Integer depth;

    /**
     * 移位数
     */
    private Integer deptNum;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 垂直货位组Id
     */
    private Integer verticalLocationGroupId;

    /**
     * 实际重量
     */
    private Double actualWeight;

    /**
     * 限重
     */
    private Double limitWeight;

    /**
     * 是否为入库货位(0.否、1、是)
     */
    private Integer isInboundLocation;

    /**
     * Wms货位编号
     */
    private String wmsStoreNo;

    /**
     * 任务锁(0.否、1、是)
     */
    private Integer taskLock;

    /**
     * 区域编号
     */
    private String areaNo;

    /**
     * 是否异常位
     */
    private String isException;

    private static final long serialVersionUID = 1L;
}