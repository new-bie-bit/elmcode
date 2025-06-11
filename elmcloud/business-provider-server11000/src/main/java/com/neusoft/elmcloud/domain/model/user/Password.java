package com.neusoft.elmcloud.domain.model.user;

import com.neusoft.elmcloud.common.core.domain.ValueObject;
import lombok.Data;
import org.apache.commons.lang.Validate;

@Data
public class Password implements ValueObject<Password> {

    private String password;

    public Password(String password) {
        Validate.notNull(password, "密码不能为空");
        this.password = password;
    }

    /**
     * Value objects compare by the values of their attributes, they don't have an identity.
     *
     * @param other The other value object.
     * @return <code>true</code> if the given value object's and this value object's attributes are the same.
     */
    @Override
    public boolean sameValueAs(Password other) {
        return other != null && this.password.equals(other.password);
    }
}
