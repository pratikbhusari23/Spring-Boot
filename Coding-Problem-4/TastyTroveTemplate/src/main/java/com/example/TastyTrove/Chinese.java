package com.example.TastyTrove;

/*
 * 1. Add class attributes.
 * 2. Override all the interface methods.
 * 3. Implement setter injection
 */

public class Chinese implements Recipe {

    private String userName;
    private String name;
    Ingredients ingredients;

    public Chinese(){

    }
    public void getDetails() {
        System.out.println("chinese");
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }

}