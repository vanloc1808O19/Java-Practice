import java.awt.*;

public class GraphicLotteryCard {
    // data members

    // width of this card for drawing
    public static final int WIDTH = 30;

    // height of this card for drawing
    public static final int HEIGHT = 40;

    // the other data members and methods are the same as before
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
    public GraphicLotteryCard() {
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

    public void draw(Graphics g, int xOrigin, int yOrigin) {
        switch (color) {
            case 1: g.setColor(Color.RED);
                    break;
            
            case 2: g.setColor(Color.GREEN);
                    break;
            
            case 3: g.setColor(Color.BLUE);
                    break;
        }

        g.fillRect(xOrigin, yOrigin, WIDTH, HEIGHT);
        g.setColor(Color.WHITE);

        g.drawString("" + number, xOrigin + WIDTH / 4, yOrigin + HEIGHT / 2);
        // "" + number: a quick way to convert a numerical value to string
    }
}
