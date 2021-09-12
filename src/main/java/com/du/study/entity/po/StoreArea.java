package com.du.study.entity.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * order_task_detail
 * @author 
 */
@Data
public class StoreArea implements Serializable {
    private Integer id;

    /**
     * 订单汇总id
     */
    private Integer orderTaskId;

    /**
     * 行号
     */
    private String seqNo;

    private String taskId;

    /**
     * goodsInfo id
     */
    private Integer goodsLotId;

    /**
     * 计划数量
     */
    private Integer planNum;

    /**
     * 出库数量
     */
    private Integer outNum;

    /**
     * 拣选数量
     */
    private Integer pickNum;

    /**
     * 单条明细整托数量
     */
    private Integer trayAllNum;

    /**
     * 单位
     */
    private String stockUnit;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 完成时间
     */
    private Date completeTime;

    private static final long serialVersionUID = 1L;
}