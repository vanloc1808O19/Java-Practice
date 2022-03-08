public class LotteryCard {
    // date members
    
    // the largest number on a card
    private static final int MAX_NUMBER = 15;

    // the smallest number on a card
    private static final int MIN_NUMBER = 10;

    // represent a card before drawing
    private static final int NO_NUMBER = 0;

    // the 'largest' color for a card
    private static final int MAX_COLOR = 3;

    // the 'smallest' color for a card
    private static final int MIN_COLOR = 1;

    // represent a card before drawing
    private static final int NO_COLOR = 0;

    // selected number on this card
    private int number;

    // selected color on this card
    private int color;

    // constructor
    public LotteryCard() {
        number = NO_NUMBER;
        color = NO_COLOR;
    }

    // spin the card
    public void spin() {
        number = (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1)) + MIN_NUMBER;
        color = (int) (Math.random() * (MAX_COLOR - MIN_COLOR + 1)) + MIN_COLOR;
    }

    // return the number on this card
    public int getNumber() {
        return number;
    }

    // return the color on this card
    public int getColor() {
        return color;
    }
}
