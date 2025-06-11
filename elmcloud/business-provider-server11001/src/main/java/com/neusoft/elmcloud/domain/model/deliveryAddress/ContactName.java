package com.neusoft.elmcloud.domain.model.deliveryAddress;

import com.neusoft.elmcloud.common.core.domain.ValueObject;
import lombok.Data;
import org.apache.commons.lang.Validate;

@Data
public class ContactName implements ValueObject<ContactName> {
    private String contactName;

    public ContactName(String contactName) {
        Validate.notNull(contactName, "联系人不能为空");
        this.contactName = contactName;
    }

    @Override
    public boolean sameValueAs(ContactName other) {
        return other != null && this.contactName.equals(other.contactName);
    }
}
