package com.demofactory.syscontrol.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author FHX
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysOrg extends Base {

    private Integer domainId;
    private String orgName;
    private String orgCode;
    private String orgRemark;
}
