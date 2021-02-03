package demo.mapper;

import demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

<<<<<<< HEAD
    User getUserDetail(@Param("userName") String userName);

    List<User> queryUserList();

    void insertUserMessage(User user);


=======
    String selectPassWord(String userName);

    void addUser(User user);
>>>>>>> c76d43a9412afa4883e08eef45080ae3b43d8bd7
}
