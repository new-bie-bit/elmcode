package com.neusoft.elmcloud.infrastructure.persistence.repository;

import com.neusoft.elmcloud.domain.model.user.Password;
import com.neusoft.elmcloud.domain.model.user.UserDM;
import com.neusoft.elmcloud.domain.model.user.UserId;
import com.neusoft.elmcloud.domain.model.user.UserRepository;
import com.neusoft.elmcloud.infrastructure.persistence.converter.UserConverter;
import com.neusoft.elmcloud.infrastructure.persistence.mapper.UserMapper;
import com.neusoft.elmcloud.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Resource
    private UserMapper userMapper;

    /**
     * 查找
     *
     * @param userId
     * @param password
     */
    @Override
    public UserDM find(UserId userId, Password password) {
        User query = new User();
        query.setUserId(userId.getUserId());
        if (password != null) {
            query.setPassword(password.getPassword());
        }
        User result = userMapper.getUserByIdByPass(query);
        return UserConverter.toUser(result);
    }

    /**
     * 保存
     *
     * @param model
     */
    @Override
    public int store(UserDM model) {
        User user = UserConverter.fromUser(model);
        if (user != null) {
            return userMapper.saveUser(user);
        }
        return -1;
    }
}
