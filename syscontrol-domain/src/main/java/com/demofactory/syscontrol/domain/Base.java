package com.demofactory.syscontrol.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Base {
    private Long id;
    private LocalDateTime creteTime;
    private LocalDateTime modifyTime;

}
