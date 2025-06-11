package com.neusoft.elmcloud.domain.model.deliveryAddress;

import com.neusoft.elmcloud.common.core.domain.ValueObject;
import lombok.Data;
import org.apache.commons.lang.Validate;

@Data
public class Address implements ValueObject<Address> {
    private String address;

    public Address(String address) {
        Validate.notNull(address, "地址不能为空");
        this.address = address;
    }

    @Override
    public boolean sameValueAs(Address other) {
        return other != null && this.address.equals(other.address);
    }
}
