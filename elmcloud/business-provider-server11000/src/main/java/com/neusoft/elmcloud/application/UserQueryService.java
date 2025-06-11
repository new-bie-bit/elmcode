package com.neusoft.elmcloud.application;

import com.neusoft.elmcloud.po.User;

public interface UserQueryService {

    int getUserById(String userId);

    User getUserByIdByPass(User user);
}
