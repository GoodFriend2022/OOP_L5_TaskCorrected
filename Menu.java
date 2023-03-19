import java.util.Scanner;

public abstract class Menu {
    private String menu1 = "Выберите с какими числами Вы хотите работать?\n" + 
        "1. Рациональные.\n2. Комплексные.\n";
    private String menu2 = "Выберите какое действие Вы хотите произвести с числами?\n" +
        "1. Сложение.\n2. Вычитание.\n3. Умножение.\n4. Деление.\n";

    protected int startMenu() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(this.menu1);
        boolean flag = iScanner.hasNextInt();
        if (!flag) {
            System.out.println("Такого значения нет в меню");
            return -1;
        }
        int number = iScanner.nextInt();
        if (number > 2 || number < 1) {
            System.out.println("Такого значения нет в меню");
            return -1;
        }
        // iScanner.close();
        return number;
    }

    protected int programMenu() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(this.menu2);
        boolean flag = iScanner.hasNextInt();
        if (!flag) {
            System.out.println("Такого значения нет в меню");
            return -1;
        }
        int number = iScanner.nextInt();
        if (number > 4 || number < 1) {
            System.out.println("Такого значения нет в меню");
            return -1;
        }
        // iScanner.close();
        return number;
    }
}
