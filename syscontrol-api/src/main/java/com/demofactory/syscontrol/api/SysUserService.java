package com.demofactory.syscontrol.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demofactory.syscontrol.common.Result;
import com.demofactory.syscontrol.domain.Books;
import com.demofactory.syscontrol.domain.SysUser;
import com.demofactory.syscontrol.domain.UserBook;
import com.demofactory.syscontrol.domain.dto.SysUserDTO;
import org.springframework.boot.autoconfigure.security.SecurityProperties;


import java.util.List;


public interface SysUserService extends IService<SysUser> {
    /**
     * 登录功能
     *
     * @param sysUser
     * @return SysUser
     */
    Result login(SysUser sysUser);

    /**
     * 注册功能
     *
     * @param sysUserDTO 用户DTO信息
     * @return
     */
    Result register(SysUserDTO sysUserDTO);

    /**
     * 判断账号与提示语是否正确
     *
     * @param sysUser
     * @return
     * @author Hanamaru
     */
    Result selectAccountAndHint(SysUser sysUser);

    /**
     * 修改用户密码
     *
     * @param sysUserDTO 用户DTO信息
     * @return 提示语
     */
    String updatePassword(SysUserDTO sysUserDTO);

    /**
     * 查找用户组织和域
     *
     * @param sysUser
     * @return
     */
    Result selectSysDomainAndSysOrg(SysUser sysUser);

    /**
     * 添加用户组织和域
     *
     * @param sysUser 用户信息+域id和组织id
     * @return
     */
    Result insertSysDomainAndSysOrg(SysUser sysUser);

    /**
     * 当前域下，用户未添加的书
     *
     * @param sysUser
     * @return
     */
    Result selectBooksByUserDomainId(SysUser sysUser);

    /**
     * 用户添加书
     *
     * @param userBook 书+用户ID
     * @return
     */
    Result insertBooksToUser(UserBook userBook);

    /**
     * 用户已添加的书
     *
     * @return
     */
    Result selectBooksByUserId(SysUser sysUser);

    /**
     * 用户删除书
     *
     * @param
     * @return
     */
    Result deleteBooksByUser(UserBook userBook);
}
