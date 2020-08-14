package com.demofactory.syscontrol.domain;


import lombok.Data;

/**
 * @author FHX
 */
@Data
public class SysOrg extends Base {

    private Integer domainId;
    private String orgName;
    private String orgCode;
    private String orgRemark;
}
