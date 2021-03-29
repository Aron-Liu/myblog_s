package com.sinsoled.myblog.security.handler;

import com.sinsoled.myblog.security.UserAuth;
import com.sinsoled.myblog.utils.JwtTokenUtil;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author GuJun
 * @date 2019年11月11日 12:55
 * 每次请求处理请求中的token
 */
@Component
public class JwtAuthorizationTokenFilter extends OncePerRequestFilter {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Value("${jwt.token}")
    private String tokenHeader;

//    @Autowired
//    private RedisTemplate redisTemplate;

    private static final PathMatcher pathMatcher = new AntPathMatcher();

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (isProtectedUrl(request)) {    // 若是登录请求
            filterChain.doFilter(request, response);
        } else {
            final String authToken = request.getHeader(this.tokenHeader);
            String antiToken = request.getParameter("token");
            String username = null;
            if (authToken != null && antiToken != null && authToken.equals(antiToken)) {
                try {
                    username = jwtTokenUtil.getUsernameFromToken(authToken);
                } catch (Exception e) {

                }
            }
            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                Claims claims = jwtTokenUtil.getAllClaimsFromToken(authToken);
                UserDetails userDetails = new UserAuth(
                        (String) claims.get("userId"),
                        (String) claims.get("username"),
                        (String) claims.get("password"),
                        true,
                        true,
                        true,
                        true,
                        null);
                if (jwtTokenUtil.validateToken(authToken, userDetails)) {
                    UsernamePasswordAuthenticationToken authentication
                            = new UsernamePasswordAuthenticationToken(userDetails, null, null);
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }
            }
            filterChain.doFilter(request, response);
        }
    }

//    private Object getVerifyCode() {
//        // 获取当前线程绑定的request对象
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        // 获取ip
//        String ip = request.getHeader("x-forwarded-for");
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("Proxy-Client-IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("WL-Proxy-Client-IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getRemoteAddr();
//        }
//        // 不分区大小写
//        return redisTemplate.opsForValue().get("verifyCode" + ip);
//    }

    // 拦截 /login的POST请求
    private boolean isProtectedUrl(HttpServletRequest request) {
        return "POST".equals(request.getMethod()) && pathMatcher.match("/login", request.getServletPath());
    }

}
