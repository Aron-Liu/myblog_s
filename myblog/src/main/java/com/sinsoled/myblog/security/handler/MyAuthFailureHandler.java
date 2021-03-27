package com.sinsoled.myblog.security.handler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sinsoled.myblog.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

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
@Component
@Slf4j
public class MyAuthFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        String exName = exception.getClass().getSimpleName();
        log.debug("exName --->>> " + exName);
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setContentType("application/json;charset=utf-8");
        switch (exName) {
            case "AccountExpiredException":
                response.getWriter().write(JSON.toJSONString(ResultUtil.failure("账户已过期")));
                break;
            case "UsernameNotFoundException":
                response.getWriter().write(JSON.toJSONString(ResultUtil.failure("找不到用户名")));
                break;
            case "BadCredentialsException":
                response.getWriter().write(JSONObject.toJSONString(ResultUtil.failure("凭证已过期")));
                break;
            case "LockedException":
                response.getWriter().write(JSONObject.toJSONString(ResultUtil.failure("账号被锁定")));
                break;
            default:
                log.trace("exName --->>> " + exName);
        }
    }

}
