package com.pb.CarDealer;

public class Truck implements Car {
    
    private String ownerName;
    Tyre tyre;

    public Truck(){
        
    }
    public void setTyre(Tyre tyre){
        this.tyre = tyre;
    }
    public Truck(Tyre tyre){
        this.tyre = tyre;
    }
    
    public String getinfo(){
        return "truck"+ " " + tyre.getTyreInfo();
    }
    
    public void setOwnerName(String name){
        this.ownerName = name;
    }
    
    public String getOwnerName(){
        return this.ownerName;
    }
}
