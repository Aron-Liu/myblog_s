package com.sinsoled.myblog.security.handler;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * UsernamePasswordAuthenticationFilter本身不是过滤器，而是继承了AbstractAuthenticationProcessingFilter才拥有过滤器的性能。
 *
 * @author sinsoled
 * @date 2021年3月21日15:53:18
 */
public class MyUsernamePasswordFilter extends UsernamePasswordAuthenticationFilter {


    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {



        return super.attemptAuthentication(request, response);
    }
}
