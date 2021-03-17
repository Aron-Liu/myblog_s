package com.sinsoled.myblog.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 */
@Data
@AllArgsConstructor
public class BaseUser implements Serializable {
    /**
     * 主键id
     */
    private String id;

    /**
     * 账号的状态
     * 1、正常
     * 2、冻结
     * 3、封禁
     */
    private Integer state_flag;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

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