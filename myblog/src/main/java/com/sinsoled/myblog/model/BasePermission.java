package com.sinsoled.myblog.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 权限表
 */
@ApiModel(value = "com-sinsoled-myblog-model-BasePermission")
@Data
@AllArgsConstructor
@Table(name = "``base_permission``")
public class BasePermission implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "`id`")
    @ApiModelProperty(value = "主键")
    private String id;

    /**
     * 权限url
     */
    @Column(name = "`authority`")
    @ApiModelProperty(value = "权限url")
    private String authority;

    /**
     * 权限详情
     */
    @Column(name = "`description`")
    @ApiModelProperty(value = "权限详情")
    private String description;

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