/**
 * This version improves Ch5Account by
 * adding a data member to represent the state (active/inactive)
 * of an account.
 */

public class Ch5Account2 {
    // data members
    private String ownerName;

    private double balance;

    private boolean active;

    // constructor
    public Ch5Account2(String n, double b) {
        ownerName = n;
        balance = b;
        
        setActive(true);
    }

    // add the passed amount to the balance
    public void add(double amount) {
        if (isActive() && amount > 0) {
            balance += amount;
        }
    }

    // withdraw the passed amount from the balance
    public void withdraw(double amount) {
        if (isActive() && amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // close the amount, set 'active' to false
    public void close() {
        setActive(false);
    }

    // return the current balance of this account
    public double getBalance() {
        return balance;
    }

    // return the owner name of this account
    public String getOwnerName() {
        return ownerName;
    }

    // is the account active?
    public boolean isActive() {
        return active;
    }

    // set the owner name of this account
    public void setOwnerName(String n) {
        ownerName = n;
    }

    // set 'active'
    public void setActive(boolean a) {
        active = a;
    }
}
