package com.example.Vaccination;


public class TimeAndLocation {
/*
 2. Complete the TimeAndLocation class by adding attributes:
a. String timeSlot
b. String location
c. String date
 */

    String timeSlot;
    String location;
    String date;

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }
    public String getLocation() {
        return location;
    }
    public String getDate() {
        return date;
    }
    
}
