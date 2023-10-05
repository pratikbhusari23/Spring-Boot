package com.pb.website.domain;

import org.springframework.stereotype.Component;

@Component
public class SupportUserMessage implements UserMessage{

    String Message;
    @Override
    public void setUserId(int userId) {
        
        this.Message = "Hello Welcome to Support " + String.valueOf(userId);
    }

    public String getMessage() {
        return this.Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }
    
}
