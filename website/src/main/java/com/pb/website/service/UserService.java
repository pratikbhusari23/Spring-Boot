package com.pb.website.service;

import com.pb.website.domain.User;

public interface UserService {

    public User getUser();

    public int signUp(String name , String gender, String location , String college);
}

