package com.sinsoled.myblog.utils;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 密码工具
 *
 * @author sinsoled
 */
public class PWUtil {

    private static PasswordEncoder passwordEncoder;

    public static String BCryptEncoder(String rawPassword) {
        passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(rawPassword);
    }

    private static boolean match(PasswordEncoder encoder, String rawPassword, String password) {
        String name = encoder.getClass().getSimpleName();
        switch (name) {
            case "BCryptPasswordEncoder":
                passwordEncoder = new BCryptPasswordEncoder();
                return passwordEncoder.matches(rawPassword, password);
            case "":
                return true;
            default:
                return false;
        }
    }

}
