package com.neusoft.elmcloud.application.impl;

import com.neusoft.elmcloud.application.OrdersApplicationService;
import com.neusoft.elmcloud.application.assembler.OrdersAssembler;
import com.neusoft.elmcloud.application.command.OrdersCommand;
import com.neusoft.elmcloud.domain.model.orders.OrdersDM;
import com.neusoft.elmcloud.domain.model.orders.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersApplicationServiceImpl implements OrdersApplicationService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public int createOrders(OrdersCommand orders) {
        OrdersDM ordersDM = OrdersAssembler.toOrders(orders);
        return ordersRepository.store(ordersDM);
    }
}
