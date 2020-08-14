package com.keven.shiro.cas.demo.handler;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName : KevenExceptionHandler
 * @Description : 注解验证角色和权限的话无法捕捉异常，无法正确的返回给前端错误信息，所以加了一个类用于拦截异常
 * @Author : Keven
 */
@ControllerAdvice
@Slf4j
public class KevenExceptionHandler {
    @ExceptionHandler
    @ResponseBody
    public String ErrorHandler(AuthorizationException e) {
        //log.error("没有通过权限验证！", e);
        return "没有通过权限验证！";
    }
}
