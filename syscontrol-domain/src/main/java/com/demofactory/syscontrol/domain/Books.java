package com.demofactory.syscontrol.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author FHX
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Books extends Base {
    private Integer domainId;
    private String bookName;
    private String bookUrl;
}
