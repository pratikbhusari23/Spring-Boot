package com.example.TastyTrove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 1. Override all the interface methods.
 * 2. Implement constructor initialise all lists with ingredients of your choice
 */


public class Lentils implements Ingredients {
    private boolean isChinese;
    private boolean isNorthIndian;
    private boolean isSouthIndian;

    private List<String> chineseLentilsRecipes = new ArrayList<>();
    private List<String> northIndianLentilsRecipes = new ArrayList<>();
    private List<String> southIndianLentilsRecipes = new ArrayList<>();

    public Lentils(){

        Collections.addAll(chineseLentilsRecipes,"peas", "carrots", "onions", "garlic", "ginger");
        Collections.addAll(northIndianLentilsRecipes, "tomatoes", "onions", "garlic", "ginger", "garam masala");
        Collections.addAll(southIndianLentilsRecipes, "tomatoes", "onions", "garlic", "ginger", "garam masala");
    }

    public void setIngredient(String ingredient){
        this.isChinese = ingredient.equals("chinese");
        this.isNorthIndian = ingredient.equals("northIndian");
        this.isSouthIndian = ingredient.equals("southIndian");
    }

    public String getDishDetail() {
        if (isChinese) {
            return "Kung Pao Lentils";
        } else if (isNorthIndian) {
            return "Dal Makhani";
        } else {
            return "Sambar";
        } 
    }

    public List<String> getIngredientsDetail(){

        if(isChinese){
            return chineseLentilsRecipes;
        }
        else if(isNorthIndian){
            return northIndianLentilsRecipes;
        }
        else {
            return southIndianLentilsRecipes;
        }
    }

}
