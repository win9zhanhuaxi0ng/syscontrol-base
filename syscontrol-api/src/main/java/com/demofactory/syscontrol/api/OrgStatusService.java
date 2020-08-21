package com.demofactory.syscontrol.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demofactory.syscontrol.domain.SysOrg;

/**
 * @author:Hanamaru
 * @description: TODO
 * @date: 2020/8/20 13:45
 */
public interface OrgStatusService extends IService<SysOrg> {
    /**
     * 通过id status 更改 sysOrg user 的status
     *
     * @param sysOrg
     * @return
     */
    String orgStatusUpdate(SysOrg sysOrg);
}
