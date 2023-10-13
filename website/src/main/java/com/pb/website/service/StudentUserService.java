package com.pb.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.website.domain.User;

@Service
public class StudentUserService implements UserService{
    
    @Autowired  
    User studentUser;

    @Override
    public User getUser() {
        return studentUser;
    }
    public int signUp(String name,String gender, String location , String college){

        boolean isStudentCreated= studentUser.createUser(name, gender, location, college);
        
        if(isStudentCreated){
            return studentUser.getUserId();
        }else{
            return -1;
        }

        // studentUser.getUserId();
        // return isStudentCreated;
    }

}
