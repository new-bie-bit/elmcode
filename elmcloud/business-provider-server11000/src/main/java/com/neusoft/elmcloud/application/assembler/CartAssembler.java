package com.neusoft.elmcloud.application.assembler;

import com.neusoft.elmcloud.application.command.CartCommand;
import com.neusoft.elmcloud.domain.model.cart.*;

public class CartAssembler {

    public static CartDM toCart(final CartCommand command) {
        CartQuantity cartQuantity = null;
        if (command.getQuantity() != null) {
            cartQuantity = new CartQuantity(command.getQuantity());
        }
        return new CartDM(new CartUserId(command.getUserId()), new CartBusinessId(command.getBusinessId()),
                new CartFoodId(command.getFoodId()),cartQuantity);
    }
}
