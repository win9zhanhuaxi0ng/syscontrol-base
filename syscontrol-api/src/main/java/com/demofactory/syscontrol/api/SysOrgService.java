package com.demofactory.syscontrol.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demofactory.syscontrol.common.Result;
import com.demofactory.syscontrol.domain.SysDomain;
import com.demofactory.syscontrol.domain.SysOrg;


public interface SysOrgService extends IService<SysOrg> {
    Result selectOrgListByDomain(SysDomain sysDomain);
}
