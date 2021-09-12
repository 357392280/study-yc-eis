package com.du.study.entity.vo;



import java.util.Date;
import java.util.List;

/**wms入库请求*/
public class WmsInboundRequest {
    /**Linid*/
    private String lineid;
    private String branchid;
    /***/
    private String billno;
    private String branchtype;
    private String refbillno;
    private String billtype;
    private Date billdate;
    private String containerno;
    private String palletno;
    private String parentcontainerno;
    private String remark;
    private List<SkuList> skuList;
    public void setLineid(String lineid) {
        this.lineid = lineid;
    }
    public String getLineid() {
        return lineid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }
    public String getBranchid() {
        return branchid;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }
    public String getBillno() {
        return billno;
    }

    public void setBranchtype(String branchtype) {
        this.branchtype = branchtype;
    }
    public String getBranchtype() {
        return branchtype;
    }

    public void setRefbillno(String refbillno) {
        this.refbillno = refbillno;
    }
    public String getRefbillno() {
        return refbillno;
    }

    public void setBilltype(String billtype) {
        this.billtype = billtype;
    }
    public String getBilltype() {
        return billtype;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }
    public Date getBilldate() {
        return billdate;
    }

    public void setContainerno(String containerno) {
        this.containerno = containerno;
    }
    public String getContainerno() {
        return containerno;
    }

    public void setPalletno(String palletno) {
        this.palletno = palletno;
    }
    public String getPalletno() {
        return palletno;
    }

    public void setParentcontainerno(String parentcontainerno) {
        this.parentcontainerno = parentcontainerno;
    }
    public String getParentcontainerno() {
        return parentcontainerno;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getRemark() {
        return remark;
    }

    public void setSkuList(List<SkuList> skuList) {
        this.skuList = skuList;
    }
    public List<SkuList> getSkuList() {
        return skuList;
    }

}
