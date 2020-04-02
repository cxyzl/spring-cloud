package com.spring.cloud.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回给前端的通用view对象
 * @param <T>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code; //状态码
    private String msg;
    private T data;

    public CommonResult(Integer code, String msg) {
        this(code,msg,null);
    }
}
