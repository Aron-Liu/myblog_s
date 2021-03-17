package com.sinsoled.myblog.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 权限表
 */
@Data
@AllArgsConstructor
public class BasePermission implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 权限url
     */
    private String authority;

    /**
     * 权限详情
     */
    private String description;

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