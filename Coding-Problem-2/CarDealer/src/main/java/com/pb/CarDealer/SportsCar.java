package com.pb.CarDealer;

public class SportsCar implements Car{
    

    private String ownerName;
    Tyre tyre;

    public SportsCar(Tyre tyre){
        this.tyre = tyre;
    }

    public String getinfo(){
        return "sports car"+ " " + tyre.getTyreInfo();
    }
    
    public void setOwnerName(String name){
        this.ownerName = name;
    }
    
    public String getOwnerName(){
        return this.ownerName;
    }

}
