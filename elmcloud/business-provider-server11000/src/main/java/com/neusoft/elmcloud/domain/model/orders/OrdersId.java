package com.neusoft.elmcloud.domain.model.orders;

import com.neusoft.elmcloud.common.core.domain.ValueObject;
import lombok.Data;
import org.apache.commons.lang.Validate;

@Data
public class OrdersId implements ValueObject<OrdersId> {
    private Integer orderId;

    public OrdersId(Integer orderId) {
        Validate.notNull(orderId, "订单编号不能为空");
        this.orderId = orderId;
    }

    @Override
    public boolean sameValueAs(OrdersId other) {
        return other != null && this.orderId.equals(other.orderId);
    }
}
