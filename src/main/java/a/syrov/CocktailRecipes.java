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

    public String getName(){ //Надо ли? Пока пусть будет
        return recipeName;
    }

    public Map<String, Double> getIngredients() {
        return new HashMap<>(recipeIngredients);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Коктейль: ")
                .append(recipeName)
                .append("\nИнгредиенты:\n");
        for (Map.Entry<String, Double> entry : recipeIngredients.entrySet()) {
            sb.append("- ")
                    .append(entry.getKey())
                    .append(": ")
                    .append(entry.getValue())
                    .append(" мл/гр\n");
        }
        return sb.toString();
    }

}
