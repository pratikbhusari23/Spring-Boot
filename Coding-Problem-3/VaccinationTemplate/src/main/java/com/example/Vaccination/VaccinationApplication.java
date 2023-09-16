package com.example.Vaccination;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class VaccinationApplication {

    public static void main(String[] args) {

        /*
		1. Fetch context from ApplicationContext.xml and initiate Scanner.
		2. Fetch vaccine and User type choice.
		3. Get the required bean from context.
		4. Get the appointment details form user
		5. Display the appointment details
		6. Ask for more vaccination appointment booking
		 */
		
		// Code here

		System.out.println("Welcome to Vaccination Application");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose your vaccine preference:\n 1. Covid\n 2. Polio\n 3. Typhoid");

		int choice = sc.nextInt();
		Vaccine vaccine = null;

		switch (choice) {
			case 1:
			{
				System.out.println("Whom do you want to vaccinate\n1.Father\n2.Mother\n3.Self\n4.Spouse\n5.Exit");
				int choice1 = sc.nextInt();

				switch (choice1) {
					case 1:
					{
						vaccine = (Vaccine) context.getBean("fatherCovid");
						break;
					}
					case 2:
					{
						vaccine = (Vaccine) context.getBean("motherCovid");
						break;
					}
					case 3:
					{
						vaccine = (Vaccine) context.getBean("selfCovid");
						break;
					}
					case 4:
					{
						vaccine = (Vaccine) context.getBean("spouseCovid");
						break;
					}
					case 5:
					{
						System.exit(0);
					}
				}
			}
			case 2:
			{
				System.out.println("Whom do you want to vaccinate\n1.Father\n2.Mother\n3.Self\n4.Spouse\n5.Exit");
				int choice1 = sc.nextInt();

				switch (choice1) {
					case 1:
					{
						vaccine = (Vaccine) context.getBean("fatherPolio");
						break;
					}
					case 2:
					{
						vaccine = (Vaccine) context.getBean("motherPolio");
						break;
					}
					case 3:
					{
						vaccine = (Vaccine) context.getBean("selfPolio");
						break;
					}
					case 4:
					{
						vaccine = (Vaccine) context.getBean("spousePolio");
						break;
					}
					case 5:
					{
						System.exit(0);
					}
				}
			}
			case 3:
			{
				System.out.println("Whom do you want to vaccinate\n1.Father\n2.Mother\n3.Self\n4.Spouse\n5.Exit");
				int choice1 = sc.nextInt();

				switch (choice1) {
					case 1:
					{
						vaccine = (Vaccine) context.getBean("fatherTyphoid");
						break;
					}
					case 2:
					{
						vaccine = (Vaccine) context.getBean("motherTyphoid");
						break;
					}
					case 3:
					{
						vaccine = (Vaccine) context.getBean("selfTyphoid");
						break;
					}
					case 4:
					{
						vaccine = (Vaccine) context.getBean("spouseTyphoid");
						break;
					}
					case 5:
					{
						System.exit(0);
					}
				}
			}

		}

		System.out.println("please enter"+);
    }
}