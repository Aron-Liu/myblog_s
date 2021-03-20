package com.sinsoled.myblog.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 登录人
 *
 * @author sinsoled
 * @date 2021年3月17日23:01:34
 */
@Data
public class LoginUser implements Serializable {
    private String id;
    private Integer state_flag;
    private String username;
    private String password;


    private static final long serialVersionUID = 1L;
}