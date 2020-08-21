package com.demofactory.syscontrol.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demofactory.syscontrol.domain.SysUser;

import java.util.List;

/**
 * @author:Hanamaru
 * @description: TODO
 * @date: 2020/8/19 14:11
 */
public interface AssignUserService extends IService<SysUser> {
    /**
     * 通过 domainId orgId 查询 sysUser
     *
     * @param sysUser
     * @return List
     */
    List<SysUser> selectAssignUser(SysUser sysUser);

    /**
     * 通过 id account 修改sysUser->domainId&&orgId
     *
     * @param sysUser
     * @return
     */
    String updateAssignUser(SysUser sysUser);


}
