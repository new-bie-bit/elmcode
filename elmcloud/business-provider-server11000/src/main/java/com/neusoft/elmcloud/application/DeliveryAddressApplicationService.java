package com.neusoft.elmcloud.application;

import com.neusoft.elmcloud.application.command.DeliveryAddressCommand;

public interface DeliveryAddressApplicationService {
    int saveDeliveryAddress(DeliveryAddressCommand deliveryAddress);

    int updateDeliveryAddress(DeliveryAddressCommand deliveryAddress);

    int removeDeliveryAddress(Integer daId);
}
