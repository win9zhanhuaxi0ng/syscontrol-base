package com.demofactory.syscontrol.domain.dto;

import com.demofactory.syscontrol.domain.Base;
import com.demofactory.syscontrol.domain.SysUser;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * @author FHX
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUserDTO extends SysUser {
    private String secondaryPwd;

}
