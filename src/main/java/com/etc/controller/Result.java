package com.etc.controller;

/**
 * @author Crayon
 * @ClassName Result
 * @description
 * @date 2026/9/19 14:12
 */

public class Result {
    private Integer code;
    private Object data;
    private String msg;

    public Result() {
        super();
    }

    public Result(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public Result(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
