package ccom.zhongan.fcp.pre.welab.dao;

import com.zhongan.fcp.pre.welab.domain.UserAccount;

public interface UserAccountMapper {
    /**
     *  根据主键删除数据库的记录,user_account
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,user_account
     *
     * @param record
     */
    int insert(UserAccount record);

    /**
     *  动态字段,写入数据库记录,user_account
     *
     * @param record
     */
    int insertSelective(UserAccount record);

    /**
     *  根据指定主键获取一条数据库记录,user_account
     *
     * @param id
     */
    UserAccount selectByPrimaryKey(Long id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,user_account
     *
     * @param record
     */
    int updateByPrimaryKeySelective(UserAccount record);

    /**
     *  根据主键来更新符合条件的数据库记录,user_account
     *
     * @param record
     */
    int updateByPrimaryKey(UserAccount record);
}