package com.neusoft.elmcloud.domain.model.cart;


public interface CartRepository {
    /**
     * 保存
     *
     * @param model
     */
    int store(CartDM model);

    /**
     * 删除
     */
    int remove(CartUserId cartUserId, CartBusinessId cartBusinessId, CartFoodId cartFoodId);
}
