package demo.mapper;

import demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

    User getUserDetail(@Param("userName") String userName);

    List<User> queryUserList();

    void insertUserMessage(User user);


}
