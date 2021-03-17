package com.sinsoled.myblog.controller;

import com.sinsoled.myblog.utils.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResultUtil test() {
        return ResultUtil.success();
    }

}
