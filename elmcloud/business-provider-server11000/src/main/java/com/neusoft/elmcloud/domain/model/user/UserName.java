package com.neusoft.elmcloud.domain.model.user;

import com.neusoft.elmcloud.common.core.domain.ValueObject;
import lombok.Data;
import org.apache.commons.lang.Validate;

@Data
public class UserName implements ValueObject<UserName> {
    private String userName;

    public UserName(String userName) {
        Validate.notNull(userName, "用户名不能为空");
        this.userName = userName;
    }

    /**
     * Value objects compare by the values of their attributes, they don't have an identity.
     *
     * @param other The other value object.
     * @return <code>true</code> if the given value object's and this value object's attributes are the same.
     */
    @Override
    public boolean sameValueAs(UserName other) {
        return other!=null && this.userName.equals(other.userName);
    }
}
