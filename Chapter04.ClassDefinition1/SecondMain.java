public class SecondMain {
    public static void main(String[] args) {
        Bicycle bike;
        Account acc;

        String myName = "Nguyen Van Loc";
        
        bike = new Bicycle();
        bike.setOwnerName(myName);

        acc = new Account();
        acc.setOwnerName(myName);
        acc.setBalance(250.0);

        acc.add(1000);
        acc.deduct(50);

        System.out.println("Owner: " + acc.getOwnerName());
        System.out.println("Balance: " + acc.getBalance());
        System.out.println(bike.getOwnerName() + " owns a bicycle and has $" + acc.getBalance() + " left in the bank");
    }
}
