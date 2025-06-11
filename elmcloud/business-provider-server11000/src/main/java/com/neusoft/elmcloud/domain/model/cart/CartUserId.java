package com.neusoft.elmcloud.domain.model.cart;

import com.neusoft.elmcloud.common.core.domain.ValueObject;
import lombok.Data;
import org.apache.commons.lang.Validate;

@Data
public class CartUserId implements ValueObject<CartUserId> {

    private String userId;

    public CartUserId(String userId) {
        Validate.notNull(userId, "用户id不能为空");
        this.userId = userId;
    }

    @Override
    public boolean sameValueAs(CartUserId other) {
        return other != null && this.userId.equals(other.userId);
    }
}
