package demo.controller;

import demo.entity.User;
import demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api("用户页面")
@RestController
@RequestMapping("/user")
public class RegisterController {

    private static Logger LOGGER = LoggerFactory.getLogger(RegisterController.class);

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation("用户注册")
    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public int registerUser(@RequestBody Map<String, String> userDetail) {
        LOGGER.info("Start register user message.");
        return userService.registerService(userDetail);
    }

}
