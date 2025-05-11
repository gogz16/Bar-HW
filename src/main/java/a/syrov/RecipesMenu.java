package a.syrov;

import java.util.List;
import java.util.Scanner;

public class RecipesMenu {

    private Scanner scanner;
    private List<CocktailRecipes> allCocktails;

    public RecipesMenu(Scanner scanner, List<CocktailRecipes> allCocktails) {
        this.scanner = scanner;
        this.allCocktails = allCocktails;
    }

    public void show() {
        while (true) {
            System.out.println("\n=== Работа с коктейлями ===");
            System.out.println("1. Добавление нового рецепта");
            System.out.println("2. Просмотр всех рецептов");
            System.out.println("3. Поиск рецепта по названию");
            System.out.println("0. Назад");
            System.out.print("Выберите пункт: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Выполняется Опция 'Добавление нового рецепта'");
                    break;
                case 2:
                    System.out.println("Выполняется Опция 'Просмотр всех рецептов'");
                    showAllRecipes();
                    break;
                case 3:
                    System.out.println("Выполняется Опция 'Поиск рецепта по названию'");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("\nВыбран некорректный пункт меню! Попробуйте еще раз!");
            }
        }
    }

    // Метод для вывода всех рецептов
    private void showAllRecipes() {
        System.out.println("\nВыполняется Опция 'Просмотр всех рецептов'");
        if (allCocktails.isEmpty()) {
            System.out.println("Рецептов пока нет!");
            return;
        }

        for (CocktailRecipes cocktail : allCocktails) {
            System.out.println(cocktail);  // Используем toString()
        }
    }
}


