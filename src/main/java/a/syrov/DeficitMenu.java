package a.syrov;

import java.util.Scanner;

public class DeficitMenu {

    private Scanner scanner;

    public DeficitMenu(Scanner scanner) {
        this.scanner = scanner;
    }

//    public void deficitMenu() {
//        this.scanner = new Scanner(System.in);
//    }

    public void show() {
        while (true) {
            System.out.println("\n=== Отчёт о дефиците ===");
            System.out.println("1. Показать дефицит ингредиентов");
            System.out.println("0. Назад");
            System.out.print("Выберите пункт: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Выполняется Опция Показа дефицита ингредиентов");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный ввод!");
            }
        }
    }
}


