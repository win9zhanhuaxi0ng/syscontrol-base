package com.demofactory.syscontrol.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author FHX
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysDomain extends Base {
    private String name;
    private String url;
    private String remark;
    private Integer status;
}
