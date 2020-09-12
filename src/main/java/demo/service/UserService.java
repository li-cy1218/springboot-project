package demo.service;

import demo.entity.User;
import demo.mapper.UserMapper;
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


}
