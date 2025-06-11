package com.neusoft.elmcloud.controller;

import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.commonapi.enums.ResultEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class consumerServicefallback {
    @RequestMapping(value = "/fallback", method = RequestMethod.GET)
    public ResponseResult GetCommonResult() {
        return ResponseResult.getResult(ResultEnum.DEMOTE, null);
    }
}
