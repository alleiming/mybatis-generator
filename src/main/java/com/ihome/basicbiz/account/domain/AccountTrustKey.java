package com.ihome.basicbiz.account.domain;

public class AccountTrustKey {
    private String accountNo;

    private String trustMgrCode;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getTrustMgrCode() {
        return trustMgrCode;
    }

    public void setTrustMgrCode(String trustMgrCode) {
        this.trustMgrCode = trustMgrCode;
    }
}