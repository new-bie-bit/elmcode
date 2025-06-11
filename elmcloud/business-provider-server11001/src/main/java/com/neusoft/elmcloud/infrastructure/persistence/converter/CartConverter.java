package com.neusoft.elmcloud.infrastructure.persistence.converter;

import com.neusoft.elmcloud.domain.model.cart.CartBusinessId;
import com.neusoft.elmcloud.domain.model.cart.CartDM;
import com.neusoft.elmcloud.domain.model.cart.CartFoodId;
import com.neusoft.elmcloud.domain.model.cart.CartUserId;
import com.neusoft.elmcloud.po.Cart;

public class CartConverter {

    public static Cart fromCart(CartDM dm) {
        Cart model = new Cart();
        if (dm.getBusinessId() == null || dm.getFoodId() == null || dm.getUserId() == null) {
            throw new RuntimeException("必填信息不存在");
        }
        model.setBusinessId(dm.getBusinessId().getBusinessId());
        model.setCartId(dm.getCartId() == null ? null : dm.getCartId().getCartId());
        model.setFoodId(dm.getFoodId().getFoodId());
        model.setQuantity(dm.getQuantity() == null ? null : dm.getQuantity().getQuantity());
        model.setUserId(dm.getUserId().getUserId());
        return model;
    }

    public static Cart fromRemoveKey(CartUserId cartUserId,
                                     CartBusinessId cartBusinessId, CartFoodId cartFoodId) {
        Cart model = new Cart();
        if (cartUserId == null || cartBusinessId == null) {
            throw new RuntimeException("必填信息不存在");
        }
        model.setBusinessId(cartBusinessId.getBusinessId());
        model.setFoodId(cartFoodId == null ? null : cartFoodId.getFoodId());
        model.setUserId(cartUserId.getUserId());
        return model;
    }
}
