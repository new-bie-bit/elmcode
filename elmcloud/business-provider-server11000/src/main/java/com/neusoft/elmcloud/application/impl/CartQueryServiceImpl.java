package com.neusoft.elmcloud.application.impl;

import com.neusoft.elmcloud.application.CartQueryService;
import com.neusoft.elmcloud.infrastructure.persistence.mapper.CartMapper;
import com.neusoft.elmcloud.po.Cart;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CartQueryServiceImpl implements CartQueryService {

    @Resource
    private CartMapper cartMapper;

    @Override
    public List<Cart> listCart(Cart cart) {
        return cartMapper.listCart(cart);
    }
}
