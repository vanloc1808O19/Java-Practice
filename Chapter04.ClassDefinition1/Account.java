public class Account {
    // data members
    private String ownerName;

    private double balance;

    // constructor
    public Account() {
        ownerName = "unassigned";
        balance = 0.0;
    }

    // add the passed amount to the balance
    public void add(double amount) {
        balance += amount;
    }

    // deduct the passed amount from the balance
    public void deduct(double amount) {
        balance -= amount;
    }

    // return the balance
    public double getBalance() {
        return balance;
    }

    // return the owner's name
    public String getOwnerName() {
        return ownerName;
    }

    // set the initial balance
    public void setBalance(double initialBalance) {
        balance = initialBalance;
    }

    // set the owner's name
    public void setOwnerName(String name) {
        ownerName = name;
    }
}
