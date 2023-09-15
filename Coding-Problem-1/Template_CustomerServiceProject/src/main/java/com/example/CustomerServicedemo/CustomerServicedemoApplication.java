package com.example.CustomerServicedemo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Customers.CustomerCare;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class CustomerServicedemoApplication {

	public static void main(String[] args) {

		/*
		 *  1. Load the beans from ApplicationContext.xml
		 *  2. Display all the departments available and get the input from user.
		 *  3. Get the message from user and store it into the respective department.
		 *  
		 */

		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		CustomerCare paymentDepartment = (CustomerCare) context.getBean("paymentDepartment");
        CustomerCare salesDepartment = (CustomerCare) context.getBean("salesDepartment");
        CustomerCare queryDepartment = (CustomerCare) context.getBean("queryDepartment");

		System.out.println("Welcome to Our Customer Care Application");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your name : ");
		String name = sc.nextLine();

		System.out.println("Thankyou for Reaching us "+ name);

		System.out.println("Please select the department to connect to : \n"+"1.Payment  Department\n"+"2.Query  Department\n"+"3.Sales  Department\n"+"0.exit");

		int choice = sc.nextInt();
		sc.nextLine();

		switch (choice) {

			case 1:
					System.out.println("welcome to payment department "+ name + "\n How may i assist you with your payment inquiry");
					String problem = sc.nextLine();
					paymentDepartment.setCustomerName(name);
                	paymentDepartment.setProblem(problem);
                	System.out.println(paymentDepartment.getProblem());
                	break;
			
			case 2:

					System.out.println("welcome to query department "+ name + "\n How may i assist you with your query");
					String problem1 = sc.nextLine();
					queryDepartment.setCustomerName(name);
					queryDepartment.setProblem(problem1);
					System.out.println(queryDepartment.getProblem());
					break;

			case 3:

					System.out.println("welcome to sales department "+ name + "\n How may i assist you with your sales inquiry");
					String problem2 = sc.nextLine();
					salesDepartment.setCustomerName(name);
					salesDepartment.setProblem(problem2);
					System.out.println(salesDepartment.getProblem());
					break;
			
			case 0:
					System.out.println("Thankyou for contacting us");
					break;
					
			default:
					System.out.println("Please enter a valid choice");

		}
		

	}
}
