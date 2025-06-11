package com.neusoft.elmcloud.controller;

import com.alibaba.fastjson.JSONObject;
import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.commonapi.enums.ResultEnum;
import com.neusoft.elmcloud.po.User;
import com.neusoft.elmcloud.service.UserService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/UserController")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserByIdByPass")
    @CircuitBreaker(name = "getUserByIdByPass", fallbackMethod = "fallback")
    public ResponseResult<User> getUserByIdByPass(@ModelAttribute User user) throws Exception {
        return userService.getUserByIdByPass(user);
    }

    @RequestMapping("/getUserById")
    @CircuitBreaker(name = "getUserById", fallbackMethod = "fallback")
    public ResponseResult<Integer> getUserById(@ModelAttribute User user) throws Exception {
        return userService.getUserById(user.getUserId());
    }

    @RequestMapping("/saveUser")
    @CircuitBreaker(name = "saveUser", fallbackMethod = "fallback")
    public ResponseResult<Integer> saveUser(@ModelAttribute User user) throws Exception {
        return userService.saveUser(user);
    }

    public ResponseResult fallback(User query, Throwable ex) {
        log.error("服务降级记录", JSONObject.toJSONString(query));
        log.error(ex);
        return ResponseResult.getResult(ResultEnum.DEMOTE, null);
    }

}
