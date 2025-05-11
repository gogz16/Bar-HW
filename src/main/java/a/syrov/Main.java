package a.syrov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainMenu mainMenu = new MainMenu(scanner);
        mainMenu.show();
        scanner.close();

        CocktailRecipes mojito = new CocktailRecipes("Мохито");
        mojito.addRecipeIngredient("Ром", 50);
        mojito.addRecipeIngredient("Сок лайма", 10);
        mojito.addRecipeIngredient("Мята", 1);
        mojito.addRecipeIngredient("Газировка",150);

    }
}
