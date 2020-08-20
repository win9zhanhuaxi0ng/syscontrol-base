package com.demofactory.syscontrol.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserBook implements Serializable {
    private Long id;
    private Long bookId;
    private Long userId;
}
