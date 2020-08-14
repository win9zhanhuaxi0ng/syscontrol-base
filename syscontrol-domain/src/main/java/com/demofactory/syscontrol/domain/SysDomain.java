package com.demofactory.syscontrol.domain;


import lombok.Data;

/**
 * @author FHX
 */
@Data
public class SysDomain extends Base{
    private String name;
    private String url;
    private String remark;
    private Integer status;
}
