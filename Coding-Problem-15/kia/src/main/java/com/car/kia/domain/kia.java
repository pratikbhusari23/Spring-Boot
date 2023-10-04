package com.car.kia.domain;

public class kia implements car {

    private Integer carId;
    private String registrationNumber;
    private String name;
    private String details;
    private String work;

    @Override
    public Integer getCarId() {
        return carId;
    }

    @Override
    public void setDetails(String registrationNumber , String name , String details , String work) {
        this.carId = carId;
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.details = details;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return this.details;
    }


    public String getWork() {
        return this.work;
    }

    public void setWork(String work) {
        this.work = work;
    }

}
    
