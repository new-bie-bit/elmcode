package com.neusoft.elmcloud.service;

import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.po.Food;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RefreshScope
@FeignClient(value = "${service.provider.business.name}")
public interface FoodService {

    @RequestMapping("/FoodService/listFoodByBusinessId")
    public ResponseResult<List<Food>> listFoodByBusinessId(@RequestParam("businessId") Integer businessId);
}
