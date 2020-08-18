package com.demofactory.syscontrol.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Base implements Serializable {
    private Long id;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;

}
