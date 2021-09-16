package com.sinsoled.myblog.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
    * 用户表
    */
@ApiModel(value="用户表")
@Data
@AllArgsConstructor
@Table(name = "SYS_user")
public class SysUser implements Serializable {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "userId")
    @ApiModelProperty(value="用户ID")
    private String userId;

    /**
     * 用户编码
     */
    @Column(name = "userCode")
    @ApiModelProperty(value="用户编码")
    private String userCode;

    /**
     * 用户的账号ID
     */
    @Column(name = "aId")
    @ApiModelProperty(value="用户的账号ID")
    private String aId;

    /**
     * 用户姓名
     */
    @Column(name = "`name`")
    @ApiModelProperty(value="用户姓名")
    private String name;

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