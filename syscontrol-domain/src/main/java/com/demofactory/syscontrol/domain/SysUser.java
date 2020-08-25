package com.demofactory.syscontrol.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;


/**
 * @author FHX
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUser extends Base {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long domainId;
    @JsonSerialize(using = ToStringSerializer.class)
    private Long orgId;
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
