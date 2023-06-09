import java.util.ArrayList;

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

    private ArrayList<RationalNumber> toArray(Number number) {
        String[] array = number.getNumber().split(" ");
        ArrayList<RationalNumber> complex = new ArrayList<>();
        RationalNumber num1 = new RationalNumber();
        RationalNumber num2 = new RationalNumber();
        num1.setNumber(array[0]);
        complex.add(num1);
        num2.setNumber(array[2]);
        complex.add(num2);
        System.out.println(complex);
        return complex;
    }

    @Override
    public Number mult(Number number1, Number number2) {
        super.num = new ComplexNumber();
        ArrayList<RationalNumber> n = toArray(number1);
        n.addAll(toArray(number2));
        n.add(super.invers(n.get(3)));
        if (n.get(0).equals(n.get(2).getNumber()) && 
                n.get(1).equals(n.get(4).getNumber())) {
            super.num = super.sum(super.mult(n.get(0), super.mult(n.get(1))));
            return num;
        }
        ArrayList<Number> result = new ArrayList<>();
        result.add(super.diff(super.mult(n.get(0), n.get(2)), super.mult(n.get(1), n.get(3))));
        result.add(super.sum(super.mult(n.get(0), n.get(3)), super.mult(n.get(1), n.get(2))));
        if (result.get(0).equals("0.0")) {
            super.num.setNumber(String.format("%s i", result.get(1).toString()));
        } else if (result.get(1).equals("0.0")) {
            super.num.setNumber(String.format("%s", result.get(0).toString()));
        } else super.num.setNumber(String.format("%s + %s i", result.get(0).toString(), result.get(1).toString()));
        return super.num;
    }

    @Override
    public Number sum(Number number1, Number number2) {
        super.num = new ComplexNumber();
        ArrayList<RationalNumber> n = toArray(number1);
        n.addAll(toArray(number2));
        n.add(super.invers(n.get(3)));
        if (n.get(1).equals(n.get(4).getNumber())) {
            super.num = super.sum(n.get(0), n.get(2));
            return super.num;
        }
        ArrayList<Number> result = new ArrayList<>();
        result.add(super.sum(n.get(0), n.get(2)));
        result.add(super.sum(n.get(1), n.get(3)));
        if (result.get(0).equals("0.0")) {
            super.num.setNumber(String.format("%s i", result.get(1).toString()));
        } else if (result.get(1).equals("0.0")) {
            super.num.setNumber(String.format("%s", result.get(0).toString()));
        } else super.num.setNumber(String.format("%s + %s i", result.get(0).toString(), result.get(1).toString()));
        return super.num;
    }

    @Override
    public Number div(Number number1, Number number2) {
        super.num = new ComplexNumber();
        ArrayList<RationalNumber> n = toArray(number1);
        n.addAll(toArray(number2));
        n.add(super.invers(n.get(3)));
        if (n.get(2).equals("0.0") && n.get(3).equals("0.0")) {
            System.out.println("Деление на ноль");
            return num;
        }
        ArrayList<Number> result = new ArrayList<>();
        result.add(super.diff(super.mult(n.get(0), n.get(2)), super.mult(n.get(1), n.get(4))));
        result.add(super.sum(super.mult(n.get(0), n.get(4)), super.mult(n.get(1), n.get(2))));
        result.add(super.sum(super.mult(n.get(0)), super.mult(n.get(1))));
        result.add(super.div(result.get(0), result.get(2)));
        result.add(super.div(result.get(1), result.get(2)));
        if (result.get(3).equals("0.0")) {
            super.num.setNumber(String.format("%s i", result.get(4).toString()));
        } else if (result.get(4).equals("0.0")) {
            super.num.setNumber(String.format("%s", result.get(3).toString()));
        } else super.num.setNumber(String.format("%s + %s i", result.get(3).toString(), result.get(4).toString()));
        return super.num;
    }

    @Override
    public Number diff(Number number1, Number number2) {
        super.num = new ComplexNumber();
        ArrayList<RationalNumber> n = toArray(number1);
        n.addAll(toArray(number2));
        if (n.get(1).equals(n.get(3).getNumber())) {
            super.num = super.diff(n.get(0), n.get(2));
            return super.num;
        }
        ArrayList<Number> result = new ArrayList<>();
        result.add(super.diff(n.get(0), n.get(2)));
        result.add(super.diff(n.get(1), n.get(3)));
        if (result.get(0).equals("0.0")) {
            super.num.setNumber(String.format("%s i", result.get(1).toString()));
        } else if (result.get(1).equals("0.0")) {
            super.num.setNumber(String.format("%s", result.get(0).toString()));
        } else super.num.setNumber(String.format("%s + %s i", result.get(0).toString(), result.get(1).toString()));
        return super.num;
    }

    @Override
    public String toString() {
        return String.format("(%s)", this.number);
    }
}
