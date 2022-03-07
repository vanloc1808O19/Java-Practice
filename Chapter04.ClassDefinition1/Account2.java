public class Account2 {
    // data members
    private String ownerName;

    private double balance;

    public Account2(String name, double startingBalance) {
        ownerName = name;
        balance = startingBalance;
    }

    public void add(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String n) {
        ownerName = n;
    }
}
