package com.neusoft.elmcloud.domain.specification;

import com.neusoft.elmcloud.common.core.domain.AbstractSpecification;
import com.neusoft.elmcloud.domain.model.cart.CartDM;
import com.neusoft.elmcloud.domain.model.user.UserDM;
import com.neusoft.elmcloud.domain.model.user.UserRepository;

public class UserCreateSpecification extends AbstractSpecification<UserDM> {
    private UserRepository userRepository;

    public UserCreateSpecification(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean isSatisfiedBy(UserDM cartDM) {
        if (userRepository.find(cartDM.getUserId(), null) != null) {
            throw new RuntimeException("用户已注册");
        }
        return true;
    }
}
