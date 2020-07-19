package demo.controller;

import demo.entity.User;
import demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MapperController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUser")
    public List<User> queryUser(){
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
