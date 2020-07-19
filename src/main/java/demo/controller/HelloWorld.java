package demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        Map<String, String> map = new HashMap<>();
        map.put("msg", "HelloWorld");
        return map;
    }
}
