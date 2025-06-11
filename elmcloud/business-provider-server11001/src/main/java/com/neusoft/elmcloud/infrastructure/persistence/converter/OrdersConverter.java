package com.neusoft.elmcloud.infrastructure.persistence.converter;

import com.neusoft.elmcloud.domain.model.deliveryAddress.DeliveryAddressDaId;
import com.neusoft.elmcloud.domain.model.orders.OrdersBusinessId;
import com.neusoft.elmcloud.domain.model.orders.OrdersDM;
import com.neusoft.elmcloud.domain.model.user.UserId;
import com.neusoft.elmcloud.po.Orders;

public class OrdersConverter {

    public static OrdersDM toOrders(Orders model) {
        if (model == null) {
            return null;
        }
        OrdersDM userDM = new OrdersDM(new OrdersBusinessId(model.getOrderId()),
                new DeliveryAddressDaId(model.getDaId()),
                new UserId(model.getUserId()), model.getOrderTotal());
        return userDM;
    }

    public static Orders fromOrders(OrdersDM model) {
        Orders orders = new Orders();
        orders.setUserId(model.getUserId() == null ? null : model.getUserId().getUserId());
        orders.setBusinessId(model.getBusinessId() == null ? null : model.getBusinessId().getBusinessId());
        orders.setDaId(model.getDaId() == null ? null : model.getDaId().getDaId());
        orders.setOrderTotal(model.getOrderTotal());
        orders.setOrderId(model.getOrdersId() == null ? null : model.getOrdersId().getOrderId());
        return orders;
    }
}
