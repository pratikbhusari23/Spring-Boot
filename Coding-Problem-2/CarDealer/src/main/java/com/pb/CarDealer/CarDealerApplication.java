package com.pb.CarDealer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import java.util.Scanner;

@SpringBootApplication
public class CarDealerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarDealerApplication.class, args);

		System.out.println("Hii ! Please enter your name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		System.out.println("Please Select Car of Your Choice : \n 1. Normal Car \n 2. Sports Car \n 3. Truck");

		int choice = sc.nextInt();

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Car car = null;
		switch(choice){
			case 1:
				{
				System.out.println("Please Enter Your Tyre Type : \n 1. Normal Tyre \n 2. Sports Tyre \n 3. Truck Tyre");
				int tyreChoice = sc.nextInt();

				switch(tyreChoice){
					case 1:
						car= (Car) context.getBean("NormalCarNormalTyre");
						break;
					case 2:
						car= (Car) context.getBean("NormalCarSportsTyre");
						break;
					case 3:
						car= (Car) context.getBean("NormalCarHeavyTyre");
						break;
					default:
						System.out.println("Please select correct option");
				}
			}
				break;
			case 2:
			{
				System.out.println("Please Enter Your Tyre Type : \n 1. Normal Tyre \n 2. Sports Tyre \n 3. Truck Tyre");
				int tyreChoice = sc.nextInt();

				switch(tyreChoice){
					case 1:
						car= (Car) context.getBean("SportsCarNormalTyre");
						break;
					case 2:
						car= (Car) context.getBean("SportsCarSportsTyre");
						break;
					case 3:
						car= (Car) context.getBean("SportsCarHeavyTyre");
						break;
					default:
						System.out.println("Please select correct option");
				}
				break;
			}
			case 3:
			{
				System.out.println("Please Enter Your Tyre Type : \n 1. Normal Tyre \n 2. Sports Tyre \n 3. Truck Tyre");
				int tyreChoice = sc.nextInt();

				switch(tyreChoice){
					case 1:
						car= (Car) context.getBean("TruckNormalTyre");
						break;
					case 2:
						car= (Car) context.getBean("TruckSportsTyre");
						break;
					case 3:
						car= (Car) context.getBean("TruckHeavyTyre");
						break;
					default:
						System.out.println("Please select correct option");
				}
				break;
			}
			default:
				System.out.println("Please select correct option");
		}

		car.setOwnerName(name);
		System.out.println(car.getOwnerName() + " owns " + car.getinfo());
	
	}

}
