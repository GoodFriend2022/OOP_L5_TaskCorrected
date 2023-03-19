import java.util.ArrayList;
import java.util.Scanner;

public class ComplexNumber extends Number implements Diff, Div, Sum, Mult {

    public ComplexNumber() {
        super();
    }

    @Override
    protected String userNumber() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число комплексного числа: ");
        boolean flag1 = iScanner.hasNextDouble();
        if (!flag1) {
            System.out.println("Это было не число");
            return "";
        }
        String number1 = iScanner.nextLine();
        number1 = number1.replace(",", ".");
        System.out.printf("Введите второе число комплесного числа: ");
        boolean flag2 = iScanner.hasNextDouble();
        if (!flag2) {
            System.out.println("Это было не число");
            return "";
        }
        String number2 = iScanner.nextLine();
        number2 = number2.replace(",", ".");
        // iScanner.close();
        return number1 + " + " + number2 + " i";
    }

    private ArrayList<Double> toArray(String number) {
        String[] array = number.split(" ");
        ArrayList<Double> complex = new ArrayList<>();
        complex.add(Double.parseDouble(array[0]));
        complex.add(Double.parseDouble(array[2]));
        return complex;
    }

    @Override
    public String mult(Number number2) {
        ArrayList<Double> n1 = toArray(super.number);
        ArrayList<Double> n2 = toArray(number2.getNumber());
        if (n1.get(0) == n2.get(0) && n1.get(1) == -n2.get(1)) {
            return String.format("%.2f", n1.get(0) * n1.get(0) + n1.get(1) * n1.get(1));
        }
        ArrayList<Double> result = new ArrayList<>();
        result.add(n1.get(0) * n2.get(0) - n1.get(1) * n2.get(1));
        result.add(n1.get(0) * n2.get(1) + n1.get(1) * n2.get(0));
        if (result.get(0) == 0) {
            return String.format("%.2fi", result.get(1));
        } else if (result.get(1) == 0) {
            return String.format("%.2f", result.get(0));
        }
        return String.format("%.2f + %.2fi", result.get(0), result.get(1));
    }

    @Override
    public String sum(Number number2) {
        ArrayList<Double> n1 = toArray(super.number);
        ArrayList<Double> n2 = toArray(number2.getNumber());
        if (n1.get(1) == -n2.get(1)) {
            return String.format("%.2f", n1.get(0) + n2.get(0));
        }
        ArrayList<Double> result = new ArrayList<>();
        result.add(n1.get(0) + n2.get(0));
        result.add(n1.get(1) + n2.get(1));
        if (result.get(0) == 0) {
            return String.format("%.2fi", result.get(1));
        } else if (result.get(1) == 0) {
            return String.format("%.2f", result.get(0));
        }
        return String.format("%.2f + %.2fi", result.get(0), result.get(1));
    }

    @Override
    public String div(Number number2) {
        ArrayList<Double> n1 = toArray(super.number);
        ArrayList<Double> n2 = toArray(number2.getNumber());
        if (n2.get(0) == 0 && n2.get(1) == 0) {
            return "Деление на ноль";
        }
        ArrayList<Double> result = new ArrayList<>();
        result.add(n1.get(0) * n2.get(0) - n1.get(1) * -n2.get(1));
        result.add(n1.get(0) * -n2.get(1) + n1.get(1) * n2.get(0));
        result.add(n1.get(0) * n1.get(0) + n1.get(1) * n1.get(1));
        result.add(result.get(0) / result.get(2));
        result.add(result.get(1) / result.get(2));
        if (result.get(3) == 0) {
            return String.format("%.2fi", result.get(4));
        } else if (result.get(4) == 0) {
            return String.format("%.2f", result.get(3));
        }
        return String.format("%.2f + %.2fi", result.get(3), result.get(4));
    }

    @Override
    public String diff(Number number2) {
        ArrayList<Double> n1 = toArray(super.number);
        ArrayList<Double> n2 = toArray(number2.getNumber());
        if (n1.get(1) == n2.get(1)) {
            return String.format("%.2f", n1.get(0) - n2.get(0));
        }
        ArrayList<Double> result = new ArrayList<>();
        result.add(n1.get(0) - n2.get(0));
        result.add(n1.get(1) - n2.get(1));
        if (result.get(0) == 0) {
            return String.format("%.2fi", result.get(1));
        } else if (result.get(1) == 0) {
            return String.format("%.2f", result.get(0));
        }
        return String.format("%.2f + %.2fi", result.get(0), result.get(1));
    }
}
