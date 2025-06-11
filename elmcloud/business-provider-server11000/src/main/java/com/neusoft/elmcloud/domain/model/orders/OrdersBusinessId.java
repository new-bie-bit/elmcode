package com.neusoft.elmcloud.domain.model.orders;

import com.neusoft.elmcloud.common.core.domain.ValueObject;
import lombok.Data;
import org.apache.commons.lang.Validate;

@Data
public class OrdersBusinessId implements ValueObject<OrdersBusinessId> {

    private Integer businessId;

    public OrdersBusinessId(Integer businessId) {
        Validate.notNull(businessId, "商户id不能为空");
        this.businessId = businessId;
    }

    @Override
    public boolean sameValueAs(OrdersBusinessId other) {
        return other != null && this.businessId.equals(other.businessId);
    }
}
