import java.util.ArrayList;
import java.util.Scanner;

public class ComplexNumber extends RationalNumber {

    public ComplexNumber() {
        super();
    }

    @Override
    public void userNumber() {
        super.setModel("первое число комплексного числа");
        super.userNumber();
        String num1 = super.number;
        super.setModel("второе число комплексного числа");
        super.userNumber();
        String num2 = super.number;
        super.setNumber(num1 + " + " + num2 + " i");
    }

    private ArrayList<Double> toArray(String number) {

        
        String[] array = number.split(" ");
        ArrayList<Double> complex = new ArrayList<>();
        complex.add(Double.parseDouble(array[0]));
        complex.add(Double.parseDouble(array[2]));
        return complex;
    }
A
    @Override
    public Number mult(Number number1, Number number2) {
        super.n = new ComplexNumber();
        ArrayList<Double> n1 = toArray(number1.getNumber());
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
    public Number sum(Number number1, Number number2) {
        super.n = new ComplexNumber();
        ArrayList<Double> n1 = toArray(number1.getNumber());
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
    public Number div(Number number1, Number number2) {
        super.n = new ComplexNumber();
        ArrayList<Double> n1 = toArray(number1.getNumber());
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
    public Number diff(Number number1, Number number2) {
        super.n = new ComplexNumber();
        ArrayList<Double> n1 = toArray(number1.getNumber());
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
