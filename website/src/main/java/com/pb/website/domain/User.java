package com.pb.website.domain;

public interface User {
    public boolean createUser(String name,String gender, String location , String college);
    public Integer getUserId();
}
