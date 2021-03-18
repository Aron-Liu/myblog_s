package com.sinsoled.myblog.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@ApiModel(value = "com-sinsoled-myblog-model-BaseRolePermission")
@Data
@AllArgsConstructor
@Table(name = "``base_role_permission``")
public class BaseRolePermission implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "`id`")
    @ApiModelProperty(value = "主键")
    private String id;

    /**
     * 角色id
     */
    @Column(name = "`role_id`")
    @ApiModelProperty(value = "角色id")
    private String role_id;

    /**
     * 权限id
     */
    @Column(name = "`permission_id`")
    @ApiModelProperty(value = "权限id")
    private String permission_id;

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