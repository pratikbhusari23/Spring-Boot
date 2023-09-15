package com.pb.TestingSpringInitializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;
@SpringBootApplication
public class TestingSpringInitializerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingSpringInitializerApplication.class, args);
		System.out.println("Please Select a size of table as Long or Short");
		Scanner sc = new Scanner(System.in);
		String size = sc.nextLine();

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Table LongTable = (Table) context.getBean("LongTable");
		Table ShortTable = (Table) context.getBean("ShortTable");

		if(size.equals("long")){
			System.out.println(LongTable.showDetails());
		}else{

			System.out.println(ShortTable.showDetails());
		}

		
	}

}
