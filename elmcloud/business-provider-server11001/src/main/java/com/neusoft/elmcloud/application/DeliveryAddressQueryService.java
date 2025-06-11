package com.neusoft.elmcloud.application;

import com.neusoft.elmcloud.po.DeliveryAddress;

import java.util.List;

public interface DeliveryAddressQueryService {

    List<DeliveryAddress> listDeliveryAddressByUserId(String userId);

    DeliveryAddress getDeliveryAddressById(Integer daId);
}
