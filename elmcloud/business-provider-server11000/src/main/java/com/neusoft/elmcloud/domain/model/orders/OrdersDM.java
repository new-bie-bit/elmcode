package com.neusoft.elmcloud.domain.model.orders;

import com.neusoft.elmcloud.common.core.domain.Entity;

import com.neusoft.elmcloud.domain.model.deliveryAddress.DeliveryAddressDaId;
import com.neusoft.elmcloud.domain.model.user.UserId;
import lombok.Getter;

@Getter
public class OrdersDM implements Entity<OrdersDM> {
    private OrdersId ordersId;

    private OrdersBusinessId businessId;

    private DeliveryAddressDaId daId;

    private UserId userId;

    private Double orderTotal;

    public OrdersDM(OrdersId ordersId, OrdersBusinessId businessId, DeliveryAddressDaId daId, UserId userId, Double orderTotal) {
        this.ordersId = ordersId;
        this.businessId = businessId;
        this.daId = daId;
        this.userId = userId;
        this.orderTotal = orderTotal;
    }

    public OrdersDM(OrdersBusinessId businessId, DeliveryAddressDaId daId, UserId userId, Double orderTotal) {
        this.businessId = businessId;
        this.daId = daId;
        this.userId = userId;
        this.orderTotal = orderTotal;
    }

    /**
     * Entities compare by identity, not by attributes.
     *
     * @param other The other entity.
     * @return true if the identities are the same, regardless of other attributes.
     */
    @Override
    public boolean sameIdentityAs(OrdersDM other) {
        return other != null && ordersId.sameValueAs(other.ordersId);
    }
}
