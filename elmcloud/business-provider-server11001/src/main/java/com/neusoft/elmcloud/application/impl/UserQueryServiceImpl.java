package com.neusoft.elmcloud.application.impl;

import com.neusoft.elmcloud.application.UserQueryService;
import com.neusoft.elmcloud.infrastructure.persistence.mapper.UserMapper;
import com.neusoft.elmcloud.po.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserQueryServiceImpl implements UserQueryService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int getUserById(String userId) {
        return userMapper.getUserById(userId);
    }

    @Override
    public User getUserByIdByPass(User user) {
        return userMapper.getUserByIdByPass(user);
    }
}
