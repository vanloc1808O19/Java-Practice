import java.awt.*;
import javax.swing.*;

public class Ch5RoomWinner {
    public static void main(String[] args) {
        JFrame win = new JFrame("Room Winner");

        win.setSize(300, 200);
        win.setLocation(100, 100);
        win.setVisible(true);

        Container contentPane = win.getContentPane();
        contentPane.setBackground(Color.WHITE);

        Graphics g = contentPane.getGraphics();

        GraphicLotteryCard one, two, three;

        one = new GraphicLotteryCard();
        two = new GraphicLotteryCard();
        three = new GraphicLotteryCard();

        one.spin();
        two.spin();
        three.spin();

        one.draw(g, 10, 20);
        two.draw(g, 50, 20);
        three.draw(g, 90, 20);
    }
}
