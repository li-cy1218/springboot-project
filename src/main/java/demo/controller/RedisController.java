package demo.controller;

import demo.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/getCode")
    @ResponseBody
    public String getCode(String tel) {
        redisService.remove(tel);
        Random random = new Random(1);
        StringBuilder strCode = new StringBuilder();
        int numberCode = random.nextInt(100000);
        strCode.append(numberCode);
        System.out.println(numberCode);
        redisService.set(tel, strCode.toString());

        return "true";
    }

    @RequestMapping("/checkCode")
    @ResponseBody
    public String checkCode(String tel, String code) {
        String strCode = redisService.get(tel);
        if (strCode.equals(code)) {
            return "success";
        }
        return "fail";
    }
}
