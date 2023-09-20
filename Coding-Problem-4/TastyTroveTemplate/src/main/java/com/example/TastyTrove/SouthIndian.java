package com.example.TastyTrove;

/*
 * 1. Add class attributes.
 * 2. Override all the interface methods.
 * 3. Implement setter injection
 */

public class SouthIndian implements Recipe {

    private String userName;
    private String name;
    Ingredients ingredients;

    public SouthIndian(){
        
    }

    public void getDetails() {
        System.out.println("southIndian");
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
