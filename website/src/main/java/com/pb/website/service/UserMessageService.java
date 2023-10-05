package com.pb.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.website.domain.SupportUserMessage;
import com.pb.website.domain.UserMessage;

@Service
public class UserMessageService implements MessageService {

    @Autowired
    UserMessage userMessage;

    @Override
    public String createMessage(int userId) {

        userMessage.setUserId(userId);
        SupportUserMessage supportUserMessage=(SupportUserMessage)userMessage;
        return supportUserMessage.getMessage();
    }
    
}
