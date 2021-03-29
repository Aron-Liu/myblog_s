package com.sinsoled.myblog.security.handler;

import com.alibaba.fastjson.JSON;
import com.sinsoled.myblog.security.UserAuth;
import com.sinsoled.myblog.utils.JwtTokenUtil;
import com.sinsoled.myblog.utils.ResponseCode;
import com.sinsoled.myblog.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 认证成功处理器, 登陆成功后向后端返回token信息
 *
 * @author sinsoled
 * @date 2021年3月20日00:18:33
 */
@Component
public class MyAuthSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        UserAuth userAuth = (UserAuth) authentication.getPrincipal();
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userAuth.getUserId());
        map.put("username", userAuth.getUsername());
        map.put("password", userAuth.getPassword());
        String token = jwtTokenUtil.generateToken(userAuth, map);
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setContentType("application/json;charset=utf-8");
        Map<String, Object> t = new HashMap<>();
        t.put("token", token);
        response.getWriter().write(JSON.toJSONString(ResultUtil.success(ResponseCode.LOGIN_SUCCESS.getCode(),ResponseCode.LOGIN_SUCCESS.getMsg(), t)));
    }
}
