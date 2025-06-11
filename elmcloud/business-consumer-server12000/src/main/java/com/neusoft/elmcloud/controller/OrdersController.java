package com.neusoft.elmcloud.controller;

import com.alibaba.fastjson.JSONObject;
import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.commonapi.enums.ResultEnum;
import com.neusoft.elmcloud.po.Orders;
import com.neusoft.elmcloud.service.OrdersService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/OrdersController")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/createOrders")
    @CircuitBreaker(name = "createOrders", fallbackMethod = "fallback")
    public ResponseResult<Integer> createOrders(@ModelAttribute Orders orders) throws Exception {
        return ordersService.createOrders(orders);
    }

    @RequestMapping("/getOrdersById")
    @CircuitBreaker(name = "getOrdersById", fallbackMethod = "fallback")
    public ResponseResult<Orders> getOrdersById(@ModelAttribute Orders orders) throws Exception {
        return ordersService.getOrdersById(orders.getOrderId());
    }

    @RequestMapping("/listOrdersByUserId")
    @CircuitBreaker(name = "listOrdersByUserId", fallbackMethod = "fallback")
    public ResponseResult<List<Orders>> listOrdersByUserId(@ModelAttribute Orders orders) throws Exception {
        return ordersService.listOrdersByUserId(orders.getUserId());
    }

    public ResponseResult fallback(Orders query, Throwable ex) {

        log.error("服务降级记录", JSONObject.toJSONString(query));
        log.error(ex);
        return ResponseResult.getResult(ResultEnum.DEMOTE, null);
    }

}
