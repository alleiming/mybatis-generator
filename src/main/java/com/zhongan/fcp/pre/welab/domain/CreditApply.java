package com.zhongan.fcp.pre.welab.domain;

import java.math.BigDecimal;
import java.util.Date;

public class CreditApply {
    /**
     * 主键id
    
     */
    private Long id;

    /**
     * 合作方用户账号
    
     */
    private String thirdUserNo;

    /**
     * 请求流水号
    
     */
    private String reqNo;

    /**
     * 授信申请号
    
     */
    private String creditApplyNo;

    /**
     * 产品编码
    
     */
    private String productCode;

    /**
     * 申请金额
    
     */
    private BigDecimal applyAmount;

    /**
     * 申请日期
    
     */
    private Date applyDate;

    /**
     * 用户名称
    
     */
    private String userName;

    /**
     * 证件类型 1-身份证
    
     */
    private Byte certType;

    /**
     * 证件号码
    
     */
    private String certNo;

    /**
     * 手机号码
    
     */
    private String phoneNo;

    /**
     * 风控扩展信息JSON格式
    
     */
    private String riskInfo;

    /**
     * 众安渠道账户ID
    
     */
    private Long userId;

    /**
     * 授信申请状态
    
     */
    private Byte applyStatus;

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

    public String getReqNo() {
        return reqNo;
    }

    public void setReqNo(String reqNo) {
        this.reqNo = reqNo;
    }

    public String getCreditApplyNo() {
        return creditApplyNo;
    }

    public void setCreditApplyNo(String creditApplyNo) {
        this.creditApplyNo = creditApplyNo;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public BigDecimal getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(BigDecimal applyAmount) {
        this.applyAmount = applyAmount;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getRiskInfo() {
        return riskInfo;
    }

    public void setRiskInfo(String riskInfo) {
        this.riskInfo = riskInfo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Byte getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Byte applyStatus) {
        this.applyStatus = applyStatus;
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