package com.neusoft.elmcloud.domain.model.orders;

public interface OrdersRepository {
    /**
     * 保存
     *
     * @param model
     */
    int store(OrdersDM model);
}
