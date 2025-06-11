package com.neusoft.elmcloud.api;

import com.neusoft.elmcloud.application.UserApplicationService;
import com.neusoft.elmcloud.application.UserQueryService;
import com.neusoft.elmcloud.application.command.UserCommand;
import com.neusoft.elmcloud.commonapi.entity.ResponseResult;
import com.neusoft.elmcloud.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/UserService")
public class UserController {

    @Autowired
    private UserApplicationService userService;

    @Autowired
    private UserQueryService userQueryService;

    @RequestMapping(value = "/getUserByIdByPass", method = RequestMethod.POST)
    public ResponseResult<User> getUserByIdByPass(@RequestBody User user) throws Exception {
        return ResponseResult.success(userQueryService.getUserByIdByPass(user));
    }

    @RequestMapping("/getUserById")
    public ResponseResult<Integer> getUserById(@ModelAttribute User user) throws Exception {
        return ResponseResult.success(userQueryService.getUserById(user.getUserId()));
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public ResponseResult<Integer> saveUser(@RequestBody UserCommand user) throws Exception {
        return ResponseResult.success(userService.saveUser(user));
    }
}
