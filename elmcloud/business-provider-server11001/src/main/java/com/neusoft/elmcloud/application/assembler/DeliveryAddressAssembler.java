package com.neusoft.elmcloud.application.assembler;

import com.neusoft.elmcloud.application.command.DeliveryAddressCommand;
import com.neusoft.elmcloud.common.core.domain.SexEnum;
import com.neusoft.elmcloud.domain.model.deliveryAddress.*;
import com.neusoft.elmcloud.domain.model.user.UserId;

public class DeliveryAddressAssembler {

    public static DeliveryAddressDM toDeliveryAddress(final DeliveryAddressCommand command) {
        DeliveryAddressDaId daId = null;
        if (command.getDaId() != null) {
            daId = new DeliveryAddressDaId(command.getDaId());
        }
        return new DeliveryAddressDM(daId,
                new ContactName(command.getContactName()),
                SexEnum.getSexEnum(command.getContactSex()), new ContactTel(command.getContactTel()),
                new Address(command.getAddress()), new UserId(command.getUserId()));
    }
}
