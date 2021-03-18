package com.sinsoled.myblog.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 角色表
 */
@ApiModel(value = "com-sinsoled-myblog-model-BaseRole")
@Data
@AllArgsConstructor
@Table(name = "``base_role``")
public class BaseRole implements Serializable {
    /**
     * 主键id
     */
    @Id
    @Column(name = "`id`")
    @ApiModelProperty(value = "主键id")
    private String id;

    /**
     * 角色名称
     */
    @Column(name = "`role_name`")
    @ApiModelProperty(value = "角色名称")
    private String role_name;

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