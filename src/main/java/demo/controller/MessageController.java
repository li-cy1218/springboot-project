package demo.controller;

import demo.entity.Message;
import demo.mapper.MessageMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "user", description = "userMessage")
public class MessageController {

    @Autowired
    private MessageMapper messageMapper;

    @ApiOperation(value = "selectMessage", notes = "getAllData")
    @GetMapping("/getMessage")
    public List<Message> getMessage() {
        List<Message> allData = messageMapper.selectAllMessageData();
        return allData;
    }

    @ApiOperation(value = "selectMessageForId", notes = "getData")
    @ApiImplicitParam(value="message id")
    @GetMapping("/getMessage/{messageId}")
    public List<Message> getMessageForId (@PathVariable int messageId) {
        List<Message> messageList = messageMapper.selectMessageDataForId(messageId);
        return messageList;
    }

}
