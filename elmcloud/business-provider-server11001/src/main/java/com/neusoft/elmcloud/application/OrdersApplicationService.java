package com.neusoft.elmcloud.application;

import com.neusoft.elmcloud.application.command.OrdersCommand;
import com.neusoft.elmcloud.po.Orders;

import java.util.List;

public interface OrdersApplicationService {

	public int createOrders(OrdersCommand orders);
}
