package com.demofactory.syscontrol.domain;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author FHX
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysOrg extends Base {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long domainId;
    private String orgName;
    private String orgCode;
    private String orgRemark;
    private Integer status;
}
