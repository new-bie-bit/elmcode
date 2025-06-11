package com.neusoft.elmcloud.domain.model.user;

public interface UserRepository {
    /**
     * 查找
     *
     */
    UserDM find(UserId userId,Password password);

    /**
     * 保存
     *
     * @param model
     */
    int store(UserDM model);
}
