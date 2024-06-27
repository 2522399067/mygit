package com.lz.controller.utlid;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//作为springmvc的异常处理器
@RestControllerAdvice
public class ProjecExcptionAdivce {
//拦截所有异常
    @ExceptionHandler(Exception.class)
    public  R  doExcpiton(Exception ex){
        ex.printStackTrace();
        return new R("服务器故障请联系管理员");

    }
}
