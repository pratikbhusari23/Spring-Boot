package com.codingNinjas.Bank.Account.Registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.jackson.databind.introspect.Annotated;

import java.util.Scanner;

@SpringBootApplication
public class BankAccountRegistrationApplication {

	public static void main(String[] args) {

		/*
		* 1. Fetch context from ApplicationContext.xml and initiate scanner.
		* 2. Get user details from console.
		* 3. Get account details from user and add them to the account list.
		* 4. Display the list of accounts with their reference ids.
		*/

	

		ApplicationContext context = SpringApplication.run(BankAccountRegistrationApplication.class, args);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Account Registration Application! Please enter Your name?");
		String name = scanner.nextLine();

		System.out.println("Do you want to add account type? 1. Yes 2. No");
		int choice = scanner.nextInt();


		User user = context.getBean(User.class);
		user.setUserDetails(name);

		while(choice == 1){
			System.out.println("Please select the account type 1. Current 2. Savings");
			int accountType = scanner.nextInt();

			System.out.println("Enter the opening balance");
			double balance = scanner.nextDouble();

			Account account = null;
			if(accountType == 1){
				account = (Account) context.getBean("currentAccount");
				//
			}else if(accountType == 2){
				account = (Account) context.getBean("savingsAccount");
			}
       
			account.addBalance(balance);
			user.addAccount(account);

			System.out.println("Do you want to add more accounts 1. Yes 2. No");
			choice = scanner.nextInt();
		
		}

		System.out.println("Hi "+user.getName()+", here is the list of your accounts:");
		for(Account account : user.getAllAccounts()){
			System.out.println(account.getAccountType()+" Account: opening balance "+account.getBalance()+" Reference Id "+account.hashCode());
		}
	}

}

/*

Walcome to Account Registration Application! Please enter Your name?

Do you want to add account

1. Yes 2. N0

Please select the account type

1. Current

2. Savings

Enter the opening balance

120

Do you want to add more accounts

1. Yes

2. No

Please select the account type

1. Current 2. Savings

Enter the opening balance

220

Do you want to add more accounts

1. Yes

2. No

Please select the account type

1. Current 2. Savings

Enter the opening balance

400

Do you want to add more accounts

1. Yes

2. No

Please select the account type

1. Current

2. Savings

2 Enter the opening balance

500

Do you want to and more accounts

1. Yes

2. No 2

Hi John, here is the list of your accounts: Current Account: opening balance 120.0 Reference Id @1f258666

Current Account : opening balance 220.0 Reference Id 97dcf9478

Savings Account: opening balance-400.0 Reference 14 0229166ed Savings Account: opening balance 500.0 Reference Id 031190526

Process finished with exit code 0

*/