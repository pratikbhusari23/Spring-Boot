package com.example.TastyTrove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rice implements Ingredients {
    private boolean isChinese;
    private boolean isNorthIndian;
    private boolean isSouthIndian;

    private List<String> chineseRiceRecipes = new ArrayList<>();
    private List<String> northIndianRiceRecipes = new ArrayList<>();
    private List<String> southIndianRiceRecipes = new ArrayList<>();

    public Rice() {
        
        Collections.addAll(chineseRiceRecipes, "Steamed Rice", "Ginger", "Garlic", "Soy Sauce", "Vinegar");
        Collections.addAll(northIndianRiceRecipes, "Basmati Rice", "Ghee", "Cumin Seeds", "Cashews", "Garam Masala");
        Collections.addAll(southIndianRiceRecipes, "Rice", "Urad Dal", "Chana Dal", "Mustard Seeds", "Curry Leaves");
    }
    
    public void setIngredient(String ingredient) {
        this.isChinese = ingredient.equalsIgnoreCase("chinese");
        this.isNorthIndian = ingredient.equalsIgnoreCase("northIndian");
        this.isSouthIndian = ingredient.equalsIgnoreCase("southIndian");
    }

    @Override
    public String getDishDetail() {
        if (isChinese) {
            return "Chinese Fried Rice";
        } else if (isNorthIndian) {
            return "North Indian Rice Dish";
        } else {
            return "South Indian Rice Dish";
        }
    }
    

    public List<String> getIngredientsDetail(){

        if(isChinese){
            return chineseRiceRecipes;
        }
        else if(isNorthIndian){
            return northIndianRiceRecipes;
        }
        else {
            return southIndianRiceRecipes;
        }
    
    }

}