package com.neusoft.elmcloud.controller;

import com.alibaba.fastjson.JSONObject;
import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.commonapi.enums.ResultEnum;
import com.neusoft.elmcloud.po.DeliveryAddress;
import com.neusoft.elmcloud.service.DeliveryAddressService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/DeliveryAddressController")
public class DeliveryAddressController {

    @Autowired
    private DeliveryAddressService deliveryAddressService;

    @RequestMapping("/listDeliveryAddressByUserId")
    @CircuitBreaker(name = "listDeliveryAddressByUserId", fallbackMethod = "fallback")
    public ResponseResult<List<DeliveryAddress>> listDeliveryAddressByUserId(DeliveryAddress deliveryAddress) throws Exception {
        return deliveryAddressService.listDeliveryAddressByUserId(deliveryAddress.getUserId());
    }

    @RequestMapping("/getDeliveryAddressById")

    @CircuitBreaker(name = "getDeliveryAddressById", fallbackMethod = "fallback")
    public ResponseResult<DeliveryAddress> getDeliveryAddressById(DeliveryAddress deliveryAddress) throws Exception {
        return deliveryAddressService.getDeliveryAddressById(deliveryAddress.getDaId());
    }

    @RequestMapping("/saveDeliveryAddress")
    @CircuitBreaker(name = "saveDeliveryAddress", fallbackMethod = "fallback")
    public ResponseResult<Integer> saveDeliveryAddress(DeliveryAddress deliveryAddress) throws Exception {
        return deliveryAddressService.saveDeliveryAddress(deliveryAddress);
    }

    @RequestMapping("/updateDeliveryAddress")
    @CircuitBreaker(name = "updateDeliveryAddress", fallbackMethod = "fallback")
    public ResponseResult<Integer> updateDeliveryAddress(DeliveryAddress deliveryAddress) throws Exception {
        return deliveryAddressService.updateDeliveryAddress(deliveryAddress);
    }

    @RequestMapping("/removeDeliveryAddress")
    @CircuitBreaker(name = "removeDeliveryAddress", fallbackMethod = "fallback")
    public ResponseResult<Integer> removeDeliveryAddress(DeliveryAddress deliveryAddress) throws Exception {
        return deliveryAddressService.removeDeliveryAddress(deliveryAddress.getDaId());
    }

    public ResponseResult fallback(DeliveryAddress query, Throwable ex) {

        log.error("服务降级记录", JSONObject.toJSONString(query));
        log.error(ex);
        return ResponseResult.getResult(ResultEnum.DEMOTE, null);
    }

}
