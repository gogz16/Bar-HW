package a.syrov;

import java.util.Scanner;

public class StockMenu {

    private Scanner scanner;

    public StockMenu(Scanner scanner) {
        this.scanner = scanner;
    }

//    public void stockMenu() {
//        this.scanner = new Scanner(System.in);
//    }

    public void show() {
        while (true) {
            System.out.println("\n=== Управление запасами ===");
            System.out.println("1. Просмотр текущих остатков");
            System.out.println("2. Добавление поставок ингредиентов");
            System.out.println("0. Назад");
            System.out.print("Выберите пункт: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Выполняется Опция 'Просмотр текущих остатков'");
                    break;
                case 2:
                    System.out.println("Выполняется Опция 'Добавление поставок ингредиентов'");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный ввод!");
            }
        }
    }
}


