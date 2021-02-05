package demo.service;

import demo.entity.User;
import demo.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    private static Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public int registerService(Map<String, String> userDetail) {
        LOGGER.debug("Start check whether user message exist...");
        User user = userMapper.getUserDetail(userDetail.get("email"));
        if (user != null) {
            LOGGER.debug("User message is exist...");
            return 0;
        }
        LOGGER.debug("End check user message...");
        User userMessage = new User();
        userMessage.setEmail(userDetail.get("email"));
        userMessage.setPassword(userDetail.get("password"));
        userMessage.setRole("1");
        userMessage.setShop(userDetail.get("shop"));
        LOGGER.debug("Start import user register message...");
        userMapper.insertUserMessage(userMessage);
        LOGGER.info("End register user message...");
        return 1;
    }
}
