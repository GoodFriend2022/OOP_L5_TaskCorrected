import java.util.Scanner;

public abstract class Number {

    protected String number;
    
    public String getNumber() {
        return number;
    }

    protected String userNumber() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        boolean flag = iScanner.hasNextDouble();
        if (!flag) {
            System.out.println("Это было не число");
            return "";
        }
        String number = iScanner.nextLine();
        number = number.replace(",", ".");
        // iScanner.close();
        return number;
    }

    protected Number() {
        this.number = userNumber();
    }

    @Override
    public String toString() {
        return String.format("%s", this.number);
    }
}
