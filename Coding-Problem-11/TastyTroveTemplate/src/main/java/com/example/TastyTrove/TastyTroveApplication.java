
package com.example.TastyTrove;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.Annotation;
import java.util.Scanner;

@SpringBootApplication
public class TastyTroveApplication {

    public static void main(String[] args) {
        
    //     AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.TastyTrove");
         

    //     System.out.println("Welcome to Tasty Trove Application");
    //     System.out.println("Enter your name? : ");
    //     Scanner sc = new Scanner(System.in);
    //     String userName = sc.nextLine();

    //     // Select Recipe
    //     System.out.println("Select Recipe: \n 1. North Indian \n 2. South Indian \n 3. Chinese");
    //     int recipe = sc.nextInt();
    //     if (recipe < 1 || recipe > 3) {
    //         System.out.println("Invalid Recipe selection.");
    //         return;
    //     }

    //     // Select Ingredient
    //     System.out.println("Select Ingredient: \n 1. Lentils \n 2. Rice \n 3. Wheat");
    //     int ingredient = sc.nextInt();
    //     if (ingredient < 1 || ingredient > 3) {
    //         System.out.println("Invalid Ingredient selection.");
    //         return;
    //     }

    //     String beanName = getBeanName(recipe, ingredient);
    //     System.out.println("Bean Name: " + beanName);
    //     if (beanName == null) {
    //         System.out.println("Invalid Recipe and Ingredient combination.");
    //         return;
    //     }

    //     Recipe recipeBean = (Recipe)context.getBean(beanName);
    //     recipeBean.setUserName(userName);
    //     recipeBean.getDetails();

    // }

	// private static String getBeanName(int recipe, int ingredient) {
	// 	String[] recipeNames = {"northIndian", "southIndian", "chinese"};
	// 	String[] ingredientNames = {"lentils", "rice", "wheat"};
	
	// 	if (recipe < 1 || recipe > 3 || ingredient < 1 || ingredient > 3) {
	// 		return null;  // Invalid input
	// 	}
	// 	return recipeNames[recipe - 1] + ingredientNames[ingredient - 1];

        Scanner scanner = new Scanner(System.in);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.TastyTrove");
        System.out.println("Welcome to Tasty Trove Application");

        // Enter User details
        System.out.println("Enter your name?");
        String name = scanner.nextLine();

        //Recipe Selection
        System.out.println("Select Recipe:\n1. North Indian\n2. South Indian\n3. Chinese");
        int recipeTypeChoice = scanner.nextInt();
        String recipeChoice = null;

        switch (recipeTypeChoice) {
            case 1 -> recipeChoice = "northIndian";
            case 2 -> recipeChoice = "southIndian";
            case 3 -> recipeChoice = "chinese";
            default -> {
                System.out.println("Invalid choice. Exiting...");
                System.exit(0);
            }
        }
        Recipe myRecipe = (Recipe) context.getBean(recipeChoice);
        // Ingredient Selection
        System.out.println("Select Ingredient:\n1. Lentils\n2. Rice\n3. Wheat");
        int ingredientTypeChoice = scanner.nextInt();
        String myIngredient = null;

        switch (ingredientTypeChoice) {
            case 1 -> myIngredient ="lentils";
            case 2 -> myIngredient = "rice";
            case 3 -> myIngredient = "wheat";
            default -> {
                System.out.println("Invalid choice. Exiting...");
                System.exit(0);
            }
        }

        myRecipe.setIngredients(myIngredient);
        myRecipe.setUserName(name);
        myRecipe.getDetails();
        context.close();
        scanner.close();
	}
	
}

