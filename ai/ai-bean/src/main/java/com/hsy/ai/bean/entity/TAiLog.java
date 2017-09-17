package com.hsy.ai.bean.entity;

import java.io.Serializable;
import java.util.Date;

public class TAiLog implements Serializable {
    private String id;

    private String requestUrl;

    private String userId;

    private String requestAction;

    private String timing;

    private String requestMethodType;

    private String requestParam;

    private String userRemark;

    private String requestIp;

    private String requestAddress;

    private Date requestTime;

    private String requestResponse;

    private String requestThreadId;

    private String requestSource;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRequestAction() {
        return requestAction;
    }

    public void setRequestAction(String requestAction) {
        this.requestAction = requestAction;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getRequestMethodType() {
        return requestMethodType;
    }

    public void setRequestMethodType(String requestMethodType) {
        this.requestMethodType = requestMethodType;
    }

    public String getRequestParam() {
        return requestParam;
    }

    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    public String getRequestAddress() {
        return requestAddress;
    }

    public void setRequestAddress(String requestAddress) {
        this.requestAddress = requestAddress;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestResponse() {
        return requestResponse;
    }

    public void setRequestResponse(String requestResponse) {
        this.requestResponse = requestResponse;
    }

    public String getRequestThreadId() {
        return requestThreadId;
    }

    public void setRequestThreadId(String requestThreadId) {
        this.requestThreadId = requestThreadId;
    }

    public String getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(String requestSource) {
        this.requestSource = requestSource;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", requestUrl=").append(requestUrl);
        sb.append(", userId=").append(userId);
        sb.append(", requestAction=").append(requestAction);
        sb.append(", timing=").append(timing);
        sb.append(", requestMethodType=").append(requestMethodType);
        sb.append(", requestParam=").append(requestParam);
        sb.append(", userRemark=").append(userRemark);
        sb.append(", requestIp=").append(requestIp);
        sb.append(", requestAddress=").append(requestAddress);
        sb.append(", requestTime=").append(requestTime);
        sb.append(", requestResponse=").append(requestResponse);
        sb.append(", requestThreadId=").append(requestThreadId);
        sb.append(", requestSource=").append(requestSource);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TAiLog other = (TAiLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRequestUrl() == null ? other.getRequestUrl() == null : this.getRequestUrl().equals(other.getRequestUrl()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRequestAction() == null ? other.getRequestAction() == null : this.getRequestAction().equals(other.getRequestAction()))
            && (this.getTiming() == null ? other.getTiming() == null : this.getTiming().equals(other.getTiming()))
            && (this.getRequestMethodType() == null ? other.getRequestMethodType() == null : this.getRequestMethodType().equals(other.getRequestMethodType()))
            && (this.getRequestParam() == null ? other.getRequestParam() == null : this.getRequestParam().equals(other.getRequestParam()))
            && (this.getUserRemark() == null ? other.getUserRemark() == null : this.getUserRemark().equals(other.getUserRemark()))
            && (this.getRequestIp() == null ? other.getRequestIp() == null : this.getRequestIp().equals(other.getRequestIp()))
            && (this.getRequestAddress() == null ? other.getRequestAddress() == null : this.getRequestAddress().equals(other.getRequestAddress()))
            && (this.getRequestTime() == null ? other.getRequestTime() == null : this.getRequestTime().equals(other.getRequestTime()))
            && (this.getRequestResponse() == null ? other.getRequestResponse() == null : this.getRequestResponse().equals(other.getRequestResponse()))
            && (this.getRequestThreadId() == null ? other.getRequestThreadId() == null : this.getRequestThreadId().equals(other.getRequestThreadId()))
            && (this.getRequestSource() == null ? other.getRequestSource() == null : this.getRequestSource().equals(other.getRequestSource()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRequestUrl() == null) ? 0 : getRequestUrl().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRequestAction() == null) ? 0 : getRequestAction().hashCode());
        result = prime * result + ((getTiming() == null) ? 0 : getTiming().hashCode());
        result = prime * result + ((getRequestMethodType() == null) ? 0 : getRequestMethodType().hashCode());
        result = prime * result + ((getRequestParam() == null) ? 0 : getRequestParam().hashCode());
        result = prime * result + ((getUserRemark() == null) ? 0 : getUserRemark().hashCode());
        result = prime * result + ((getRequestIp() == null) ? 0 : getRequestIp().hashCode());
        result = prime * result + ((getRequestAddress() == null) ? 0 : getRequestAddress().hashCode());
        result = prime * result + ((getRequestTime() == null) ? 0 : getRequestTime().hashCode());
        result = prime * result + ((getRequestResponse() == null) ? 0 : getRequestResponse().hashCode());
        result = prime * result + ((getRequestThreadId() == null) ? 0 : getRequestThreadId().hashCode());
        result = prime * result + ((getRequestSource() == null) ? 0 : getRequestSource().hashCode());
        return result;
    }
}