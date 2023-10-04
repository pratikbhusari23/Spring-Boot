package com.car.kia.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class welcomeController {
    
    @RequestMapping("/welcome")
    public String getwebPage() {
        return "welcome";
    }
}
