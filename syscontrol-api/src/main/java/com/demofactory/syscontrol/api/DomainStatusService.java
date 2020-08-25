package com.demofactory.syscontrol.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demofactory.syscontrol.common.ObjResult;
import com.demofactory.syscontrol.common.Result;
import com.demofactory.syscontrol.domain.SysDomain;

import java.util.List;

/**
 * @author:Hanamaru
 * @description: TODO
 * @date: 2020/8/20 13:45
 */
public interface DomainStatusService extends IService<SysDomain>
{
    /**
     * 通过id status 更改domain org user 的status
     *
     * @param sysDomain
     * @return
     */
    ObjResult<String> domainUpdate(SysDomain sysDomain);

    /**
     * 通过id 查询域
     *
     * @param sysDomain
     * @return
     */
    ObjResult<List<SysDomain>> selectSysDomain(SysDomain sysDomain);

    /**
     * insert 域名
     *
     * @param sysDomain
     * @return
     */
    ObjResult<String> insertSysDomain(SysDomain sysDomain);
}
