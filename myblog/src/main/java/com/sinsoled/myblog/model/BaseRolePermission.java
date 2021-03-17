package com.sinsoled.myblog.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class BaseRolePermission implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 角色id
     */
    private String role_id;

    /**
     * 权限id
     */
    private String permission_id;

    /**
     * 排序标记
     */
    private Integer order_flag;

    /**
     * 删除标记
     */
    private Integer delete_flag;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 修改时间
     */
    private Date update_time;

    private static final long serialVersionUID = 1L;
}