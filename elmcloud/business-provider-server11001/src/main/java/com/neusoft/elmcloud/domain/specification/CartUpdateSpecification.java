package com.neusoft.elmcloud.domain.specification;

import com.neusoft.elmcloud.common.core.domain.AbstractSpecification;
import com.neusoft.elmcloud.domain.model.cart.CartDM;

public class CartUpdateSpecification extends AbstractSpecification<CartDM> {

    @Override
    public boolean isSatisfiedBy(CartDM cartDM) {
        if (cartDM.getQuantity().getQuantity() <= 0) {
            throw new RuntimeException("数量不能为空");
        }
        return true;
    }
}
