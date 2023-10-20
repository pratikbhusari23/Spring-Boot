package com.car.kiaa.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomePageController {
    
    @RequestMapping("/welcome")
    public String getwebPage() {
        return "welcome";
    }
}
