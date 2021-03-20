package com.sinsoled.myblog.security.handler;

import com.alibaba.fastjson.JSON;
import com.sinsoled.myblog.utils.ResultUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sinsoled
 * @date 2021年3月20日00:24:25
 */
@Configuration
public class MyAuthEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException {
        response.getWriter().write(JSON.toJSONString(ResultUtil.failure("登录超时, 请重新登录!")));
    }
}
