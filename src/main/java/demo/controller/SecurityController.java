package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {

    @RequestMapping("/first")
    public String first() {
        return "first";
    }

    @RequestMapping("/home1")
    public String home1() {
        return "home1";
    }

    @RequestMapping("/home2")
    public String home2() {
        return "home2";
    }

    @RequestMapping("/home3")
    public String home3() {
        return "home3";
    }

    @RequestMapping("/home4")
    public String home4() {
        return "home4";
    }
}
