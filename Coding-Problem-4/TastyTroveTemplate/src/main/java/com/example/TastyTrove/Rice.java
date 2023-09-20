package com.example.TastyTrove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 1. Override all the interface methods.
 * 2. Implement constructor initialise all lists with ingredients of your choice
 */


public class Rice implements Ingredients {
    private boolean isChinese;
    private boolean isNorthIndian;
    private boolean isSouthIndian;

    private List<String> chineseRiceRecipes = new ArrayList<String>();
    private List<String> northIndianRiceRecipes = new ArrayList<String>();
    private List<String> southIndianRiceRecipes = new ArrayList<String>();

    public Rice() {
        
        chineseRiceRecipes.add("Steamed Rice");
        chineseRiceRecipes.add("Ginger");
        chineseRiceRecipes.add("Garlic");
        chineseRiceRecipes.add("Soy Sauce");
        chineseRiceRecipes.add("Vinegar");

        northIndianRiceRecipes.add("Basmati Rice");
        northIndianRiceRecipes.add("Ghee");
        northIndianRiceRecipes.add("Cumin Seeds");
        northIndianRiceRecipes.add("Cashews");
        northIndianRiceRecipes.add("Garam Masala");

        southIndianRiceRecipes.add("Rice");
        southIndianRiceRecipes.add("Urad Dal");
        southIndianRiceRecipes.add("Chana Dal");
        southIndianRiceRecipes.add("Mustard Seeds");
        southIndianRiceRecipes.add("Curry Leaves");
    }

    public void setIngredient(String ingredient){
        if(ingredient.equals("chinese")){
            this.isChinese = true;
        }
        else if(ingredient.equals("northIndian")){
            this.isNorthIndian = true;
        }
        else if(ingredient.equals("southIndian")){
            this.isSouthIndian = true;
        }
    }
    
    @Override
    public String getDishDetail() {
        StringBuilder dishDetail = new StringBuilder();
        if (isChinese) {
            //dishDetail.append("Hello user, we suggest you to make Chinese Fried Rice. You can use the following ingredients:\n");
            List<String> chineseIngredients = chineseRiceRecipes;
            for (int i = 0; i < chineseIngredients.size(); i++) {
                dishDetail.append(i + 1).append(". ").append(chineseIngredients.get(i));
                if (i < chineseIngredients.size() - 1) {
                    dishDetail.append("\n");
                }
            }
        } else if (isNorthIndian) {
            //dishDetail.append("Hello user, we suggest you to make North Indian Rice Dish. You can use the following ingredients:\n");
            List<String> northIndianIngredients = northIndianRiceRecipes;
            for (int i = 0; i < northIndianIngredients.size(); i++) {
                dishDetail.append(i + 1).append(". ").append(northIndianIngredients.get(i));
                if (i < northIndianIngredients.size() - 1) {
                    dishDetail.append("\n");
                }
            }
        } else if (isSouthIndian) {
            //dishDetail.append("Hello user, we suggest you to make South Indian Rice Dish. You can use the following ingredients:\n");
            List<String> southIndianIngredients = southIndianRiceRecipes;
            for (int i = 0; i < southIndianIngredients.size(); i++) {
                dishDetail.append(i + 1).append(". ").append(southIndianIngredients.get(i));
                if (i < southIndianIngredients.size() - 1) {
                    dishDetail.append("\n");
                }
            }
        } else {
            dishDetail.append("Default Rice Dish");
        }
    
        return dishDetail.toString();
    }
    

    public List<String> getIngredientsDetail(){
        if(isChinese){
            return chineseRiceRecipes;
        }
        else if(isNorthIndian){
            return northIndianRiceRecipes;
        }
        else if(isSouthIndian){
            return southIndianRiceRecipes;
        }
        else{
            return null;
        }
    }

}
