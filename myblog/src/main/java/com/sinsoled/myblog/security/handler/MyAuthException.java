package com.sinsoled.myblog.security.handler;


import org.springframework.security.core.AuthenticationException;

/**
 * 自定义的身份认证异常
 * @author sinsoled
 * @date 2021年3月28日03:05:18
 */
public class MyAuthException extends AuthenticationException {

    private String msg;

    public MyAuthException(String msg) {
        super(msg);
    }

    public MyAuthException(String msg, Throwable t) {
        super(msg, t);
    }

}
