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
@ApiModel(value = "com-sinsoled-myblog-model-BaseUser")
@Data
@AllArgsConstructor
@Table(name = "``base_user``")
public class BaseUser implements Serializable {
    /**
     * 主键id
     */
    @Id
    @Column(name = "`id`")
    @ApiModelProperty(value = "主键id")
    private String id;

    /**
     * 账号的状态
     * 1、正常
     * 2、冻结
     * 3、封禁
     */
    @Column(name = "`state_flag`")
    @ApiModelProperty(value = "账号的状态,1、正常,2、冻结,3、封禁")
    private Integer state_flag;

    /**
     * 用户名
     */
    @Column(name = "`username`")
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
     * 密码
     */
    @Column(name = "`password`")
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 排序标记
     */
    @Column(name = "`order_flag`")
    @ApiModelProperty(value = "排序标记")
    private Integer order_flag;

    /**
     * 删除标记
     */
    @Column(name = "`delete_flag`")
    @ApiModelProperty(value = "删除标记")
    private Integer delete_flag;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    @ApiModelProperty(value = "创建时间")
    private Date create_time;

    /**
     * 修改时间
     */
    @Column(name = "`update_time`")
    @ApiModelProperty(value = "修改时间")
    private Date update_time;

    private static final long serialVersionUID = 1L;
}