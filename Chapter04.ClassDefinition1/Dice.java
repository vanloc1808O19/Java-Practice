public class Dice {
    private static final int MAX_NUMBER = 6;

    private static final int MIN_NUMBER = 1;

    // to represent a dice that is not yet rolled
    private static final int NOT_ROLLED = 0;

    private int number;

    // constructor
    public Dice() {
        number = NOT_ROLLED;
    }

    // roll the dice
    public void roll() {
        number = (int)(Math.floor(Math.random() * (MAX_NUMBER - MIN_NUMBER + 1)) + MIN_NUMBER);
    }

    // return the value of the dice
    public int getValue() {
        return number;
    }
}
