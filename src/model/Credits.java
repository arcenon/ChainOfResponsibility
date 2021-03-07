package model;

public class Credits {
    // Amount of credits you would like to spent in our Sushi restaurant
    protected int amount;

    // Constructor
    public Credits (int amount) {
        super();
        this.amount = amount;
    }

    // Getter and setter
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
