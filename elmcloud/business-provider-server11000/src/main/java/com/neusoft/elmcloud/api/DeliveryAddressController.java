package com.neusoft.elmcloud.api;

import com.neusoft.elmcloud.application.DeliveryAddressApplicationService;
import com.neusoft.elmcloud.application.DeliveryAddressQueryService;
import com.neusoft.elmcloud.application.command.DeliveryAddressCommand;
import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.po.DeliveryAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/DeliveryAddressService")
public class DeliveryAddressController {

    @Autowired
    private DeliveryAddressApplicationService deliveryAddressService;

    @Autowired
    private DeliveryAddressQueryService deliveryAddressQueryService;

    @RequestMapping("/listDeliveryAddressByUserId")
    public ResponseResult<List<DeliveryAddress>> listDeliveryAddressByUserId(@ModelAttribute DeliveryAddress deliveryAddress) throws Exception {
        return ResponseResult.success(deliveryAddressQueryService.listDeliveryAddressByUserId(deliveryAddress.getUserId()));
    }

    @RequestMapping("/getDeliveryAddressById")
    public ResponseResult<DeliveryAddress> getDeliveryAddressById(@ModelAttribute DeliveryAddress deliveryAddress) throws Exception {
        return ResponseResult.success(deliveryAddressQueryService.getDeliveryAddressById(deliveryAddress.getDaId()));
    }

    @RequestMapping(value = "/saveDeliveryAddress", method = RequestMethod.POST)
    public ResponseResult<Integer> saveDeliveryAddress(@RequestBody DeliveryAddressCommand deliveryAddress) throws Exception {
        return ResponseResult.success(deliveryAddressService.saveDeliveryAddress(deliveryAddress));
    }

    @RequestMapping(value = "/updateDeliveryAddress", method = RequestMethod.POST)
    public ResponseResult<Integer> updateDeliveryAddress(@RequestBody DeliveryAddressCommand deliveryAddress) throws Exception {
        return ResponseResult.success(deliveryAddressService.updateDeliveryAddress(deliveryAddress));
    }

    @RequestMapping("/removeDeliveryAddress")
    public ResponseResult<Integer> removeDeliveryAddress(DeliveryAddress deliveryAddress) throws Exception {
        return ResponseResult.success(deliveryAddressService.removeDeliveryAddress(deliveryAddress.getDaId()));
    }
}
