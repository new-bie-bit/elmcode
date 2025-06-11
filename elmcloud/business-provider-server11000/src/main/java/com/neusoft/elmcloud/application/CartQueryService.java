package com.neusoft.elmcloud.application;

import com.neusoft.elmcloud.po.Cart;

import java.util.List;

public interface CartQueryService {

	List<Cart> listCart(Cart cart);
}
