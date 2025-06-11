package com.neusoft.elmcloud.domain.model.cart;

import com.neusoft.elmcloud.common.core.domain.ValueObject;
import lombok.Data;
import org.apache.commons.lang.Validate;

@Data
public class CartId implements ValueObject<CartId> {

    private Integer cartId;

    public CartId(Integer cartId) {
        Validate.notNull(cartId, "购物车id不能为空");
        this.cartId = cartId;
    }

    @Override
    public boolean sameValueAs(CartId other) {
        return other != null && this.cartId.equals(other.cartId);
    }
}
