package com.neusoft.elmcloud.application.impl;

import com.neusoft.elmcloud.application.CartApplicationService;
import com.neusoft.elmcloud.application.assembler.CartAssembler;
import com.neusoft.elmcloud.application.command.CartCommand;
import com.neusoft.elmcloud.domain.model.cart.*;
import com.neusoft.elmcloud.domain.specification.CartUpdateSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartApplicationServiceImpl implements CartApplicationService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public int saveCart(CartCommand cart) {
        CartDM cartDM = CartAssembler.toCart(cart);
        return cartRepository.store(cartDM);
    }

    @Override
    public int updateCart(CartCommand cart) {
        CartDM cartDM = CartAssembler.toCart(cart);
        CartUpdateSpecification updateSpecification = new CartUpdateSpecification();
        updateSpecification.isSatisfiedBy(cartDM);
        return cartRepository.store(cartDM);
    }

    @Override
    public int removeCart(CartCommand cart) {
        return cartRepository.remove(new CartUserId(cart.getUserId()),
                new CartBusinessId(cart.getBusinessId()), new CartFoodId(cart.getFoodId()));
    }
}
