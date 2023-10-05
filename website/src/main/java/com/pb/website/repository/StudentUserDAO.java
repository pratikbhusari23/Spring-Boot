package com.pb.website.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.pb.website.domain.StudentUser;

@Repository
@Scope("singleton")
public class StudentUserDAO implements DAO<StudentUser>{

    private List<StudentUser> studentUserList = new ArrayList<StudentUser>();

    @Override
    public Optional<StudentUser> getEntityById(Integer id) {
        
        if(!studentUserList.isEmpty()){
            return Optional.of(studentUserList.get(id));
        }
        return Optional.empty();
        
    }

    @Override
    public int saveEntity(StudentUser student) {
        
        int id = studentUserList.size();
        student.setUserId(id);
        studentUserList.add(student);
        System.out.println("Student User Created "+id);
        return id;
    }
    
}
