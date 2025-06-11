package com.neusoft.elmcloud.api;

import com.neusoft.elmcloud.application.OrdersApplicationService;
import com.neusoft.elmcloud.application.OrdersQueryService;
import com.neusoft.elmcloud.application.command.OrdersCommand;
import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.po.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OrdersService")
public class OrdersController {

    @Autowired
    private OrdersApplicationService ordersService;
    @Autowired
    private OrdersQueryService ordersQueryService;


    @RequestMapping(value = "/createOrders", method = RequestMethod.POST)
    public ResponseResult<Integer> createOrders(@RequestBody OrdersCommand orders) throws Exception {
        return ResponseResult.success(ordersService.createOrders(orders));
    }

    @RequestMapping(value = "/getOrdersById")
    public ResponseResult<Orders> getOrdersById(@ModelAttribute Orders orders) throws Exception {
        return ResponseResult.success(ordersQueryService.getOrdersById(orders.getOrderId()));
    }

    @RequestMapping("/listOrdersByUserId")
    public ResponseResult<List<Orders>> listOrdersByUserId(@ModelAttribute Orders orders) throws Exception {
        return ResponseResult.success(ordersQueryService.listOrdersByUserId(orders.getUserId()));
    }
}
