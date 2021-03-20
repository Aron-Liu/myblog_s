package com.sinsoled.myblog.security.handler;

import com.alibaba.fastjson.JSON;
import com.sinsoled.myblog.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 访问拒绝处理
 */
@Configuration
@Slf4j
public class MyAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        log.debug("没有权限访问");
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(JSON.toJSONString(ResultUtil.failure("没有权限访问")));
    }
}
