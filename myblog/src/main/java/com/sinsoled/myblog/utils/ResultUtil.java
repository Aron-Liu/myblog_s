package com.sinsoled.myblog.utils;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 后端统一返回的规范
 *
 * @param <T>
 * @author sinsoled
 * @date 2021年3月16日22:26:27
 */
@Data
@Accessors(chain = true)    // 开启链式的结构
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)    // 返回的json对象不包含null
public class ResultUtil<T> {
    private Integer code;  // 响应码
    private String msg; // 返回的信息
    private T data; // 返回的数据

    private ResultUtil(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static <T> ResultUtil<T> success() {
        return new ResultUtil<T>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMsg());
    }

    public static <T> ResultUtil<T> success(String msg) {
        return new ResultUtil<T>(ResponseCode.SUCCESS.getCode(), msg);
    }

    public static <T> ResultUtil success(String msg, T data) {
        return success(msg).setData(data);
    }

    public static <T> ResultUtil<T> failure() {
        return new ResultUtil<T>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getMsg());
    }

    public static <T> ResultUtil<T> failure(String errMsg) {
        return new ResultUtil<T>(ResponseCode.ERROR.getCode(), errMsg);
    }

    public static <T> ResultUtil failure(String errMsg, T data) {
        return failure(errMsg).setData(data);
    }

}

