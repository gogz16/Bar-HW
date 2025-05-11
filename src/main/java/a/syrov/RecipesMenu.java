package a.syrov;

import java.util.Scanner;

public class RecipesMenu {

    private Scanner scanner;

    public RecipesMenu(Scanner scanner) {
        this.scanner = scanner;
    }

//    public void recipesMenu() {
//        this.scanner = new Scanner(System.in);
//    }

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
}


