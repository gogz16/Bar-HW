package a.syrov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<CocktailRecipes> allCocktails = new ArrayList<>();

        CocktailRecipes mojito = new CocktailRecipes("Мохито");
        mojito.addRecipeIngredient("Ром", 50);
        mojito.addRecipeIngredient("Сок лайма", 10);
        mojito.addRecipeIngredient("Мята", 1);
        mojito.addRecipeIngredient("Газировка",150);
        allCocktails.add(mojito);

        CocktailRecipes blackRussian = new CocktailRecipes("Чёрный русский");
        blackRussian.addRecipeIngredient("Ром", 20);
        blackRussian.addRecipeIngredient("Ликер кофейный", 25);
        blackRussian.addRecipeIngredient("Водка", 20);
        blackRussian.addRecipeIngredient("Газировка",150);
        allCocktails.add(blackRussian);

        MainMenu mainMenu = new MainMenu(scanner, allCocktails);
        mainMenu.show();

        scanner.close();

    }
}
