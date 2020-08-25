package com.demofactory.syscontrol.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demofactory.syscontrol.common.Result;
import com.demofactory.syscontrol.domain.SysOrg;

import java.util.List;

/**
 * @author:Hanamaru
 * @description: TODO
 * @date: 2020/8/20 13:45
 */
public interface OrgStatusService extends IService<SysOrg>
{
    /**
     * 通过id status 更改 sysOrg user 的status
     *
     * @param sysOrg
     * @return
     */
    Result orgStatusUpdate(SysOrg sysOrg);

    /**
     * 通过domainid id 查询机构
     *
     * @param sysOrg
     * @return
     */
    List<SysOrg> selectSysOrg(SysOrg sysOrg);

    /**
     * 通过domainId id 插入org
     *
     * @param sysOrg
     * @return
     */
    Result insertSysOrg(SysOrg sysOrg);
}
