package com.demofactory.syscontrol.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;


/**
 * @author FHX
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUser extends Base{
    private Long id;
    private Integer domainId;
    private Integer orgId;
    private String account;
    private String password;
    private String pwdPlaintext;
    private String pwdHint;
    private LocalDateTime lastLoginTime;
    private LocalDateTime pwdUpdateTime;
    private String userName;
    private Integer userSex;
    private String userEmail;
    private String userPhone;
    private Integer superFlag;
    private Integer status;

}
