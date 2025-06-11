package com.neusoft.elmcloud.service;

import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.po.Cart;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RefreshScope
@FeignClient(value = "${service.provider.business.name}")
public interface CartService {

    @RequestMapping(value = "/CartService/listCart", method = RequestMethod.POST)
    public ResponseResult<List<Cart>> listCart(@RequestBody Cart cart);

    @RequestMapping(value = "/CartService/saveCart", method = RequestMethod.POST)
    public ResponseResult<Integer> saveCart(@RequestBody Cart cart);

    @RequestMapping(value = "/CartService/updateCart", method = RequestMethod.POST)
    public ResponseResult<Integer> updateCart(@RequestBody Cart cart);

    @RequestMapping(value = "/CartService/removeCart", method = RequestMethod.POST)
    public ResponseResult<Integer> removeCart(@RequestBody Cart cart);
}
