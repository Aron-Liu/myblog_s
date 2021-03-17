package com.sinsoled.myblog.model;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
    * 角色表
    */
@Data
@AllArgsConstructor
public class BaseRole implements Serializable {
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

    private static final long serialVersionUID = 1L;
}