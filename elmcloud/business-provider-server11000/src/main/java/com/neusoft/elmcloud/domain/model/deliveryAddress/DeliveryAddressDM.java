package com.neusoft.elmcloud.domain.model.deliveryAddress;

import com.neusoft.elmcloud.common.core.domain.Entity;
import com.neusoft.elmcloud.common.core.domain.SexEnum;
import com.neusoft.elmcloud.domain.model.user.UserId;
import lombok.Getter;

@Getter
public class DeliveryAddressDM implements Entity<DeliveryAddressDM> {
    private DeliveryAddressDaId daId;

    private ContactName contactName;
    private SexEnum contactSex;
    private ContactTel contactTel;
    private Address address;
    private UserId userId;

    public DeliveryAddressDM(DeliveryAddressDaId daId, ContactName contactName, SexEnum contactSex, ContactTel contactTel, Address address, UserId userId) {
        this.daId = daId;
        this.contactName = contactName;
        this.contactSex = contactSex;
        this.contactTel = contactTel;
        this.address = address;
        this.userId = userId;
    }

    /**
     * Entities compare by identity, not by attributes.
     *
     * @param other The other entity.
     * @return true if the identities are the same, regardless of other attributes.
     */
    @Override
    public boolean sameIdentityAs(DeliveryAddressDM other) {
        return other != null && daId.sameValueAs(other.daId);
    }
}
