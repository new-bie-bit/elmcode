package com.neusoft.elmcloud.commonapi.entity;

import com.neusoft.elmcloud.commonapi.enums.ResultEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult<T> {
    private long timestamp;
    private Number code;
    private String msg;
    private T data;


    public static <T> ResponseResult<T> success() {
        return success(null);
    }

    public static <T> ResponseResult<T> success(T data) {
        return getResult(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), data);
    }

    public static <T> ResponseResult<T> success(Number code, String message) {
        return getResult(code, message, null);
    }

    public static <T> ResponseResult<T> success(Number code, String message, T data) {
        return getResult(code, message, data);
    }

    public static <T> ResponseResult<T> fail() {
        return fail(null);
    }

    public static <T> ResponseResult<T> fail(T data) {
        return getResult(ResultEnum.FAILED.getCode(), ResultEnum.FAILED.getMessage(), data);
    }

    public static <T> ResponseResult<T> fail(Number code, String message) {
        return getResult(code, message, null);
    }

    public static <T> ResponseResult<T> fail(Number code, String message, T data) {
        return getResult(code, message, data);
    }

    public static <T> ResponseResult<T> getResult(ResultEnum resultEnum, T data) {
        return getResult(resultEnum.getCode(), resultEnum.getMessage(), data);
    }

    public static <T> ResponseResult<PageResult<T>> pageList(long total, List<T> dataList) {
        return success(new PageResult<T>(total, dataList));
    }

    public static <T> ResponseResult<T> getResult(Number code, String message, T data) {
        return ResponseResult.<T>builder().data(data)
                .msg(message)
                .code(code)
                .timestamp(System.currentTimeMillis())
                .build();
    }


}
