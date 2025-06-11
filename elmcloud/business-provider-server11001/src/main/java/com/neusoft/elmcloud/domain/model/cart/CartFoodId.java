package com.neusoft.elmcloud.domain.model.cart;

import com.neusoft.elmcloud.common.core.domain.ValueObject;
import lombok.Data;
import org.apache.commons.lang.Validate;

@Data
public class CartFoodId implements ValueObject<CartFoodId> {

    private Integer foodId;

    public CartFoodId(Integer foodId) {
        Validate.notNull(foodId, "食物id不能为空");
        this.foodId = foodId;
    }

    @Override
    public boolean sameValueAs(CartFoodId other) {
        return other != null && this.foodId.equals(other.foodId);
    }
}
