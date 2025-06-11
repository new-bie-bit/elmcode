package com.neusoft.elmcloud.service;

import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.po.DeliveryAddress;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RefreshScope
@FeignClient(value = "${service.provider.business.name}")
public interface DeliveryAddressService {

    @RequestMapping("/DeliveryAddressService/listDeliveryAddressByUserId")
    public ResponseResult<List<DeliveryAddress>> listDeliveryAddressByUserId(@RequestParam("userId") String userId);

    @RequestMapping("/DeliveryAddressService/getDeliveryAddressById")
    public ResponseResult<DeliveryAddress> getDeliveryAddressById(@RequestParam("daId") Integer daId);

    @RequestMapping(value = "/DeliveryAddressService/saveDeliveryAddress", method = RequestMethod.POST)
    public ResponseResult<Integer> saveDeliveryAddress(@RequestBody DeliveryAddress deliveryAddress);

    @RequestMapping(value = "/DeliveryAddressService/updateDeliveryAddress", method = RequestMethod.POST)
    public ResponseResult<Integer> updateDeliveryAddress(@RequestBody DeliveryAddress deliveryAddress);

    @RequestMapping("/DeliveryAddressService/removeDeliveryAddress")
    public ResponseResult<Integer> removeDeliveryAddress(@RequestParam("daId") Integer daId);
}
