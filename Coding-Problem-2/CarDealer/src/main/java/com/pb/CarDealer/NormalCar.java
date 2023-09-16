package com.pb.CarDealer;

public class NormalCar implements Car{
    
    private String ownerName;
    Tyre tyre;

    public NormalCar(Tyre tyre){
        this.tyre = tyre;
    }
    public String getinfo(){
        return "normal car"+ " " + tyre.getTyreInfo();
    }
    
    public void setOwnerName(String name){
        this.ownerName = name;
    }
    
    public String getOwnerName(){
        return this.ownerName;
    }

}
