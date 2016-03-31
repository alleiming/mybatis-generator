package com.ihome.basicbiz.account.dao;

import com.ihome.basicbiz.account.domain.AccountTrust;
import com.ihome.basicbiz.account.domain.AccountTrustKey;

public interface AccountTrustMapper {
    int deleteByPrimaryKey(AccountTrustKey key);

    int insert(AccountTrust record);

    int insertSelective(AccountTrust record);

    AccountTrust selectByPrimaryKey(AccountTrustKey key);

    int updateByPrimaryKeySelective(AccountTrust record);

    int updateByPrimaryKey(AccountTrust record);
}