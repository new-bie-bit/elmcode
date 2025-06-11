package com.neusoft.elmcloud.api;

import com.neusoft.elmcloud.application.FoodQueryService;
import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.po.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/FoodService")
public class FoodController {

    @Autowired
    private FoodQueryService foodService;

    @RequestMapping("/listFoodByBusinessId")
    public ResponseResult<List<Food>> listFoodByBusinessId(@ModelAttribute Food food) throws Exception {
        return ResponseResult.success(foodService.listFoodByBusinessId(food.getBusinessId()));
    }
}
