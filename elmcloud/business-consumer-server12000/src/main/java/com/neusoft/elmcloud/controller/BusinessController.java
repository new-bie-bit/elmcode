package com.neusoft.elmcloud.controller;


import com.alibaba.fastjson.JSONObject;
import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.commonapi.enums.ResultEnum;
import com.neusoft.elmcloud.po.Business;
import com.neusoft.elmcloud.service.BusinessService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/BusinessController")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @RequestMapping("/listBusinessByOrderTypeId")
    @CircuitBreaker(name = "listBusinessByOrderTypeId", fallbackMethod = "fallback")
    public ResponseResult<List<Business>> listBusinessByOrderTypeId(@ModelAttribute Business business) throws Exception {
        return businessService.listBusinessByOrderTypeId(business.getOrderTypeId());
    }

    @RequestMapping("/getBusinessById")
    @CircuitBreaker(name = "getBusinessById", fallbackMethod = "fallback")
    public ResponseResult<Business> getBusinessById(@ModelAttribute Business business) throws Exception {
        return businessService.getBusinessById(business.getBusinessId());
    }

    public ResponseResult fallback(Business query, Throwable ex) {

        log.error("服务降级记录", JSONObject.toJSONString(query));
        log.error(ex);
        return ResponseResult.getResult(ResultEnum.DEMOTE, null);
    }

}
