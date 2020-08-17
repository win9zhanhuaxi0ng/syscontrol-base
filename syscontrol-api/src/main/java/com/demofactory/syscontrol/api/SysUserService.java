package com.demofactory.syscontrol.api;

import com.demofactory.syscontrol.domain.SysUser;

import java.time.LocalDateTime;

public interface SysUserService {

    SysUser loginByAccountAndPassword(String account,String password);
    int registerSysUser(String account,String password,String pwdHint);
    void updateLastLoginTime(LocalDateTime lastLoginTime, String account);
    LocalDateTime findLastLoginTimeByAccount(String account);
}
