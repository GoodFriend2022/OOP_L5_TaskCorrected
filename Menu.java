import java.util.Scanner;

public class Menu implements InputNumber {
    
    private String menu;
    private int select;
    
    public Menu(String menu) {
        this.menu = menu;
        this.select = 0;
        this.userNumber();
    }

    public String getMenu() {
        return menu;
    }
    
    public int getSelect() {
        return select;
    }
    
    @Override
    public void userNumber() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(this.menu);
        try {
            this.select = iScanner.nextInt();
        } catch (Exception e) {
            System.out.println("Такого значения нет в меню");
            iScanner.close();
        }
    }
}
