package com.example.TastyTrove;

import java.util.List;

/*
 * 1. Add class attributes.
 * 2. Override all the interface methods.
 * 3. Implement setter injection
 */

public class Chinese implements Recipe {

    private String userName;
    private String name;
    Ingredients ingredients;

    public Chinese(){

    }
    public void getDetails() {
        System.out.println("Hello user " + userName + " we suggest you to make " + ingredients.getDishDetail() + " you can use the following ingredients:");

        List<String> ingredientsList = ingredients.getIngredientsDetail();
        for(int i=0 ;i<ingredientsList.size();i++){
            System.out.println((i+1)+". "+ingredientsList.get(i));
        }
    }

    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }
}

