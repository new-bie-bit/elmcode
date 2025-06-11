package com.neusoft.elmcloud.domain.model.user;


import com.neusoft.elmcloud.common.core.domain.DelTagEnum;
import com.neusoft.elmcloud.common.core.domain.Entity;
import com.neusoft.elmcloud.common.core.domain.SexEnum;
import lombok.Getter;

@Getter
public class UserDM implements Entity<UserDM> {

    private UserId userId;

    private Password password;

    private DelTagEnum delTag;

    private UserName userName;

    private SexEnum userSex;

    private String userImg;

    public UserDM(UserId userId, Password password, DelTagEnum delTag, UserName userName,
                  SexEnum userSex, String userImg) {
        this.userId = userId;
        this.password = password;
        this.delTag = delTag;
        this.userName = userName;
        this.userSex = userSex;
        this.userImg = userImg;
    }

    /**
     * 是否删除
     *
     * @return
     */
    public boolean isDelete() {
        return DelTagEnum.TRUE.equals(delTag);
    }

    public void delete() {
        DelTagEnum delTagEnum = isDelete() ? DelTagEnum.TRUE : DelTagEnum.FALSE;
        this.delTag = delTagEnum;
    }

    @Override
    public boolean sameIdentityAs(UserDM other) {
        return other != null && userId.sameValueAs(other.userId);
    }
}
