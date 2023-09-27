package com.pb.EducationApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaidCourse implements Course{
	
	String courseName;
	Instructor courseInstructor;
	
	@Autowired
	@Qualifier("javaInstructor")
	Instructor javaInstructor;

	@Autowired
	@Qualifier("springInstructor")
	Instructor springInstructor;

	@Autowired
	UserList userList;

	
	// public PaidCourse(Instructor instructor,UserList userList) {
	// 	this.courseInstructor = instructor;
	// 	this.userList = userList;
	// }
	
	@Override
	public void setCourseDetails(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public UserList getUserList() {
		return this.userList;
	}

	@Override
	public Instructor getInstructor() {
		return this.courseInstructor;
	}

	@Override
	public String getCourseName() {
		return this.courseName;
	}
	public void setCourseInstructor(String instructorName) {
		if(instructorName.equals("javaInstructor")) {
			this.courseInstructor = javaInstructor;
		}
		else if(instructorName.equals("springInstructor")) {
			this.courseInstructor = springInstructor;
		}
	}
}
