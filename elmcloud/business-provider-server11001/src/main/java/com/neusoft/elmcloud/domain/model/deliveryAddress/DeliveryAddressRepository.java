package com.neusoft.elmcloud.domain.model.deliveryAddress;

import java.util.List;
import java.util.Map;

public interface DeliveryAddressRepository {
    /**
     * 保存
     *
     * @param model
     */
    int store(DeliveryAddressDM model);

    /**
     * 删除
     */
    int remove(DeliveryAddressDaId deliveryAddressDaId);
}
