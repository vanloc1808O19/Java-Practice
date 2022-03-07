import java.text.*;

public class DeductionWithFee {
    public static void main (String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        Account3 account = new Account3("Emma", 100.00);

        account.withdraw(10);
        account.withdraw(10);
        account.withdraw(10);

        System.out.println("Owner: " + account.getOwnerName());
        System.out.println("Balance: $" + df.format(account.getBalance()));
    }
}
