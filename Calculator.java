import java.util.ArrayList;

public class Calculator {
    
    private String startMenu = "Выберите с какими числами Вы хотите работать?\n" + 
    "1. Рациональные.\n2. Комплексные.\n";
    private String programMenu = "Выберите какое действие Вы хотите произвести с числами?\n" +
    "1. Сложение.\n2. Вычитание.\n3. Умножение.\n4. Деление.\n";
    private int selectProgramMenu = 4;
    private ArrayList<Number> calc;

    Menu menu1;
    Menu menu2;

    public Calculator() {
        this.calc = new ArrayList<>();
    }

    public void calculator() {
        this.menu1 = new Menu(startMenu);
        if (this.menu1.getSelect() == 1) {
            RationalNumber num1 = new RationalNumber();
            RationalNumber num2 = new RationalNumber();
            RationalNumber result = new RationalNumber();
            this.menu2 = new Menu(programMenu);
            if (menu2.getSelect() > this.selectProgramMenu || menu2.getSelect() < 1) return;
            num1.userNumber();
            num2.userNumber();
            this.calc.add(num1);
            this.calc.add(num2);
            if (this.menu2.getSelect() == 1) { this.calc.add(result.sum(num1, num2)); }
            else if (this.menu2.getSelect() == 2) { this.calc.add(result.diff(num1, num2)); }
            else if (this.menu2.getSelect() == 3) { this.calc.add(result.mult(num1, num2)); }
            else if (this.menu2.getSelect() == 4) { this.calc.add(result.div(num1, num2)); }
            else System.out.println("Такой номер в меню отсутствует!");
        } else if (this.menu1.getSelect() == 2) {
            ComplexNumber num1 = new ComplexNumber();
            ComplexNumber num2 = new ComplexNumber(); 
            ComplexNumber result = new ComplexNumber();
            this.menu2 = new Menu(programMenu);
            if (menu2.getSelect() > this.selectProgramMenu || menu2.getSelect() < 1) return;
            num1.userNumber();
            num2.userNumber();
            this.calc.add(num1);
            this.calc.add(num2);
            if (this.menu2.getSelect() == 1) { this.calc.add(result.sum(num1, num2)); }
            else if (this.menu2.getSelect() == 2) { this.calc.add(result.diff(num1, num2)); }
            else if (this.menu2.getSelect() == 3) { this.calc.add(result.mult(num1, num2)); }
            else if (this.menu2.getSelect() == 4) { this.calc.add(result.div(num1, num2)); }
            else System.out.println("Такой номер в меню отсутствует!");
        } else System.out.println("Такой номер в меню отсутствует!");
    }

    @Override
    public String toString() {
        String text = "Такое значение в меню отсутствует";
        if (this.menu2.getSelect() == 1) { 
            text = String.format("%s + %s = %s\n", this.calc.get(0).toString(), 
                this.calc.get(1).toString(), this.calc.get(2).toString()); 
        } else if (this.menu2.getSelect() == 2) { 
            text = String.format("%s - %s = %s\n", this.calc.get(0).toString(), 
                this.calc.get(1).toString(), this.calc.get(2).toString()); 
        } else if (this.menu2.getSelect() == 3) { 
            text = String.format("%s * %s = %s\n", this.calc.get(0).toString(), 
                this.calc.get(1).toString(), this.calc.get(2).toString()); 
        } else if (this.menu2.getSelect() == 4) { 
            text = String.format("%s / %s = %s\n", this.calc.get(0).toString(), 
                this.calc.get(1).toString(), this.calc.get(2).toString()); 
        }
        return text;
    }
}