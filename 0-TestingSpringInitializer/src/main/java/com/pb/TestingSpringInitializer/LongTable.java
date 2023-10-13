package com.pb.TestingSpringInitializer;

public class LongTable implements Table{
    
    double height;
    double length;

    public LongTable(){
        this.height = 25;
        this.length = 20;
    }
    @Override
    public String showDetails(){
        return "the table has height of " + height + " and length of " + length + " and it is a Long Table";
    }
}