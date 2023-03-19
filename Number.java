import java.util.Scanner;

public abstract class Number {

    protected String number;
    
    public String getNumber() {
        return number;
    }

    protected String userNumber() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        String number = iScanner.nextLine();
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
