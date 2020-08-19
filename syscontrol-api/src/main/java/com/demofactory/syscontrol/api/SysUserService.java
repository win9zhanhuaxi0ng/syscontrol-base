package com.demofactory.syscontrol.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demofactory.syscontrol.domain.SysUser;

import java.time.LocalDateTime;

public interface SysUserService extends IService<SysUser> {
    /**
     *登录功能
     * @param sysUser
     * @return SysUser
     */
    SysUser login(SysUser sysUser);

    /**
     *
     * @param sysUser
     * @return
     */
    int register(SysUser sysUser,String secondaryPwd);

    /**
     * 更新上次登录时间
     * @param lastLoginTime
     * @param account
     */
    void updateLastLoginTime(SysUser sysUser);

    /**
     * 获取上次登录时间
     * @param account
     * @return
     */
    LocalDateTime findLastLoginTime(String account);

    /**
     * 判断账号与提示语是否正确
     * @author Hanamaru
     * @param sysUser
     * @return
     */
    String SelectAccountAndHint(SysUser sysUser);
}
