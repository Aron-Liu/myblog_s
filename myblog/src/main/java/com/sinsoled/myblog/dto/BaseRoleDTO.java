package com.sinsoled.myblog.dto;


import lombok.Data;

import java.util.Date;

@Data
public class BaseRoleDTO {
    /**
     * 主键id
     */
    private String id;

    /**
     * 角色名称
     */
    private String role_name;

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
}
