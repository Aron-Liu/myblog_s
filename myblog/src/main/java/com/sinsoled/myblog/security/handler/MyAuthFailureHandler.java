package com.sinsoled.myblog.security.handler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sinsoled.myblog.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 认证失败处理器
 *
 * @author sinsoled
 * @date 2021年3月20日00:19:01
 */
@Configuration
@Slf4j
public class MyAuthFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        String exName = exception.getClass().getSimpleName();
        switch (exName) {
            case "AccountExpiredException":
                response.getWriter().write(JSON.toJSONString(ResultUtil.failure("accountExpired")));
                break;
            case "UsernameNotFoundException":
                response.getWriter().write(JSON.toJSONString(ResultUtil.failure("usernameNotFound")));
                break;
            case "BadCredentialsException":
                response.getWriter().write(JSONObject.toJSONString(ResultUtil.failure("passwordError")));
                break;
            case "LockedException":
                response.getWriter().write(JSONObject.toJSONString(ResultUtil.failure("disabledAccount")));
                break;
            default:
                log.trace("exName" + exName);
        }
    }

}