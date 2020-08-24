package com.demofactory.syscontrol.common;

import java.io.Serializable;
import java.util.Objects;

public class Result implements Serializable {
    private static final int SUCCESS = 200;
    private static final int FAILED = 500;
    private static final long serialVersionUID = 2267751680865696851L;
    private int code;
    /**
     * 返回消息
     **/
    private String message;
    /**
     * 返回数据
     **/
    private Object data;

    /**
     * 是否成功
     **/
    private Boolean success = false;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public static int getSUCCESS() {
        return SUCCESS;
    }

    public static int getFAILED() {
        return FAILED;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result(){

    }
    public Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(int code,String message)
    {
        this.code = code;
        this.message = message;
    }

    public static Result ok(Object data) {
        return new Result(SUCCESS, "success", data);
    }
    public static Result OK(String message) {
        return new Result(SUCCESS, message);
    }
    public static Result failure(String message) {return new Result(FAILED,message);}
}
