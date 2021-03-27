package com.sinsoled.myblog.security;

import com.sinsoled.myblog.dto.BasePermissionDTO;
import com.sinsoled.myblog.dto.BaseRoleDTO;
import com.sinsoled.myblog.dto.LoginUser;
import com.sinsoled.myblog.security.handler.MyAuthException;
import com.sinsoled.myblog.service.impl.BasePermissionServiceImpl;
import com.sinsoled.myblog.service.impl.BaseRoleServiceImpl;
import com.sinsoled.myblog.service.impl.BaseUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * 实现 UserDetailsService接口 获取登录用户的信息, 交给framework管理
 *
 * @author lwf
 */
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    BaseUserServiceImpl baseUserService;

    @Autowired
    BaseRoleServiceImpl baseRoleService;

    @Autowired
    BasePermissionServiceImpl basePermissionService;

    /**
     * password("{bcrypt}$2a$10$H1LApUblBfXY/A3gwIvhUe2TSOU1CfFvyoAh1VpS1ZLpOloDL8z06")
     * Spring Security允许在密文的密码值之前添加算法ID，则不需要指定密码加密器，SpringSecurity也会根据算法ID自动使用相应的算法来验证密码！
     *
     * @param s 用户名
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String s) {
        if (s.isEmpty()) {
            throw new UsernameNotFoundException("请输入用户名登录");
        }
        LoginUser loginUser = baseUserService.login(s);
        if (loginUser != null) {
            List<BaseRoleDTO> baseRoleDTOS = baseRoleService.queryRoleByUsername(loginUser.getUsername());
            List<BasePermissionDTO> basePermissionDTOList = new ArrayList<>();
            for (BaseRoleDTO baseRoleDTO : baseRoleDTOS) {
                List<BasePermissionDTO> basePermissionDTOS = basePermissionService.queryPermissionByRoleId(baseRoleDTO.getId());
                basePermissionDTOList.addAll(basePermissionDTOS);
            }

            // 去重
            TreeSet<BasePermissionDTO> basePermissionDTOS = new TreeSet<>(basePermissionDTOList);
            basePermissionDTOList.clear();
            List<BasePermissionDTO> permissionDTOS = new ArrayList<>(basePermissionDTOS);
            basePermissionDTOS.clear();

            List<GrantedAuthority> authorities = new ArrayList<>();

            SimpleGrantedAuthority simpleGrantedAuthority = null;

            for (BasePermissionDTO permissionDTO : permissionDTOS) {
                simpleGrantedAuthority = new SimpleGrantedAuthority(permissionDTO.getAuthority());
                authorities.add(simpleGrantedAuthority);

            }

            UserAuth userAuth = new UserAuth(
                    loginUser.getId(),
                    loginUser.getUsername(),
                    loginUser.getPassword(),
                    loginUser.getState_flag() != 0,
                    loginUser.getState_flag() != 1,
                    loginUser.getState_flag() != 2,
                    loginUser.getState_flag() != 3,
                    authorities
            );


            return userAuth;
        } else {
            throw new MyAuthException("账号或密码存在错误");
        }

    }

}
