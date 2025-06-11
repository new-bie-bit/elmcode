package com.neusoft.elmcloud.infrastructure.persistence.repository;

import com.neusoft.elmcloud.domain.model.cart.*;
import com.neusoft.elmcloud.infrastructure.persistence.converter.CartConverter;
import com.neusoft.elmcloud.infrastructure.persistence.mapper.CartMapper;
import com.neusoft.elmcloud.po.Cart;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CartRepositoryImpl implements CartRepository {
    @Resource
    private CartMapper cartMapper;

    /**
     * 保存
     *
     * @param model
     */
    @Override
    public int store(CartDM model) {
        Cart cart = CartConverter.fromCart(model);
        if (model.getQuantity() == null) {
            return cartMapper.saveCart(cart);
        } else {
            return cartMapper.updateCart(cart);
        }
    }

    /**
     * 删除
     *
     * @param cartUserId
     * @param cartBusinessId
     * @param cartFoodId
     */
    @Override
    public int remove(CartUserId cartUserId, CartBusinessId cartBusinessId, CartFoodId cartFoodId) {
        Cart cart = CartConverter.fromRemoveKey(cartUserId, cartBusinessId, cartFoodId);
        return cartMapper.removeCart(cart);
    }
}
