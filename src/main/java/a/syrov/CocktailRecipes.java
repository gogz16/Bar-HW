package a.syrov;

import java.util.HashMap;
import java.util.Map;

public class CocktailRecipes {
    public String recipeName;
    public Map<String, Double> recipeIngredients;

    public CocktailRecipes(String recipeName){
        this.recipeName = recipeName;
        this.recipeIngredients = new HashMap<>();
    }

    public void addRecipeIngredient (String ingredientName, double ingredientQuantity) {
        recipeIngredients.put(ingredientName,ingredientQuantity);
    }







}
