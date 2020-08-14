package com.demofactory.syscontrol.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Demo {
    private Long id;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
    private String name;
    private String url;
    private String remark;
    private Integer status;

    public Demo(Long id, LocalDateTime createTime, LocalDateTime modifyTime, String name, String url, String remark, Integer status) {
        this.id = id;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.name = name;
        this.url = url;
        this.remark = remark;
        this.status = status;
    }
}
