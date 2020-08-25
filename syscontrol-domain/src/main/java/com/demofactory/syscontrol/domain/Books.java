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
public class Books extends Base {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long domainId;
    private String bookName;
    private String bookUrl;
}
