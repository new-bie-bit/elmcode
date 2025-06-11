package com.neusoft.elmcloud.commonapi.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SimpleKey<T> {
    @NotNull(message = "key不可为空")
    private T key;
}
