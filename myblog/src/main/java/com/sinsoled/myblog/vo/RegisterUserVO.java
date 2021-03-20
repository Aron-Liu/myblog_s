package com.sinsoled.myblog.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RegisterUserVO {
    @ApiModelProperty(value = "用户名", required = true, dataType = "String")
    private String username;
    @ApiModelProperty(value = "密码", required = true, dataType = "String")
    private String password;
    @ApiModelProperty(value = "邮箱", required = true, dataType = "String")
    private String email;
//    @ApiModelProperty(value = "手机号", required = true, dataType = "Integer")
//    private String phone;
}
