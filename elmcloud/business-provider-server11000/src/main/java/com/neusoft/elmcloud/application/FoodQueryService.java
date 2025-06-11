package com.neusoft.elmcloud.application;

import com.neusoft.elmcloud.po.Food;

import java.util.List;

public interface FoodQueryService {

    List<Food> listFoodByBusinessId(Integer businessId);
}
