package com.example.TastyTrove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("wheat")
public class Wheat implements Ingredients {
    private boolean isChinese;
    private boolean isNorthIndian;
    private boolean isSouthIndian;

    private List<String> chineseWheatRecipe = new ArrayList<>();
    private List<String> northIndianWheatRecipe = new ArrayList<>();
    private List<String> southIndianWheatRecipe = new ArrayList<>();

    public Wheat() {
        
        Collections.addAll(chineseWheatRecipe, "Yeast", "Sugar", "Salt", "Water", "Oil");
        Collections.addAll(northIndianWheatRecipe, "Ghee", "Salt", "Water", "Oil");
        Collections.addAll(southIndianWheatRecipe, "Ghee", "Salt", "Water", "Oil");
    }

    public void setIngredient(String ingredient){
        this.isChinese = ingredient.equalsIgnoreCase("chinese");
        this.isNorthIndian = ingredient.equalsIgnoreCase("northIndian");
        this.isSouthIndian = ingredient.equalsIgnoreCase("southIndian");
    }

    public String getDishDetail(){
        if(isChinese){
            return "Chinese Wheat Recipe";
        }
        else if(isNorthIndian){
            return "North Indian Wheat Recipe";
        }
        else {
            return "South Indian Wheat Recipe";
        }
    }

    public List<String> getIngredientsDetail(){
        if(isChinese){
            return chineseWheatRecipe;
        }
        else if(isNorthIndian){
            return northIndianWheatRecipe;
        }
        else {
            return southIndianWheatRecipe;
        }
    }
}