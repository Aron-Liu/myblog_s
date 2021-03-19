package com.sinsoled.myblog.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 登录人
 *
 * @author sinsoled
 * @date 2021年3月17日23:01:34
 */
@Data
public class LoginUser implements Serializable {
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