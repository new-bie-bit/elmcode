package com.neusoft.elmcloud.application.impl;

import com.neusoft.elmcloud.application.DeliveryAddressQueryService;
import com.neusoft.elmcloud.infrastructure.persistence.mapper.DeliveryAddressMapper;
import com.neusoft.elmcloud.po.DeliveryAddress;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeliveryAddressQueryServiceImpl implements DeliveryAddressQueryService {

    @Resource
    private DeliveryAddressMapper deliveryAddressMapper;


    @Override
    public List<DeliveryAddress> listDeliveryAddressByUserId(String userId) {
        return deliveryAddressMapper.listDeliveryAddressByUserId(userId);
    }

    @Override
    public DeliveryAddress getDeliveryAddressById(Integer daId) {
        return deliveryAddressMapper.getDeliveryAddressById(daId);
    }
}
