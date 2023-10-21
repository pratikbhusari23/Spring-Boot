package com.example.Student.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String standard;

    public Student(String name, String standard) {
        this.name = name;
        this.standard = standard;
    }

    public int getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return this.standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }


}
