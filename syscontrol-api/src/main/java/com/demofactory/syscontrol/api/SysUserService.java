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
    int login(SysUser sysUser);

    /**
     *
     * @param sysUser
     * @return
     */
    int register(SysUser sysUser,String secondaryPwd);

    /**
     * 更新上次登录时间
     *
     * @param sysUser
     */
    void updateLastLoginTime(SysUser sysUser);

    /**
     * 判断账号与提示语是否正确
     * @author Hanamaru
     * @param sysUser
     * @return
     */
    String selectAccountAndHint(SysUser sysUser);

    /**
     * 修改用户密码
     * @param sysUser 用户账号、密码
     * @param secondaryPwd 二次密码校验
     * @return 提示语
     */
    String updatePassword(SysUser sysUser,String secondaryPwd);
}
