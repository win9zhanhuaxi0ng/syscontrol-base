package com.demofactory.syscontrol.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Base implements Serializable {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;

}
