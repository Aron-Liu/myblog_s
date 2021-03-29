package com.sinsoled.myblog.utils;

/**
 * 响应码枚举类
 *
 * @author sinsoled
 * @date 2021年3月16日22:01:39
 */
public enum ResponseCode {
    SUCCESS(700, "SUCCESS"),
    LOGIN_SUCCESS(701,"登陆成功"),
    ERROR(800, "ERROR"),
    PLEASE_LOGIN(801, "pleaseLogIn"),                // 请登录
    PERMISSION_DENIED(802, "permissionDenied"),      // 权限不足
    ;


    private final Integer code;
    private final String msg;

    ResponseCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
