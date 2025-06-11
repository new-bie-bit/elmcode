package com.neusoft.elmcloud.domain.model.deliveryAddress;

import com.neusoft.elmcloud.common.core.domain.ValueObject;
import lombok.Data;
import org.apache.commons.lang.Validate;

@Data
public class DeliveryAddressDaId implements ValueObject<DeliveryAddressDaId> {
    private Integer daId;

    public DeliveryAddressDaId(Integer daId) {
        Validate.notNull(daId, "地址id不能为空");
        this.daId = daId;
    }

    @Override
    public boolean sameValueAs(DeliveryAddressDaId other) {
        return other != null && this.daId.equals(other.daId);
    }
}
