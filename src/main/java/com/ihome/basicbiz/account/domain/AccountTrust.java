package com.ihome.basicbiz.account.domain;

import java.util.Date;

public class AccountTrust {
    private String accountNo;

    private String trustMgrCode;
    private String trustMgrName;

    private String merchantNo;

    private Short useType;

    private Date createTime;

    private Date updateTime;

    public String getTrustMgrName() {
        return trustMgrName;
    }

    public void setTrustMgrName(String trustMgrName) {
        this.trustMgrName = trustMgrName;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public Short getUseType() {
        return useType;
    }

    public void setUseType(Short useType) {
        this.useType = useType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}