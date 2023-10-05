package com.pb.website.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pb.website.repository.StudentUserDAO;

@Component
public class StudentUser implements User{
    
    @Autowired
    StudentUserDAO studentUserDAO;

    String name;
    String gender;
    String location;
    String college;
    Integer userId;


    public boolean createUser(String name ,String gender ,String location ,String college){
        this.name=name;
        this.gender=gender;
        this.location=location;
        this.college=college;
        return true;
    }

    public Integer getUserId(){
        System.out.println(this.name);
        return studentUserDAO.saveEntity(this); 
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCollege() {
        return this.college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
}
