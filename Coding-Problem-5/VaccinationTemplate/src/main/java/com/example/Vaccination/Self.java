package com.example.Vaccination;

import com.example.Vaccination.User;

public class Self implements User {

    public String name;
    private int age;
    private TimeAndLocation timeAndLocation;
    private String appointment;
    private boolean isVaccinated;

    Vaccine vaccine ;

    public Self() {
    }
    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }
    public void setTimeAndLocation(TimeAndLocation timeAndLocation) {
        this.timeAndLocation = timeAndLocation;
    }
    public Self(TimeAndLocation timeAndLocation, Vaccine vaccine) {
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
        System.out.println("Hello "+name+" your appointement has been fixed for "+getVaccineDetails()+ " on "+timeAndLocation.getDetails());
        this.isVaccinated = true;
    }

    public boolean IsVaccinated() {
        return isVaccinated;
    }
}
