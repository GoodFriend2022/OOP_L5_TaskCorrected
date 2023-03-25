import java.util.Scanner;

public class RationalNumber extends Number implements InputNumber, Sum, Mult, Diff, Div {

    
    public RationalNumber() {
        super();
    }
    
    protected RationalNumber invers(Number number) {
        String num = number.getNumber();
        if (num.startsWith("-")) {
            num.replace("-", "");
        } else {
            num = "-" + num;
        }
        RationalNumber newNumber = new RationalNumber();
        newNumber.setNumber(num);
        return newNumber;
    }

    @Override
    public void userNumber() {
        super.setModel("рациональное число");
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите %s: ", super.model);
        String number = iScanner.nextLine();
        number = number.replace(",", ".");
        try {
            Double.parseDouble(number);
            super.setNumber(number);
        } catch (Exception e) {
            System.out.println("Это не число");
            iScanner.close();
        } 
    }
    
    @Override
    public Number diff(Number number1, Number number2) {
        super.num = new RationalNumber();
        Double n1 = Double.parseDouble(number1.toString());
        Double n2 = Double.parseDouble(number2.toString());
        Double result = n1 - n2;
        super.num.setNumber(result.toString());
        return super.num;
    }
    
    @Override
    public Number mult(Number number1, Number number2) {
        super.num = new RationalNumber();
        Double n1 = Double.parseDouble(number1.toString());
        Double n2 = Double.parseDouble(number2.toString());
        Double result = n1 * n2;
        super.num.setNumber(result.toString());
        return super.num;
    }
    
    @Override
    public Number sum(Number number1, Number number2) {
        super.num = new RationalNumber();
        Double n1 = Double.parseDouble(number1.toString());
        Double n2 = Double.parseDouble(number2.toString());
        Double result = n1 + n2;
        super.num.setNumber(result.toString());
        return super.num;
    }

    @Override
    public Number div(Number number1, Number number2) {
        super.num = new RationalNumber();
        Double n1 = Double.parseDouble(number1.toString());
        Double n2 = Double.parseDouble(number2.toString());
        Double result = n1 / n2;
        super.num.setNumber(result.toString());
        return super.num;
    }
    
    @Override
    public Number sum(Number number) {
        return this.sum(number, number);
    }

    @Override
    public Number mult(Number number) {
        return this.mult(number, number);
    }

    @Override
    public Number diff(Number number) {
        return this.diff(number, number);
    }

    @Override
    public Number div(Number number) {
        return this.div(number, number);
    }
}
