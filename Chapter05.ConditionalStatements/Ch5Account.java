/*
    This version adds a validity test
    inside the add and withdraw method
*/

public class Ch5Account {
    // data members
    private String ownerName;

    private double balance;

    // constructor
    public Ch5Account(String n, double b) {
        ownerName = n;
        balance = b;
    }

    // add the passed amount to the balance
    public void add(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // withdraw the passed amount from the balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // return the current balance of this account
    public double getBalance() {
        return balance;
    }

    // return the owner name of this account
    public String getOwnerName() {
        return ownerName;
    }

    // set the owner name of this account
    public void setOwnerName(String n) {
        ownerName = n;
    }
}
