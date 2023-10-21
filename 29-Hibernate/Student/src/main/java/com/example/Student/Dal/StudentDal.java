package com.example.Student.Dal;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Student.Entity.Student;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDal {

    @Autowired
    EntityManager entityManager;

    public void saveStudent(Student student) {

        Session session = entityManager.unwrap(Session.class);
        session.persist(student);

        
    }
    
}
