package a.syrov;

import java.util.Scanner;

public class SaleMenu {

    private Scanner scanner;

    public SaleMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void show() {
        while (true) {
            System.out.println("\n=== Продажа коктейля ===");
            System.out.println("1. Мохито");
            System.out.println("2. Лонг айленд");
            System.out.println("3. Пина колада");
            System.out.println("4. Сангрия");
            System.out.println("5. Черный русский");
            System.out.println("0. Назад");
            System.out.print("Выберите пункт: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Выбрано Мохито");
                    break;
                case 2:
                    System.out.println("Выбран Лонг айленд");
                    break;
                case 3:
                    System.out.println("Выбрана Пина колада");
                    break;
                case 4:
                    System.out.println("Выбрана Сангрия");
                    break;
                case 5:
                    System.out.println("Выбран Черный русский");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный ввод!");
            }
        }
    }
}


