package com.neusoft.elmcloud.infrastructure.persistence.converter;

import com.neusoft.elmcloud.common.core.domain.SexEnum;
import com.neusoft.elmcloud.domain.model.deliveryAddress.*;
import com.neusoft.elmcloud.domain.model.user.UserId;
import com.neusoft.elmcloud.po.DeliveryAddress;

public class DeliveryAddressConverter {

    public static DeliveryAddressDM toDeliveryAddress(DeliveryAddress model) {
        if (model == null) {
            return null;
        }
        DeliveryAddressDM dm = new DeliveryAddressDM(new DeliveryAddressDaId(model.getDaId()),
                new ContactName(model.getContactName()),
                SexEnum.getSexEnum(model.getContactSex()),
                new ContactTel(model.getContactTel()),
                new Address(model.getAddress()),
                new UserId(model.getUserId()));
        return dm;
    }

    public static DeliveryAddress fromDeliveryAddress(DeliveryAddressDM dm) {
        DeliveryAddress model = new DeliveryAddress();
        model.setUserId(dm.getUserId() == null ? null : dm.getUserId().getUserId());
        model.setDaId(dm.getDaId() == null ? null : dm.getDaId().getDaId());
        model.setAddress(dm.getAddress() == null ? null : dm.getAddress().getAddress());
        model.setContactName(dm.getContactName() == null ? null : dm.getContactName().getContactName());
        model.setContactSex(dm.getContactSex() == null ? null : dm.getContactSex().getValue());
        model.setContactTel(dm.getContactTel() == null ? null : dm.getContactTel().getContactTel());
        return model;
    }
}
