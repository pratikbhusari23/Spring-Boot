package com.example.TastyTrove;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class TastyTroveApplication {

	public static void main(String[] args) {
		/*
		1. Fetch context from ApplicationContext.xml and initiate Scanner
		2. Fetch User details from Console
		3. Fetch Recipe selection from User
		4. Fetch Ingredient Selection
		5. Get the required bean from context.
		6. Set user's name and display the recipe details
		 */
		/*
		 A developer is creating an application called Tasty Trove Recipe Finder, which helps users find recipes. He needs help to complete the console application using Spring Boot and concepts of dependency injection.
The application should take inputs from the user for the recipe type and ingredients and show output accordingly.
The Template link is below; you must download and complete the tasks mentioned.

		Tasks-
1. Complete the three classes, Chinese, NorthIndian, and SouthIndian, each implementing the Recipe interface having similar attributes-
a. name(String),  userName(String), Ingredients(interface)
b. Inject the Ingredients interface into the classes using setter injection.
c. Override the Recipe interface methods.
2. Complete the three classes Lentils, Rice, and Wheat, each implementing the Ingredients interface-
a. Create a constructor and initialize the recipe lists with some ingredients.
b. Override the interface methods.
3. In the ApplicationContext.xml file-
a. Create beans of the ingredient types.
b. Create beans for a different dish like Chinese etc.
c. Create beans for different dishes. For example, Chinese Rice dishes, Chinese lentil dishes, etc.
d. The file is located in "src>main>resources".
4. In the main application, get the user name, recipe, and ingredients from the console.
5. Get the required bean from the context, set the user’s name, and display the recipe details.
6. Run and test the code.

Output-	
        
Welcome to Tasty Trove Application

Enter your name? : John

Select Recipe:

1. North Indian

2. South Indian

3. Chinese

3

Select Ingredient:

1. Lentils

2. Rice

3. Wheat

2

Hello user John we suggest you to make Chinese Fried Rice you can use the following ingredients:

1. Steamed Rice 
2. Ginger

3. Garlic 
4. Soy Sauce

5. Vinegar

		 */

	

		System.out.println("Welcome to Tasty Trove Aplication");
		System.out.println("Enter your name? : ");
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();
		System.out.println("Select Recipe: \n 1. North Indian \n 2. South Indian \n 3. Chinese");
		int recipe = sc.nextInt();
		System.out.println("Select Ingredient: \n 1. Lentils \n 2. Rice \n 3. Wheat");
		int ingredient = sc.nextInt();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Recipe recipeBean = null;
		Ingredients ingredientBean = null;

		switch (recipe) {
			case 1:
				recipeBean = (Recipe) context.getBean("northIndian");
				break;
			case 2:
				recipeBean = (Recipe) context.getBean("southIndian");
				break;
			case 3:
				recipeBean = (Recipe) context.getBean("chinese");
				break;
			default:
				System.out.println("Invalid Recipe");
				return;
		}

		switch (ingredient) {
			case 1:
				ingredientBean = (Ingredients) context.getBean("lentils");
				break;
			case 2:
				ingredientBean = (Ingredients) context.getBean("rice");
				break;
			case 3:
				ingredientBean = (Ingredients) context.getBean("wheat");
				break;
			default:
				System.out.println("Invalid Ingredient");
				return;
		}

		recipeBean.setUserName(userName);
		System.out.println("Hello user " + userName + " we suggest you to make " +  " " + ingredientBean.getDishDetail() + " you can use the following ingredients: \n" + ingredientBean.getDishDetail());
		//ingredientBean.setIngredient(recipeBean.getDetails());
		System.out.println(ingredientBean.getDishDetail());

		 
	}

}