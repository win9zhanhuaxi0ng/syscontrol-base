package com.demofactory.syscontrol.common;
import lombok.Data;

import java.io.Serializable;

/**
 * @author : Hanamaru
 * @description: TODO
 * @date : 2020/8/25 9:42
 * @param <T>
 */
@Data
public class ObjResult<T> implements Serializable
{
    private boolean success;
    private  String code;
    private String message;
    private T obj;

    public ObjResult()
    {}

    public ObjResult(boolean success, String message, String code) {
        this.success = success;
        this.message = message;
        this.code = code;
    }


    public static <T> ObjResult<T> success(String msg)
    {
        return  new ObjResult<T>(true,msg,StatusCode.SUCCESS);
    }

    public static <T> ObjResult<T> failure(String msg)
    {
        return new ObjResult<T>(false,msg,StatusCode.FAIL);
    }
}
