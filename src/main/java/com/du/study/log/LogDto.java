package com.du.study.log;

import java.util.Date;

public class LogDto {
    /**描述*/
    private String descri;
    /** 方向 */
    private String direct;
    /**任务类型*/
    private int type;
    /**请求信息*/
    private String request;
    /**响应信息*/
    private String response;
    /**成功状态*/
    private Boolean success;
    /**创建时间*/
    private Date createTime;
    /**主机*/
    private String host;
    /**方法名*/
    private String function;

    @Override
    public String toString() {
        return "LogDto{" +
                "descri='" + descri + '\'' +
                ", direct='" + direct + '\'' +
                ", type=" + type +
                ", request='" + request + '\'' +
                ", response='" + response + '\'' +
                ", success=" + success +
                ", createTime=" + createTime +
                ", host='" + host + '\'' +
                ", function='" + function + '\'' +
                '}';
    }

    public LogDto() {
    }

    public LogDto(String descri, String direct, int type, String request, String response, Boolean success, Date createTime, String host, String function) {
        this.descri = descri;
        this.direct = direct;
        this.type = type;
        this.request = request;
        this.response = response;
        this.success = success;
        this.createTime = createTime;
        this.host = host;
        this.function = function;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
