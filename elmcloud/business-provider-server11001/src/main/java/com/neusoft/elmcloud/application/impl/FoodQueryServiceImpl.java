package com.neusoft.elmcloud.application.impl;

import com.neusoft.elmcloud.application.FoodQueryService;
import com.neusoft.elmcloud.infrastructure.persistence.mapper.FoodMapper;
import com.neusoft.elmcloud.po.Food;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FoodQueryServiceImpl implements FoodQueryService {

    @Resource
    private FoodMapper foodMapper;

    @Override
    public List<Food> listFoodByBusinessId(Integer businessId) {
        return foodMapper.listFoodByBusinessId(businessId);
    }
}
