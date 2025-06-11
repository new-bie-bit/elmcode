package com.neusoft.elmcloud.infrastructure.persistence.converter;

import com.neusoft.elmcloud.common.core.domain.DelTagEnum;
import com.neusoft.elmcloud.common.core.domain.SexEnum;
import com.neusoft.elmcloud.domain.model.user.Password;
import com.neusoft.elmcloud.domain.model.user.UserDM;
import com.neusoft.elmcloud.domain.model.user.UserId;
import com.neusoft.elmcloud.domain.model.user.UserName;
import com.neusoft.elmcloud.po.User;

public class UserConverter {

    public static UserDM toUser(User user) {
        if (user == null) {
            return null;
        }
        UserDM userDM = new UserDM(new UserId(user.getUserId()),
                new Password(user.getPassword()), DelTagEnum.getDelTagEnum(user.getDelTag()),
                new UserName(user.getUserName()), SexEnum.getSexEnum(user.getUserSex()),
                user.getUserImg());
        return userDM;
    }

    public static User fromUser(UserDM userDM) {
        User user = new User();
        user.setUserId(userDM.getUserId() == null ? null : userDM.getUserId().getUserId());
        user.setUserName(userDM.getUserName() == null ? null : userDM.getUserName().getUserName());
        user.setPassword(userDM.getPassword() == null ? null : userDM.getPassword().getPassword());
        user.setUserImg(userDM.getUserImg());
        user.setDelTag(userDM.getDelTag() == null ? null : userDM.getDelTag().getValue());
        user.setUserSex(userDM.getUserSex() == null ? null : userDM.getUserSex().getValue());
        return user;
    }
}
