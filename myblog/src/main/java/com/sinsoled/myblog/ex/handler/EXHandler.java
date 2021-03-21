package com.sinsoled.myblog.ex.handler;

import com.sinsoled.myblog.ex.BaseException;
import com.sinsoled.myblog.ex.ServiceException;
import com.sinsoled.myblog.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理
 *
 * @author sinsoled
 * @date 2021年3月21日14:30:37
 */
@RestControllerAdvice
@Slf4j
public class EXHandler {

    @ExceptionHandler({BaseException.class, ServiceException.class})
    public ResultUtil handleException(Exception e) {
        String eN = e.getClass().getSimpleName();
        log.debug("EXHandler: " + eN);
        switch (eN) {
            case "BaseException":
                BaseException baseException = (BaseException) e;
                return ResultUtil.failure(baseException.getCode(), baseException);

            default:
                return ResultUtil.failure("系统繁忙！");
        }
    }

}
