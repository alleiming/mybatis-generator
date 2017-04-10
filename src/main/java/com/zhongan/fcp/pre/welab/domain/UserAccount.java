package com.zhongan.fcp.pre.welab.domain;

import java.util.Date;

public class UserAccount {
    /**
     * 主键ID
    
     */
    private Long id;

    /**
     * 合作方用户账号
    
     */
    private String thirdUserNo;

    /**
     * 产品编码
    
     */
    private String productCode;

    /**
     * 渠道ID
    
     */
    private Long channelId;

    /**
     * 子渠道ID
    
     */
    private Long subChannelId;

    /**
     * 众安渠道账户ID
    
     */
    private Long userId;

    /**
     * 证件类型:1-身份证;
    
     */
    private Byte certType;

    /**
     * 证件号
    
     */
    private String certNo;

    /**
     * 手机号码
    
     */
    private String phoneNo;

    /**
     * 姓名
    
     */
    private String userName;

    /**
     * 创建人
    
     */
    private String creator;

    /**
     * 创建时间
    
     */
    private Date gmtCreated;

    /**
     * 更新人
    
     */
    private String modifier;

    /**
     * 修改时间
    
     */
    private Date gmtModified;

    /**
     * 是否删除
    
     */
    private String isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getThirdUserNo() {
        return thirdUserNo;
    }

    public void setThirdUserNo(String thirdUserNo) {
        this.thirdUserNo = thirdUserNo;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Long getSubChannelId() {
        return subChannelId;
    }

    public void setSubChannelId(Long subChannelId) {
        this.subChannelId = subChannelId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Byte getCertType() {
        return certType;
    }

    public void setCertType(Byte certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }
}