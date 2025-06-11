package com.neusoft.elmcloud.service;

import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.po.Orders;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RefreshScope
@FeignClient(value = "${service.provider.business.name}")
public interface OrdersService {

    @RequestMapping(value = "/OrdersService/createOrders", method = RequestMethod.POST)
    public ResponseResult<Integer> createOrders(@RequestBody Orders orders);

    @RequestMapping("/OrdersService/getOrdersById")
    public ResponseResult<Orders> getOrdersById(@RequestParam("orderId") Integer orderId);

    @RequestMapping("/OrdersService/listOrdersByUserId")
    public ResponseResult<List<Orders>> listOrdersByUserId(@RequestParam("userId") String userId);
}
