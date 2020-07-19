package demo.mapper;

import demo.entity.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {

    public List<Message> selectAllMessageData();
}
