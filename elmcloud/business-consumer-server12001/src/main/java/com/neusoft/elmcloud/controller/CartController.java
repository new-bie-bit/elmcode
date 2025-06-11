package com.neusoft.elmcloud.controller;

import com.alibaba.fastjson.JSONObject;
import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.commonapi.enums.ResultEnum;
import com.neusoft.elmcloud.po.Business;
import com.neusoft.elmcloud.po.Cart;
import com.neusoft.elmcloud.service.CartService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/CartController")
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping("/listCart")
    @CircuitBreaker(name = "listCart", fallbackMethod = "fallback")
    public ResponseResult<List<Cart>> listCart(Cart cart) throws Exception {
        return cartService.listCart(cart);
    }

    @RequestMapping("/saveCart")
    @CircuitBreaker(name = "saveCart", fallbackMethod = "fallback")
    public ResponseResult<Integer> saveCart(Cart cart) throws Exception {
        return cartService.saveCart(cart);
    }

    @RequestMapping("/updateCart")
    @CircuitBreaker(name = "updateCart", fallbackMethod = "fallback")
    public ResponseResult<Integer> updateCart(Cart cart) throws Exception {
        return cartService.updateCart(cart);
    }

    @RequestMapping("/removeCart")
    @CircuitBreaker(name = "removeCart", fallbackMethod = "fallback")
    public ResponseResult<Integer> removeCart(Cart cart) throws Exception {
        return cartService.removeCart(cart);
    }

    public ResponseResult fallback(Cart query, Throwable ex) {
        log.error("服务降级记录", JSONObject.toJSONString(query));
        log.error(ex);
        return ResponseResult.getResult(ResultEnum.DEMOTE, null);
    }

}
