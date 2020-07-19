package demo.controller;

import demo.entity.Message;
import demo.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {

    @Autowired
    private MessageMapper messageMapper;

    @GetMapping("/getMessage")
    public List<Message> getMessage() {
        List<Message> allData = messageMapper.selectAllMessageData();
        return allData;
    }

}
