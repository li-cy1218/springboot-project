package demo.service;

import demo.entity.User;
import demo.mapper.UserMapper;
<<<<<<< HEAD
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
        userMessage.setRole("2");
        userMessage.setShop(userDetail.get("shop"));
        LOGGER.debug("Start import user register message...");
        userMapper.insertUserMessage(userMessage);
        LOGGER.info("End register user message...");
        return 1;
    }
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public Boolean selectUser(User user) {
        String userName = user.getUserName();
        String passWord = user.getPassWord();

        String selectResult = userMapper.selectPassWord(userName);

        return selectResult == null ? true : passWord.equals(selectResult);
    }


>>>>>>> c76d43a9412afa4883e08eef45080ae3b43d8bd7
}
