package com.neusoft.elmcloud.application.assembler;

import com.neusoft.elmcloud.application.command.OrdersCommand;
import com.neusoft.elmcloud.domain.model.deliveryAddress.DeliveryAddressDaId;
import com.neusoft.elmcloud.domain.model.orders.OrdersBusinessId;
import com.neusoft.elmcloud.domain.model.orders.OrdersDM;
import com.neusoft.elmcloud.domain.model.user.UserId;

public class OrdersAssembler {

    public static OrdersDM toOrders(final OrdersCommand command) {
        return new OrdersDM(new OrdersBusinessId(command.getBusinessId()),
                new DeliveryAddressDaId(command.getDaId()),
                new UserId(command.getUserId()), command.getOrderTotal());
    }
}
