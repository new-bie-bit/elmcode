package com.neusoft.elmcloud.application.impl;

import com.neusoft.elmcloud.application.DeliveryAddressApplicationService;
import com.neusoft.elmcloud.application.assembler.DeliveryAddressAssembler;
import com.neusoft.elmcloud.application.command.DeliveryAddressCommand;
import com.neusoft.elmcloud.domain.model.deliveryAddress.DeliveryAddressDM;
import com.neusoft.elmcloud.domain.model.deliveryAddress.DeliveryAddressDaId;
import com.neusoft.elmcloud.domain.model.deliveryAddress.DeliveryAddressRepository;
import com.neusoft.elmcloud.domain.specification.DeliveryAddressUpdateSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryAddressApplicationServiceImpl implements DeliveryAddressApplicationService {
    @Autowired
    private DeliveryAddressRepository deliveryAddressRepository;

    @Override
    public int saveDeliveryAddress(DeliveryAddressCommand deliveryAddress) {
        return deliveryAddressRepository.store(DeliveryAddressAssembler.toDeliveryAddress(deliveryAddress));
    }

    @Override
    public int updateDeliveryAddress(DeliveryAddressCommand deliveryAddress) {
        DeliveryAddressDM dm = DeliveryAddressAssembler.toDeliveryAddress(deliveryAddress);
        DeliveryAddressUpdateSpecification updateSpecification = new DeliveryAddressUpdateSpecification();
        updateSpecification.isSatisfiedBy(dm);
        return deliveryAddressRepository.store(dm);

    }

    @Override
    public int removeDeliveryAddress(Integer daId) {
        return deliveryAddressRepository.remove(new DeliveryAddressDaId(daId));
    }
}
