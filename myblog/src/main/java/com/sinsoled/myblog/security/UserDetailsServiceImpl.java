package com.sinsoled.myblog.security;

import com.sinsoled.myblog.dto.BaseUserDTO;
import com.sinsoled.myblog.service.impl.BaseUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * 实现 UserDetailsService接口 获取登录用户的信息, 交给framework管理
 *
 * @author lwf
 */
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    BaseUserServiceImpl baseUserService;

    /**
     * .password("{bcrypt}$2a$10$H1LApUblBfXY/A3gwIvhUe2TSOU1CfFvyoAh1VpS1ZLpOloDL8z06")
     * Spring Security允许在密文的密码值之前添加算法ID，则不需要指定密码加密器，SpringSecurity也会根据算法ID自动使用相应的算法来验证密码！
     *
     * @param s 用户名
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        BaseUserDTO baseUserDTO = baseUserService.login(s);


//
//        List<BasePermissionDTO> basePermissionDTOS = baseLoginUserDTO.getBasePermissionDTOS();
//        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
//        for (BasePermissionDTO permissionDTO : basePermissionDTOS) {
//            SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permissionDTO.getAuthority());
//            grantedAuthorities.add(grantedAuthority);
//        }

//        LoginUserInfo loginUserInfo = new LoginUserInfo(
//                baseLoginUserDTO.getUsername(),
//                baseLoginUserDTO.getPassword(),
//                true,
//                true,
//                true,
//                true,
//                grantedAuthorities
//        );
//
//        loginUserInfo.setUserId(baseLoginUserDTO.getId());
//        loginUserInfo.setNickname(baseLoginUserDTO.getNickname());

        return null;
    }
}
