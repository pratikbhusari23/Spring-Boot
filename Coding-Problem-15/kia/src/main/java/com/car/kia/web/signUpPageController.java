package com.car.kia.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class signUpPageController {
    
    @RequestMapping("/carregister")
    public String getsignUpPage() {
        return "carregister";
    }
}
