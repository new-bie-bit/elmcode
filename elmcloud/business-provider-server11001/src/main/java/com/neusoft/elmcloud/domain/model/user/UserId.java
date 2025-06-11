package com.neusoft.elmcloud.domain.model.user;

import com.neusoft.elmcloud.common.core.domain.ValueObject;
import lombok.Data;
import org.apache.commons.lang.Validate;

@Data
public class UserId implements ValueObject<UserId> {
    private String userId;

    public UserId(String userId) {
        Validate.notNull(userId, "用户id不能为空");
        this.userId = userId;
    }

    /**
     * Value objects compare by the values of their attributes, they don't have an identity.
     *
     * @param other The other value object.
     * @return <code>true</code> if the given value object's and this value object's attributes are the same.
     */
    @Override
    public boolean sameValueAs(UserId other) {
        return other != null && this.userId.equals(other.userId);
    }
}
