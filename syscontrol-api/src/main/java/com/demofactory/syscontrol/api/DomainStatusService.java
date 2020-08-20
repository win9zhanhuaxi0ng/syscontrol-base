package com.demofactory.syscontrol.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demofactory.syscontrol.domain.SysDomain;

/**
 * @author:Hanamaru
 * @description: TODO
 * @date: 2020/8/20 13:45
 */
public interface DomainStatusService extends IService<SysDomain> {
    /**
     * 通过id status 更改domain org user 的status
     * @param sysDomain
     * @return
     */
    String domainUpdate(SysDomain sysDomain);
}
