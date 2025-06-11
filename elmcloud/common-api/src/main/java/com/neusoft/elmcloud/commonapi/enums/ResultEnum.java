package com.neusoft.elmcloud.commonapi.enums;

public enum ResultEnum {
    SUCCESS(0, "请求成功"),
    FAILED(-1, "请求失败"),
    DEMOTE(1000, "服务降级"),
    GATEWAY_FAILED(5001, "网关异常");

    private Number code;
    private String message;

    private ResultEnum(Number code, String message) {
        this.code = code;
        this.message = message;
    }

    public Number getCode() {
        return code;
    }

    public void setCode(Number code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
