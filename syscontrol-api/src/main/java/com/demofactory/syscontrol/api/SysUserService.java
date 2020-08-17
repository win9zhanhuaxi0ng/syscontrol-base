package com.demofactory.syscontrol.api;

import com.demofactory.syscontrol.domain.SysUser;

import java.time.LocalDateTime;

public interface SysUserService {
    /**
     * 登录页面实现
     * @param account
     * @param password
     * @return
     */
    SysUser loginByAccountAndPassword(String account,String password);

    /**
     * 注册页面实现
     * @param account
     * @param password
     * @param secondaryPwd
     * @param pwdHint
     * @return
     */
    int registerSysUser(String account,String password,String secondaryPwd,String pwdHint);

    /**
     * 更新上次登录时间
     * @param lastLoginTime
     * @param account
     */
    void updateLastLoginTime(LocalDateTime lastLoginTime, String account);

    /**
     * 获取上次登录时间
     * @param account
     * @return
     */
    LocalDateTime findLastLoginTimeByAccount(String account);
}
