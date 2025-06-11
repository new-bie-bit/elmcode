package com.neusoft.elmcloud.api;

import com.neusoft.elmcloud.application.BusinessQueryService;
import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.po.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/BusinessService")
public class BusinessController {

    @Autowired
    private BusinessQueryService businessService;

    @RequestMapping("/listBusinessByOrderTypeId")
    public ResponseResult<List<Business>> listBusinessByOrderTypeId(@ModelAttribute Business business) throws Exception {
        return ResponseResult.success(businessService.listBusinessByOrderTypeId(business.getOrderTypeId()));
    }

    @RequestMapping("/getBusinessById")
    public ResponseResult<Business> getBusinessById(@ModelAttribute Business business) throws Exception {
        return ResponseResult.success(businessService.getBusinessById(business.getBusinessId()));
    }

}
