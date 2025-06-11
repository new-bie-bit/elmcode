package com.neusoft.elmcloud.infrastructure.persistence.repository;

import com.neusoft.elmcloud.domain.model.deliveryAddress.DeliveryAddressDaId;
import com.neusoft.elmcloud.domain.model.deliveryAddress.DeliveryAddressDM;
import com.neusoft.elmcloud.domain.model.deliveryAddress.DeliveryAddressRepository;
import com.neusoft.elmcloud.infrastructure.persistence.converter.DeliveryAddressConverter;
import com.neusoft.elmcloud.infrastructure.persistence.mapper.DeliveryAddressMapper;
import com.neusoft.elmcloud.po.DeliveryAddress;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
@Repository
public class DeliveryAddressRepositoryImpl implements DeliveryAddressRepository {

    @Resource
    private DeliveryAddressMapper deliveryAddressMapper;

    /**
     * 保存
     *
     * @param model
     */
    @Override
    public int store(DeliveryAddressDM model) {
        DeliveryAddress deliveryAddress = DeliveryAddressConverter.fromDeliveryAddress(model);
        if (model.getDaId() == null) {
            return deliveryAddressMapper.saveDeliveryAddress(deliveryAddress);
        } else {
            return deliveryAddressMapper.updateDeliveryAddress(deliveryAddress);
        }
    }

    /**
     * 删除
     *
     * @param deliveryAddressDaId
     */
    @Override
    public int remove(DeliveryAddressDaId deliveryAddressDaId) {
        return deliveryAddressMapper.removeDeliveryAddress(deliveryAddressDaId.getDaId());
    }
}
