/*
    3. Complete the Father, Mother, Self, and Spouse classes by
    
    a. Adding common attributes:

    1. String name
    2. Integer age
    3. TimeAndLocation(class), vaccine(interface), both 
        injected by the constructor method 
    4. isVaccinated(boolean)

    b. Override the user interface methods.
 */

package com.example.Vaccination;

import com.example.Vaccination.User;

public class Father implements User {

    private String name;
    private int age;
    private TimeAndLocation timeAndLocation;
    private String appointment;
    private boolean isVaccinated;

    Vaccine vaccine ;

    public Father(Vaccine vaccine, TimeAndLocation timeAndLocation) {
        this.vaccine = vaccine;
        this.timeAndLocation = timeAndLocation;
    }
    public Vaccine getVaccineDetails() {
        return vaccine;
    }
    
    public void setUserDetails(String name, int age, TimeAndLocation timeAndLocation) {
        this.name = name;
        this.age = age;
        this.timeAndLocation = timeAndLocation;
    }


    public void setAppointment() {
        System.out.println("Hello "+name+" your appointement has been fixed for "+getVaccineDetails().getType()+ " on "+timeAndLocation.getTimeSlot()+ " at "+timeAndLocation.getLocation()+ " on "+timeAndLocation.getDate());
        this.isVaccinated = true;
    
    }

    public boolean IsVaccinated() {
        return isVaccinated;
    }
}

