package com.demofactory.syscontrol.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demofactory.syscontrol.domain.SysUser;

/**
 * @author:Hanamaru
 * @description: TODO
 * @date: 2020/8/19 17:34
 */
public interface UserStatusService extends IService<SysUser>
{
    /**
     * 通过 account 修改Status
     *
     * @param sysUser
     * @return
     */
    String userStatusUpdate(SysUser sysUser);
}
