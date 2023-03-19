public class Calculator extends Menu {
    public void calculator() {
        int select1 = super.startMenu();
        if (select1 == 1) {
            int select2 = super.programMenu();
            if (select2 == -1) return;
            RationalNumber a = new RationalNumber();
            if (a.getNumber() == "") return;
            RationalNumber b = new RationalNumber();
            if (b.getNumber() == "") return;
            if (select2 == 1) { System.out.printf("%s + %s = %s", a.toString(), b.toString(), a.sum(b)); }
            else if (select2 == 2) { System.out.printf("%s - %s = %s", a.toString(), b.toString(), a.diff(b)); }
            else if (select2 == 3) { System.out.printf("%s * %s = %s", a.toString(), b.toString(), a.mult(b)); }
            else if (select2 == 4) { System.out.printf("%s / %s = %s", a.toString(), b.toString(), a.div(b)); }
        } else if (select1 == 2) {
            int select2 = super.programMenu();
            if (select2 == -1) return;
            ComplexNumber a = new ComplexNumber();
            if (a.getNumber() == "") return;
            ComplexNumber b = new ComplexNumber();   
            if (b.getNumber() == "") return;
            if (select2 == 1) { System.out.printf("(%s) + (%s) = %s", a.toString(), b.toString(), a.sum(b)); }
            else if (select2 == 2) { System.out.printf("(%s) - (%s) = %s", a.toString(), b.toString(), a.diff(b)); }
            else if (select2 == 3) { System.out.printf("(%s) * (%s) = %s", a.toString(), b.toString(), a.mult(b)); }
            else if (select2 == 4) { System.out.printf("(%s) / (%s) = %s", a.toString(), b.toString(), a.div(b)); }
        }
    }
}