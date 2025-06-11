package com.neusoft.elmcloud.controller;

import com.alibaba.fastjson.JSONObject;
import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.commonapi.enums.ResultEnum;
import com.neusoft.elmcloud.po.Food;
import com.neusoft.elmcloud.service.FoodService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/FoodController")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @RequestMapping("/listFoodByBusinessId")
    @CircuitBreaker(name = "listFoodByBusinessId", fallbackMethod = "fallback")
    public ResponseResult<List<Food>> listFoodByBusinessId(@ModelAttribute Food food) throws Exception {
        return foodService.listFoodByBusinessId(food.getBusinessId());
    }

    public ResponseResult fallback(Food query, Throwable ex) {

        log.error("服务降级记录", JSONObject.toJSONString(query));
        log.error(ex);
        return ResponseResult.getResult(ResultEnum.DEMOTE, null);
    }

}
