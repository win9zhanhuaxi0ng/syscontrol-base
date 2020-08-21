package com.demofactory.syscontrol.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demofactory.syscontrol.domain.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SysUserDao extends BaseMapper<SysUser> {


}
