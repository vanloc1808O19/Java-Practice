public class Account3 {
    // this version includes the FEE class constant and the modified
    // withdraw method

    // data members
    private static final double FEE = 0.50;

    private String ownerName;

    private double balance;

    // constructor
    public Account3(String name, double startingBalance) {
        ownerName = name;
        balance = startingBalance;
    }

    public void add(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            balance -= FEE;
        }
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
