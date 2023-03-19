public class RationalNumber extends Number implements Sum, Mult, Diff, Div {

    public RationalNumber() {
        super();
    }
    
    @Override
    public String diff(Number number2) {
        Double n1 = Double.parseDouble(super.number);
        Double n2 = Double.parseDouble(number2.toString());
        Double result = n1 - n2;
        return String.format("%.2f", result);
    }

    @Override
    public String mult(Number number2) {
        Double n1 = Double.parseDouble(super.number);
        Double n2 = Double.parseDouble(number2.toString());
        Double result = n1 * n2;
        return String.format("%.2f", result);
    }

    @Override
    public String sum(Number number2) {
        Double n1 = Double.parseDouble(super.number);
        Double n2 = Double.parseDouble(number2.toString());
        Double result = n1 + n2;
        return String.format("%.2f", result);
    }

    @Override
    public String div(Number number2) {
        Double n1 = Double.parseDouble(super.number);
        Double n2 = Double.parseDouble(number2.toString());
        Double result = n1 / n2;
        return String.format("%.2f", result);
    }

}
