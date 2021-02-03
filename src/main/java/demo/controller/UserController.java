package demo.controller;

import demo.entity.User;
import demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("用户管理")
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("注册用户")
    @RequestMapping("/addUser")
    @ResponseBody
    public String insertUser(@ModelAttribute User user) {
        userService.addUser(user);
        return "success";
    }

    @ApiOperation("用户登录")
    @RequestMapping("/login")
    @ResponseBody
    public Boolean userLogin(@ModelAttribute User user) {
        System.out.println(111);
        return userService.selectUser(user);
    }


}
