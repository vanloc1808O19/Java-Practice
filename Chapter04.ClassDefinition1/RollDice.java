public class RollDice {
    // simulate the rolling of three dices
    public static void main (String[] args) {
        Dice one, two, three;

        one = new Dice();
        two = new Dice();
        three = new Dice();

        one.roll();
        two.roll();
        three.roll();

        System.out.println("Dice 1: " + one.getValue());
        System.out.println("Dice 2: " + two.getValue());
        System.out.println("Dice 3: " + three.getValue());
    }
}
