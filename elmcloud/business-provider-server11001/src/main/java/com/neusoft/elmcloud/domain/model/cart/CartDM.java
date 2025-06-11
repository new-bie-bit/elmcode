package com.neusoft.elmcloud.domain.model.cart;


import com.neusoft.elmcloud.common.core.domain.Entity;

import lombok.Getter;

@Getter
public class CartDM implements Entity<CartDM> {

    private CartId cartId;

    private CartUserId userId;

    private CartBusinessId businessId;

    private CartFoodId foodId;

    private CartQuantity quantity;

    public CartDM(CartId cartId, CartUserId userId, CartBusinessId businessId, CartFoodId foodId, CartQuantity quantity) {
        this.cartId = cartId;
        this.userId = userId;
        this.businessId = businessId;
        this.foodId = foodId;
        this.quantity = quantity;
    }

    public CartDM(CartUserId userId, CartBusinessId businessId, CartFoodId foodId) {
        this.userId = userId;
        this.businessId = businessId;
        this.foodId = foodId;
    }

    public CartDM(CartUserId userId, CartBusinessId businessId, CartFoodId foodId, CartQuantity quantity) {
        this.userId = userId;
        this.businessId = businessId;
        this.foodId = foodId;
        this.quantity = quantity;
    }

    @Override
    public boolean sameIdentityAs(CartDM other) {
        return other != null && cartId.sameValueAs(other.cartId);
    }

}
