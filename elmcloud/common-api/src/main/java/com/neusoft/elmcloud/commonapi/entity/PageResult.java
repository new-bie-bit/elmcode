package com.neusoft.elmcloud.commonapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PageResult<T> {

    private long total;

    private List<T> list;
}
