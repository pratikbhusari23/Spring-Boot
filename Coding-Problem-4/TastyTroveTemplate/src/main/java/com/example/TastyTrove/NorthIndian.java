package com.example.TastyTrove;

/*
 * 1. Add class attributes.
 * 2. Override all the interface methods.
 * 3. Implement setter injection
 */

public class NorthIndian implements Recipe {

    private String userName;
    private String name;
    Ingredients ingredients;

    public NorthIndian(){
        
    }

    public void getDetails() {
        System.out.println("northIndian");
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }


}
