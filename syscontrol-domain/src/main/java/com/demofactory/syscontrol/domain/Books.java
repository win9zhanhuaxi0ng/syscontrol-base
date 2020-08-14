package com.demofactory.syscontrol.domain;


import lombok.Data;

/**
 * @author FHX
 */
@Data
public class Books extends Base{
    private Integer userId;
    private String bookName;
    private String bookUrl;
}
