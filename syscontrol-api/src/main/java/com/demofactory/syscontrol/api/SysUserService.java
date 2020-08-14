package com.demofactory.syscontrol.api;

import com.demofactory.syscontrol.domain.SysUser;

public interface SysUserService {

    SysUser loginByAccount(String account);
}
