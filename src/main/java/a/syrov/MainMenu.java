package a.syrov;

import java.util.List;
import java.util.Scanner;

public class MainMenu {
    private final Scanner scanner;
    private final List<CocktailRecipes> allCocktails;

    public MainMenu(Scanner scanner, List<CocktailRecipes> allCocktails) {
        this.scanner = scanner;
        this.allCocktails = allCocktails;
    }

    public void show() {
        while (true) {
            System.out.println("\n=== Главное меню ===");
            System.out.println("1. Работа с коктейлями");
            System.out.println("2. Управление запасами");
            System.out.println("3. Продажа коктейля");
            System.out.println("4. Отчёт о дефиците");
            System.out.println("0. Выход из программы");
            System.out.print("Выберите пункт: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    RecipesMenu recipesMenu = new RecipesMenu(scanner, allCocktails);
                    recipesMenu.show();
                    break;
                case 2:
                    StockMenu stockMenu = new StockMenu(scanner);
                    stockMenu.show();
                    break;
                case 3:
                    SaleMenu saleMenu = new SaleMenu(scanner);
                    saleMenu.show();
                    break;
                case 4:
                    DeficitMenu deficitMenu = new DeficitMenu(scanner);
                    deficitMenu.show();
                    break;
                case 0:
                    System.out.println("Выход из программы...");
                    return;
                default:
                    System.out.println("\nВыбран некорректный пункт меню! Попробуйте еще раз!");
            }
        }
    }
}
