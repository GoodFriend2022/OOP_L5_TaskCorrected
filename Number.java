public abstract class Number {

    protected String number;
    protected Number n;
    protected String model = "число";

    public Number(String number) {
        this.number = number;
    }
    
    public Number() {
        this("");
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("%s", this.number);
    }
}
