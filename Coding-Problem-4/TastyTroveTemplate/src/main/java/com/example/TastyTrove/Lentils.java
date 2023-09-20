package com.example.TastyTrove;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. Override all the interface methods.
 * 2. Implement constructor initialise all lists with ingredients of your choice
 */


public class Lentils implements Ingredients {
    private boolean isChinese;
    private boolean isNorthIndian;
    private boolean isSouthIndian;

    private List<String> chineseLentilsRecipes = new ArrayList<String>();
    private List<String> northIndianLentilsRecipes = new ArrayList<String>();
    private List<String> southIndianLentilsRecipes = new ArrayList<String>();

    
    public Lentils(){
        chineseLentilsRecipes.add("peas");
        chineseLentilsRecipes.add("carrots");
        chineseLentilsRecipes.add("onions");
        chineseLentilsRecipes.add("garlic");
        chineseLentilsRecipes.add("ginger");

        northIndianLentilsRecipes.add("tomatoes");
        northIndianLentilsRecipes.add("onions");
        northIndianLentilsRecipes.add("garlic");
        northIndianLentilsRecipes.add("ginger");
        northIndianLentilsRecipes.add("garam masala");

        southIndianLentilsRecipes.add("tomatoes");
        southIndianLentilsRecipes.add("onions");
        southIndianLentilsRecipes.add("garlic");
        southIndianLentilsRecipes.add("ginger");
        southIndianLentilsRecipes.add("garam masala");

        public Lentils() {
        
            chineseLentilsRecipes.addAll(List.of("peas", "carrots", "onions", "garlic", "ginger"));
            
            northIndianLentilsRecipes.addAll(List.of("tomatoes", "onions", "garlic", "ginger", "garam masala"));
            
            southIndianLentilsRecipes.addAll(List.of("tomatoes", "onions", "garlic", "ginger", "garam masala"));
        }
    }
    public void setIngredient(String ingredient){
        if(ingredient.equals("chinese")){
            isChinese = true;
        }
        else if(ingredient.equals("northIndian")){
            isNorthIndian = true;
        }
        else if(ingredient.equals("southIndian")){
            isSouthIndian = true;
        }
    }

    public String getDishDetail(){
        StringBuilder dishDetail = new StringBuilder();
        if(isChinese){
            
            List<String> chineseIngredients = chineseLentilsRecipes;
            for(String ingredient: chineseIngredients){
                dishDetail.append(ingredient + "\n");
            }
            return dishDetail.toString();
        }
        else if(isNorthIndian){
            //dishDetail.append("Hello user, we suggest you to make North Indian Lentils. You can use the following ingredients:\n");
            List<String> northIndianIngredients = northIndianLentilsRecipes;
            for(String ingredient: northIndianIngredients){
                dishDetail.append(ingredient + "\n");
            }
            return dishDetail.toString();
        }
        else if(isSouthIndian){
            //dishDetail.append("Hello user, we suggest you to make South Indian Lentils. You can use the following ingredients:\n");
            List<String> southIndianIngredients = southIndianLentilsRecipes;
            for(String ingredient: southIndianIngredients){
                dishDetail.append(ingredient + "\n");
            }
            return dishDetail.toString();
        }
        else{
            return null;
        }
    }

    public List<String> getIngredientsDetail(){

        if(isChinese){
            return chineseLentilsRecipes;
        }
        else if(isNorthIndian){
            return northIndianLentilsRecipes;
        }
        else if(isSouthIndian){
            return southIndianLentilsRecipes;
        }
        else{
            return null;
        }
    }


}
