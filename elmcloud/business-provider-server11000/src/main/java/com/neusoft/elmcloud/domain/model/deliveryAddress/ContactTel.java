package com.neusoft.elmcloud.domain.model.deliveryAddress;

import com.neusoft.elmcloud.common.core.domain.ValueObject;
import lombok.Data;
import org.apache.commons.lang.Validate;

@Data
public class ContactTel implements ValueObject<ContactTel> {
    private String contactTel;

    public ContactTel(String contactTel) {
        Validate.notNull(contactTel, "联系电话不能为空");
        this.contactTel = contactTel;
    }

    @Override
    public boolean sameValueAs(ContactTel other) {
        return other != null && this.contactTel.equals(other.contactTel);
    }
}
