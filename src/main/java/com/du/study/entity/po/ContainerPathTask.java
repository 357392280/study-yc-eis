package com.du.study.entity.po;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

/**
 * container_path_task
 * @author 
 */
@Data
@Getter
public class ContainerPathTask implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 载具编号
     */
    private String palletNo;

    /**
     * 托盘号
     */
    private String containerNo;

    /**
     * 起点区域
     */
    private String sourceArea;

    /**
     * 起点货位
     */
    private String sourceLocation;

    /**
     * 终点区域
     */
    private String targetArea;

    /**
     * 终点货位
     */
    private String targetLocation;

    /**
     * 容器高度
     */
    private Integer actualHeight;

    /**
     * 回传标识
     */
    private Integer callBack;

    /**
     * 任务类型(0无任务;10 入库;20出库;30待出库;40内部移位 50移动)
     */
    private Integer taskType;

    /**
     * 任务状态(0未开始;10待发送任务;20已发送指令;30设备回告开始;40已经离开原位置)
     */
    private Integer taskState;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 分货位属性1
     */
    private String entrance1Property1;

    /**
     * 分货位属性2
     */
    private String entrance1Property2;

    /**
     * 预留字段，wms任务编号
     */
    private String property1;

    private static final long serialVersionUID = 1L;
}