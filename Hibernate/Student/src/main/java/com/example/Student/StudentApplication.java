package com.example.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Student.Entity.Student;
import com.example.Student.Service.StudentService;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {


		

		ApplicationContext context =  SpringApplication.run(StudentApplication.class, args);
		StudentService studentService= context.getBean(StudentService.class);

		Student Student = new Student("Elon Musk","College Dropout");
		studentService.saveStudent(Student);

		

	}

}
