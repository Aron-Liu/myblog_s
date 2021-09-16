package com.sinsoled.myblog.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
    * 账号表
    */
@ApiModel(value="账号表")
@Data
@AllArgsConstructor
@Table(name = "SYS_account")
public class SysAccount implements Serializable {
    /**
     * 账号ID
     */
    @Id
    @Column(name = "aId")
    @ApiModelProperty(value="账号ID")
    private String aId;

    /**
     * 用户名
     */
    @Column(name = "username")
    @ApiModelProperty(value="用户名")
    private String username;

    /**
     * 密码
     */
    @Column(name = "`password`")
    @ApiModelProperty(value="密码")
    private String password;

    @Column(name = "`createUser`")
    @ApiModelProperty(value="")
    private String createUser;

    @Column(name = "autoCreateTime")
    @ApiModelProperty(value="")
    private Date autoCreateTime;

    @Column(name = "lastUpdateUser")
    @ApiModelProperty(value="")
    private String lastUpdateUser;

    @Column(name = "lastUpdateTime")
    @ApiModelProperty(value="")
    private Date lastUpdateTime;

    private static final long serialVersionUID = 1L;
}