package com.neusoft.elmcloud.service;

import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.po.Business;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RefreshScope
@FeignClient(value = "${service.provider.business.name}")
public interface BusinessService {

    @RequestMapping("/BusinessService/listBusinessByOrderTypeId")
    public ResponseResult<List<Business>> listBusinessByOrderTypeId(@RequestParam("orderTypeId") Integer orderTypeId);

    @RequestMapping("/BusinessService/getBusinessById")
    public ResponseResult<Business> getBusinessById(@RequestParam("businessId") Integer businessId);
}
