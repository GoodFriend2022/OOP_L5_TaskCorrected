public abstract class Number {

    protected String number;
    protected Number num;
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        else return this.getNumber().equals((String) obj);
    }
}
