package com.du.study.entity.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * order_task
 * @author 
 */
@Data
public class OrderTask implements Serializable {
    private Integer id;

    /**
     * WMS出库激活（0否 1是）
     */
    private Integer wmsOutActivate;

    /**
     * 拣选单id
     */
    private Integer pickOrderId;

    /**
     * 是否有整托（0：否，1：是，2：全）
     */
    private Integer isHaveAll;

    /**
     * 优先级
     */
    private Integer prioirty;

    /**
     * 订单状态(0:创建 1:出库中 2：出库完成 3：拣选完成 )
     */
    private Integer orderStatus;

    /**
     * 任务号
     */
    private String taskId;

    /**
     * 货主
     */
    private String consignor;

    /**
     * 仓
     */
    private String branchId;

    /**
     * 单据编号
     */
    private String billNo;

    /**
     * 关联订单号
     */
    private String custPoNo;

    /**
     * 单据类型
     */
    private Integer billType;

    /**
     * 单据日期
     */
    private Date billDate;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 完成时间
     */
    private Date completeTime;

    private static final long serialVersionUID = 1L;
}