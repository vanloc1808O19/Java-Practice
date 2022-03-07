public class BicycleRegistration {
    public static void main (String[] args) {
        Bicycle bike1, bike2;

        bike1 = new Bicycle();
        bike1.setOwnerName("Emma Watson");

        bike2 = new Bicycle();
        bike2.setOwnerName("Hermione Granger");

        String owner1 = bike1.getOwnerName();
        String owner2 = bike2.getOwnerName();

        System.out.println(owner1 + " owns a bicycle");
        System.out.println(owner2 + " owns a bicycle");
    }
}
