package com.demofactory.syscontrol.api;

import com.demofactory.syscontrol.domain.SysUser;

public interface SysUserService {

    SysUser loginByAccountAndPassword(String account,String password);
    int registerSysUser(String account,String password);
}