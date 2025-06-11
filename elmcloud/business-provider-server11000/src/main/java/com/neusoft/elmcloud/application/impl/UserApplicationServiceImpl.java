package com.neusoft.elmcloud.application.impl;

import com.neusoft.elmcloud.application.UserApplicationService;
import com.neusoft.elmcloud.application.assembler.UserAssembler;
import com.neusoft.elmcloud.application.command.UserCommand;
import com.neusoft.elmcloud.domain.model.user.UserDM;
import com.neusoft.elmcloud.domain.model.user.UserRepository;
import com.neusoft.elmcloud.domain.specification.UserCreateSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserApplicationServiceImpl implements UserApplicationService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public int saveUser(UserCommand user) {
        UserDM userDM = UserAssembler.toUser(user);
        UserCreateSpecification createSpecification =
                new UserCreateSpecification(userRepository);
        createSpecification.isSatisfiedBy(userDM);
        return userRepository.store(userDM);
    }
}
