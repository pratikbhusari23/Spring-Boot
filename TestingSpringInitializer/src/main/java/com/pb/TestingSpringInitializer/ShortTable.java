package com.pb.TestingSpringInitializer;

public class ShortTable implements Table{
    
    double height;
    double length;

    public ShortTable(){
        this.height = 15;
        this.length = 20;
    }
    @Override
    public String showDetails(){
        return "the table has height of " + height + " and length of " + length + " and it is short table";
    }
}
