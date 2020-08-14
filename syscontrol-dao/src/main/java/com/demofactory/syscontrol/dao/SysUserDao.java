package com.demofactory.syscontrol.dao;

import com.demofactory.syscontrol.domain.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserDao {

    SysUser findByAccount(String account);
    void insertNewSysUser(@Param("account") String account,@Param("password") String password);
}
