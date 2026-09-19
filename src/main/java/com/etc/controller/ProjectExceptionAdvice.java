package com.etc.controller;

import com.etc.exception.BusinessException;
import com.etc.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Crayon
 * @ClassName ProjectExceptionAdvice
 * @description
 * @date 2026/9/19 14:33
 */

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(value= SystemException.class)
    public Result doSystemException(SystemException e) {
        return new Result(e.getCode(),null,e.getMessage());
    }

    @ExceptionHandler(value=BusinessException.class)
    public Result doBusinessException(BusinessException e) {
        return new Result(e.getCode(),null,e.getMessage());
    }

    @ExceptionHandler(value=Exception.class)
    public Result doException(Exception e) {
        return new Result(Code.UNKNOWN_ERR,null,"系统繁忙，请稍后再试");
    }
}
