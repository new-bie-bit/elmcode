package com.neusoft.elmcloud.domain.model.cart;

import com.neusoft.elmcloud.common.core.domain.ValueObject;
import lombok.Data;
import org.apache.commons.lang.Validate;

@Data
public class CartQuantity implements ValueObject<CartQuantity> {
    private Integer quantity;

    public CartQuantity(Integer quantity) {
        Validate.notNull(quantity, "quantity不能为空");
        this.quantity = quantity;
    }

    @Override
    public boolean sameValueAs(CartQuantity other) {
        return other != null && this.quantity.equals(other.quantity);
    }
}
