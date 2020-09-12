package demo.mapper;

import demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    String selectPassWord(String userName);

    void addUser(User user);
}
