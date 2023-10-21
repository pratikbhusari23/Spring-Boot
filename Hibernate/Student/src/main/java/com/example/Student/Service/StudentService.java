package com.example.Student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.Dal.StudentDal;
import com.example.Student.Entity.Student;

import jakarta.transaction.Transactional;

@Service
public class StudentService {
    
    @Autowired
    StudentDal studentDal;
    @Transactional
    public void saveStudent(Student student) {
        
        studentDal.saveStudent(student);
    }   
}
