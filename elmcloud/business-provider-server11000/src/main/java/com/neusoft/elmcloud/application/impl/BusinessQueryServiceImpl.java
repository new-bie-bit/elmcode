package com.neusoft.elmcloud.application.impl;

import com.neusoft.elmcloud.application.BusinessQueryService;
import com.neusoft.elmcloud.infrastructure.persistence.mapper.BusinessMapper;
import com.neusoft.elmcloud.po.Business;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BusinessQueryServiceImpl implements BusinessQueryService {

    @Resource
    private BusinessMapper businessMapper;

    @Override
    public List<Business> listBusinessByOrderTypeId(Integer orderTypeId) {
        return businessMapper.listBusinessByOrderTypeId(orderTypeId);
    }

    @Override
    public Business getBusinessById(Integer businessId) {

        return businessMapper.getBusinessById(businessId);
    }
}
