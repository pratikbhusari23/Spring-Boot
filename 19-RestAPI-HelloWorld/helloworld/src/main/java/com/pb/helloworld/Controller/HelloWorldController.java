package com.pb.helloworld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class HelloWorldController {
    
    @RequestMapping("/hello")
    public String hello(){
        return "hello World";
    }

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello Pratik";
    }

    @GetMapping("/hello-mars/{name}")
    public String helloMars(@PathVariable String name){
        return "Hello from mars " +name;
    }
}

