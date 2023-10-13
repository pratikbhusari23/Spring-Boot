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

    public void  setDetails(String timeSlot, String location, String date) {
        this.timeSlot = timeSlot;
        this.location = location;
        this.date = date;
    }

    public String getDetails() {
        return  timeSlot + " at "+ location + " on " + date;
    }
    
}
