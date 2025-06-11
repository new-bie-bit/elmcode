package com.neusoft.elmcloud.domain.model.cart;

import com.neusoft.elmcloud.common.core.domain.ValueObject;
import lombok.Data;
import org.apache.commons.lang.Validate;

@Data
public class CartBusinessId implements ValueObject<CartBusinessId> {

    private Integer businessId;

    public CartBusinessId(Integer businessId) {
        Validate.notNull(businessId, "商户id不能为空");
        this.businessId = businessId;
    }

    @Override
    public boolean sameValueAs(CartBusinessId other) {
        return other != null && this.businessId.equals(other.businessId);
    }
}
