package com.neusoft.elmcloud.api;

import com.neusoft.elmcloud.application.CartApplicationService;
import com.neusoft.elmcloud.application.CartQueryService;
import com.neusoft.elmcloud.application.command.CartCommand;
import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.po.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CartService")
public class CartController {

    @Autowired
    private CartQueryService cartQueryService;

    @Autowired
    private CartApplicationService cartApplicationService;

    @RequestMapping(value = "/listCart", method = RequestMethod.POST)
    public ResponseResult<List<Cart>> listCart(@RequestBody Cart cart) throws Exception {
        return ResponseResult.success(cartQueryService.listCart(cart));
    }

    @RequestMapping(value = "/saveCart", method = RequestMethod.POST)
    public ResponseResult<Integer> saveCart(@RequestBody CartCommand cart) throws Exception {
        return ResponseResult.success(cartApplicationService.saveCart(cart));
    }

    @RequestMapping(value = "/updateCart", method = RequestMethod.POST)
    public ResponseResult<Integer> updateCart(@RequestBody CartCommand cart) throws Exception {
        return ResponseResult.success(cartApplicationService.updateCart(cart));
    }

    @RequestMapping(value = "/removeCart", method = RequestMethod.POST)
    public ResponseResult<Integer> removeCart(@RequestBody CartCommand cart) throws Exception {
        return ResponseResult.success(cartApplicationService.removeCart(cart));
    }
}
