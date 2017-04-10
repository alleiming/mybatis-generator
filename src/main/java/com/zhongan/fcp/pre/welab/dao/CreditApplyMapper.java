package com.zhongan.fcp.pre.welab.dao;

import com.zhongan.fcp.pre.welab.domain.CreditApply;

public interface CreditApplyMapper {
    /**
     *  根据主键删除数据库的记录,credit_apply
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,credit_apply
     *
     * @param record
     */
    int insert(CreditApply record);

    /**
     *  动态字段,写入数据库记录,credit_apply
     *
     * @param record
     */
    int insertSelective(CreditApply record);

    /**
     *  根据指定主键获取一条数据库记录,credit_apply
     *
     * @param id
     */
    CreditApply selectByPrimaryKey(Long id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,credit_apply
     *
     * @param record
     */
    int updateByPrimaryKeySelective(CreditApply record);

    /**
     *  根据主键来更新符合条件的数据库记录,credit_apply
     *
     * @param record
     */
    int updateByPrimaryKey(CreditApply record);
}