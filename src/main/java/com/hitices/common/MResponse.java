package com.hitices.common;

import lombok.Getter;

/**
 * @author septemberhx
 * @date 2021/7/6
 **/

@Getter
public class MResponse<T> {
    private T data;
    private String status;
    private int code;

    public MResponse<T> setData(T data){
        this.data = data;
        return this;
    }

    public MResponse<T> setCode(int code){
        this.code = code;
        return this;
    }

    public MResponse<T> setStatus(String status){
        this.status = status;
        return this;
    }

    public static MResponse successMResponse(){
        return new MResponse().setCode(1).setStatus("success");
    }

    public static MResponse failedMResponse(){
        return new MResponse().setCode(0).setStatus("failed");
    }
}