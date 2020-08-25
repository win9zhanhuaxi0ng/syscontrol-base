package com.demofactory.syscontrol.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demofactory.syscontrol.common.Result;
import com.demofactory.syscontrol.domain.SysDomain;


public interface SysDomainService extends IService<SysDomain> {
    Result selectDomainList();
}
