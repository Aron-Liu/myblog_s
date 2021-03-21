package com.sinsoled.myblog.controller;

import com.sinsoled.myblog.service.BaseUserService;
import com.sinsoled.myblog.utils.ResultUtil;
import com.sinsoled.myblog.vo.RegisterUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/baseUser")
public class BaseUserController {

    @Autowired
    private BaseUserService baseUserService;

    @PostMapping("/register")
    public ResultUtil register(RegisterUserVO registerUserVO){
        return baseUserService.register(registerUserVO);
    }

}
