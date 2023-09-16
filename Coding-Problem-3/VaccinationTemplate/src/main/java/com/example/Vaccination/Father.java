package com.example.Vaccination;

import com.example.Vaccination.User;

public class Father implements User {

    private String name;
    private int age;
    private TimeAndLocation timeAndLocation;
    private String appointment;

    Vaccine vaccine ;

    public Father(Vaccine vaccine) {
        this.vaccine = vaccine;
    }
    public Vaccine getVaccineDetails() {
        return vaccine;
    }
    
    public void setUserDetails(String name, int age, TimeAndLocation timeAndLocation) {
        this.name = name;
        this.age = age;
        this.timeAndLocation = timeAndLocation;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public boolean IsVaccinated() {
        return true;
    }
}

