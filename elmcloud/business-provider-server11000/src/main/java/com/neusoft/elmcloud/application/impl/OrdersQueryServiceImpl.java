package com.neusoft.elmcloud.application.impl;

import com.neusoft.elmcloud.application.OrdersQueryService;
import com.neusoft.elmcloud.infrastructure.persistence.mapper.OrdersMapper;
import com.neusoft.elmcloud.po.Orders;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrdersQueryServiceImpl implements OrdersQueryService {
    @Resource
    private OrdersMapper ordersMapper;

    @Override
    public Orders getOrdersById(Integer orderId) {
        return ordersMapper.getOrdersById(orderId);
    }

    @Override
    public List<Orders> listOrdersByUserId(String userId) {
        return ordersMapper.listOrdersByUserId(userId);
    }
}
