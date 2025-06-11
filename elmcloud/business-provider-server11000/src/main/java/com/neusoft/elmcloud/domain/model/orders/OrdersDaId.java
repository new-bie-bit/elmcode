package com.neusoft.elmcloud.domain.model.orders;

import com.neusoft.elmcloud.common.core.domain.ValueObject;
import lombok.Data;
import org.apache.commons.lang.Validate;

@Data
public class OrdersDaId implements ValueObject<OrdersDaId> {
    private Integer daId;

    public OrdersDaId(Integer daId) {
        Validate.notNull(daId, "地址id不能为空");
        this.daId = daId;
    }

    @Override
    public boolean sameValueAs(OrdersDaId other) {
        return other != null && this.daId.equals(other.daId);
    }
}
