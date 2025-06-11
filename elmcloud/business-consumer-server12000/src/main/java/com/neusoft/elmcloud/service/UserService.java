package com.neusoft.elmcloud.service;

import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.po.User;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@RefreshScope
@FeignClient(value = "${service.provider.business.name}")
public interface UserService {

    @RequestMapping(value = "/UserService/getUserByIdByPass", method = RequestMethod.POST)
    public ResponseResult<User> getUserByIdByPass(@RequestBody User user);

    @RequestMapping("/UserService/getUserById")
    public ResponseResult<Integer> getUserById(@RequestParam("userId") String userId);

    @RequestMapping(value = "/UserService/saveUser", method = RequestMethod.POST)
    public ResponseResult<Integer> saveUser(@RequestBody User user);
}
