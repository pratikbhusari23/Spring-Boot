package com.example.CustomerServicedemo;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Customers.CustomerCare;

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

		System.out.println("Welcome to Our Customer Care Application");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your name : ");
		String name = sc.nextLine();

		System.out.println("Thankyou for Reaching us "+ name);

		System.out.println("Please select the department to connect to : \n"+"1.Payment  Department\n"+"2.Query  Department\n"+"3.Sales  Department\n"+"0.exit");

		int choice = sc.nextInt();
		sc.nextLine();

		CustomerCare customerCare = null;

		switch (choice) {

			case 1:
					{
					customerCare = (CustomerCare) context.getBean("paymentDepartment");			
                	break;
				}
			case 2:
					{
					customerCare = (CustomerCare) context.getBean("queryDepartment");				
					break;
				}

			case 3:	
				{
					customerCare = (CustomerCare) context.getBean("salesDepartment");			
					break;
				}
			case 0:
					{
					System.out.println("Thankyou for contacting us");
					break;
				}
			default:
					System.out.println("Please enter a valid choice");
		}
		customerCare.setCustomerName(name);
		System.out.println(customerCare.getService());
		String problem = sc.nextLine();
		customerCare.setProblem(problem);
		
		System.out.println(customerCare.getProblem());
		context.close();
		sc.close();


	}
}
