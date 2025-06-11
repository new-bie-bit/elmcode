package com.neusoft.elmcloud.domain.specification;

import com.neusoft.elmcloud.common.core.domain.AbstractSpecification;
import com.neusoft.elmcloud.domain.model.deliveryAddress.DeliveryAddressDM;

public class DeliveryAddressUpdateSpecification extends AbstractSpecification<DeliveryAddressDM> {

    @Override
    public boolean isSatisfiedBy(DeliveryAddressDM deliveryAddressDM) {
        if (deliveryAddressDM.getDaId() == null) {
            throw new RuntimeException("daId不能为空");
        }
        return true;
    }
}
