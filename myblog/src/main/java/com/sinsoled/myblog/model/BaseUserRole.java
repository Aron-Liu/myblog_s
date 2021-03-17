package com.sinsoled.myblog.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户角色表
 */
@Data
@AllArgsConstructor
public class BaseUserRole implements Serializable {
    /**
     * 主键id
     */
    private String id;

    /**
     * 用户id
     */
    private String user_id;

    /**
     * 角色id
     */
    private String role_id;

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