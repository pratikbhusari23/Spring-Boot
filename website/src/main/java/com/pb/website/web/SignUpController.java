package com.pb.website.web;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pb.website.domain.User;
import com.pb.website.domain.StudentUser;
import com.pb.website.service.UserService;

@Controller
public class SignUpController {
    
    @Autowired
    UserService userService;

    @RequestMapping("/signup")
    public String getSignUpPage(Model uiModel) {

        User user = userService.getUser();
        uiModel.addAttribute("user", user);
        return "signup";
    }

    @RequestMapping("/registerUser")
    public String registerUser(@ModelAttribute("user") StudentUser StudentUser) {
        int id=userService.signUp(StudentUser.getName(), StudentUser.getGender(), StudentUser.getLocation(), StudentUser.getCollege());
           
        if(id!=-1){

            ModelAndView model = new ModelAndView("redirect:welcome?id="+id); 
            return model.getViewName();
        }
        return "signup"; 
    }

    @RequestMapping("/welcome")
    public String getWelcomePage(@RequestParam("id") String id , ModelMap map) {
        map.addAttribute("id",id);
        return "welcome";
    }

    @RequestMapping("/instructors")
    public String showInstructors(ModelMap map) {
        // Creating Instructors using HashMap

        HashMap<String,Object> instructors = new HashMap<String,Object>();
        instructors.put("name", "Rahul");
        instructors.put("Age", 23);
        instructors.put("id", 123);

        // Creating ArrayList of HashMaps for Instructors
        ArrayList<HashMap<String,Object>> instructorsList = new ArrayList<HashMap<String,Object>>(); 
        instructorsList.add(instructors);


        // Sending key value pair to the view

        map.addAttribute("instructors",instructorsList);
        return "instructors";

    }

    @RequestMapping("/profile/{profileId}")
    public String showProfile(@PathVariable("profileId") String profileId, ModelMap map) {
        
        map.addAttribute("profileId",profileId);
        return "profile";
    }
} 

