/*
    This version modifies Account3 by adding a new
    private method.
*/

public class Account4 {
    // data members
    private static final double FEE = 0.50;

    private String ownerName;

    private double balance;

    // constructor
    public Account4(String n, double b) {
        ownerName = n;
        balance = b;
    }

    // add the passed amount to the balance
    public void add(double amount) {
        adjust(amount);
    }

    // deduct the passed amount from the balance
    public void deduct(double amount) {
        adjust(-amount - FEE);
    }

    // return the balance
    public double getBalance() {
        return balance;
    }

    // return the owner's name
    public String getOwnerName() {
        return ownerName;
    }

    // adjust the account balance
    private void adjust(double amount) {
        balance += amount;
    }
}
