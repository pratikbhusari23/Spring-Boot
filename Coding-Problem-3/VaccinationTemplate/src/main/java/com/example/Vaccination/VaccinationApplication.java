package com.example.Vaccination;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class VaccinationApplication {

    private static ClassPathXmlApplicationContext context;
    private static Scanner scanner;

    public static void main(String[] args) {
        System.out.println("Welcome to Vaccination Application");
        context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Please choose your vaccine preference:\n1.Covid\n2.Polio\n3.Typhoid");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    handleVaccineAppointment("Covid");
                    break;
                case 2:
                    handleVaccineAppointment("Polio");
                    break;
                case 3:
                    handleVaccineAppointment("Typhoid");
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.exit(0);
            }

            System.out.println("Do you want to register for someone else? \n1. Yes\n2. No");
            int choice2 = scanner.nextInt();
            flag = (choice2 == 1);
        }

        // Close the application context
        context.close();
    }

    private static void handleVaccineAppointment(String vaccineType) {
		System.out.println("Whom do you want to vaccinate\n1.Father\n2.Mother\n3.Self\n4.Spouse\n5.Exit");
		int choice = scanner.nextInt();
	
		if (choice >= 1 && choice <= 4) {
			String role = "";
			switch (choice) {
				case 1:
					role = "Father";
					break;
				case 2:
					role = "Mother";
					break;
				case 3:
					role = "Self";
					break;
				case 4:
					role = "Spouse";
					break;
			}
	
			String beanName = role.toLowerCase() + vaccineType;
			User person = (User) context.getBean(beanName);
	
			// Check if the person is already vaccinated for the chosen vaccine
			if (person.IsVaccinated()) {
				System.out.println(role + " is already vaccinated for " + vaccineType);
				return;
			}
	
			System.out.print("Please enter " + role + " details:\nName: ");
			String name = scanner.next();
			System.out.print("Age: ");
			int age = scanner.nextInt();
			System.out.print("Appointment date (YYYY-MM-DD): ");
			String date = scanner.next();
			System.out.print("Appointment time (HH:MM AM/PM): ");
			String time = scanner.next();
			
			System.out.print("Appointment location: ");
			String location = scanner.next();
	
			TimeAndLocation tal = (TimeAndLocation) context.getBean("timeAndLocation");
			tal.setDate(date);
			tal.setTimeSlot(time);
			tal.setLocation(location);
	
			person.setUserDetails(name, age, tal);
			person.setAppointment();
		} else if (choice == 5) {
			System.exit(0);
		} else {
			System.out.println("Invalid choice");
			System.exit(0);
		}
	}
	
}
