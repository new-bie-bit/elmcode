package com.neusoft.elmcloud.application;

import com.neusoft.elmcloud.application.command.CartCommand;

public interface CartApplicationService {
    int saveCart(CartCommand cart);

    int updateCart(CartCommand cart);

    int removeCart(CartCommand cart);
}
