package com.neusoft.elmcloud.application;

import com.neusoft.elmcloud.po.Orders;

import java.util.List;

public interface OrdersQueryService {
    Orders getOrdersById(Integer orderId);

    List<Orders> listOrdersByUserId(String userId);
}
