package com.pb.website.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pb.website.service.UserMessageService;

@Controller
public class SupportController {
    
    @Autowired
    UserMessageService userMessageService;
    
    @RequestMapping("/support")
    public String getSupportPage(@RequestParam("id") String id , ModelMap uiModel) {

        // String finalUserMessage = userMessageService.createMessage(Integer.parseInt(id));
        // uiModel.addAttribute("message", finalUserMessage);

    uiModel.addAttribute("message", /*userMessageService.createMessage(Integer.parseInt(id)) , */ "Welcome to Support Pageee "+id);
        return "support";
    }
}
