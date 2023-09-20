package com.example.TastyTrove;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. Override all the interface methods.
 * 2. Implement constructor initialise all lists with ingredients of your choice
 */

public class Wheat implements Ingredients {
    private boolean isChinese = false;
    private boolean isNorthIndian = false;
    private boolean isSouthIndian = false;

    private List<String> chineseWheatRecipe = new ArrayList<String>();
    private List<String> northIndianWheatRecipe = new ArrayList<String>();
    private List<String> southIndianWheatRecipe = new ArrayList<String>();


    public Wheat(){
        chineseWheatRecipe.add("Yeast");
        chineseWheatRecipe.add("Sugar");
        chineseWheatRecipe.add("Salt");
        chineseWheatRecipe.add("Water");
        chineseWheatRecipe.add("Oil");

        northIndianWheatRecipe.add("Ghee");
        northIndianWheatRecipe.add("Salt");
        northIndianWheatRecipe.add("Water");
        northIndianWheatRecipe.add("Oil");

        southIndianWheatRecipe.add("Ghee");
        southIndianWheatRecipe.add("Salt");
        southIndianWheatRecipe.add("Water");
        southIndianWheatRecipe.add("Oil");

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
            //dishDetail.append("Hello user, we suggest you to make Chinese Wheat Recipe. You can use the following ingredients:\n");
            List<String> chineseIngredients = chineseWheatRecipe;
            for(String ingredient: chineseIngredients){
                dishDetail.append(ingredient + "\n");
            }
            return dishDetail.toString();
        }
        else if(isNorthIndian){
            //dishDetail.append("Hello user, we suggest you to make North Indian Wheat Recipe. You can use the following ingredients:\n");
            List<String> northIndianIngredients = northIndianWheatRecipe;
            for(String ingredient: northIndianIngredients){
                dishDetail.append(ingredient + "\n");
            }
            return dishDetail.toString();
        }
        else if(isSouthIndian){
            //dishDetail.append("Hello user, we suggest you to make South Indian Wheat Recipe. You can use the following ingredients:\n");
            List<String> southIndianIngredients = southIndianWheatRecipe;
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
            return chineseWheatRecipe;
        }
        else if(isNorthIndian){
            return northIndianWheatRecipe;
        }
        else if(isSouthIndian){
            return southIndianWheatRecipe;
        }
        else{
            return null;
        }
    }
}
