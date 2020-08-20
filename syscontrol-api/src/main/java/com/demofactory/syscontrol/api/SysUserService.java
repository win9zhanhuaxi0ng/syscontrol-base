package com.demofactory.syscontrol.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demofactory.syscontrol.domain.SysUser;
import com.demofactory.syscontrol.domain.dto.SysUserDTO;


public interface SysUserService extends IService<SysUser> {
    /**
     * 登录功能
     *
     * @param sysUser
     * @return SysUser
     */
    String login(SysUser sysUser);

    /**
     * @param sysUserDTO 用户DTO信息
     * @return
     */
    String register(SysUserDTO sysUserDTO);


    /**
     * 判断账号与提示语是否正确
     *
     * @param sysUser
     * @return
     * @author Hanamaru
     */
    String selectAccountAndHint(SysUser sysUser);

    /**
     * 修改用户密码
     *
     * @param sysUserDTO 用户DTO信息
     * @return 提示语
     */
    String updatePassword(SysUserDTO sysUserDTO);
}
