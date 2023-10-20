package com.example.CarServicePart_1.domain;
import org.springframework.stereotype.Component;
import java.util.Objects;

@Component
public class Car implements Vehicle{

/**

 1. Domain Model is already created for you, just generate getter and setter.
 2. Also,Implement the interface Vehicle and Override the method saveVehicleDetails() and createVehicle() in car.
**/
    String RegisterationNumber;
    String CarName;
    String CarDetails;
    String CarWork;
    Integer CarId;

    public Boolean saveVehicleDetails() {
        return true;
    }

    public void createVehicle(String RegistrationNumber, String CarName, String CarDetails, String WorkDone) {
        this.RegisterationNumber = RegistrationNumber;
        this.CarName = CarName;
        this.CarDetails = CarDetails;
        this.CarWork = WorkDone;
    }

    public String getRegisterationNumber() {
        return this.RegisterationNumber;
    }

    public void setRegisterationNumber(String RegisterationNumber) {
        this.RegisterationNumber = RegisterationNumber;
    }

    public String getCarName() {
        return this.CarName;
    }

    public void setCarName(String CarName) {
        this.CarName = CarName;
    }

    public String getCarDetails() {
        return this.CarDetails;
    }

    public void setCarDetails(String CarDetails) {
        this.CarDetails = CarDetails;
    }

    public String getCarWork() {
        return this.CarWork;
    }

    public void setCarWork(String CarWork) {
        this.CarWork = CarWork;
    }

    public Integer getCarId() {
        return this.CarId;
    }

    public void setCarId(Integer CarId) {
        this.CarId = CarId;
    }
    

}
