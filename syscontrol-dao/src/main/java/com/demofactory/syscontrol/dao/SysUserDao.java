package com.demofactory.syscontrol.dao;

import com.demofactory.syscontrol.domain.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserDao {

    SysUser findByAccount(String account);
}
