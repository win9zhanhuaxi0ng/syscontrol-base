package com.demofactory.syscontrol.dao;

import com.demofactory.syscontrol.domain.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SysUserDao {

    SysUser findByAccount(String account);
    void insertNewSysUser(@Param("account") String account,@Param("password") String password,@Param("pwd_hint") String pwdHint);
    void updateLastLoginTime(@Param("last_login_time") LocalDateTime lastLoginTime,@Param("account") String account);
    LocalDateTime findLastLoginTimeByAccount(@Param("account") String account);
}
