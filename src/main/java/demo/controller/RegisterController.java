package demo.controller;

import demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api("New user register.")
@RestController
@RequestMapping("/register")
public class RegisterController {

    private static Logger LOGGER = LoggerFactory.getLogger(RegisterController.class);

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation("User register.")
    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public int registerUser(@RequestBody Map<String, String> userDetail) {
        LOGGER.info("Start register user message.");
        return userService.registerService(userDetail);
    }

}
