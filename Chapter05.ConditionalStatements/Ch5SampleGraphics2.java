/**
 * Chapter 5 Sample Program: Draw one blue square
 * and one filled red square one light gray
 * background content pane
 */

import javax.swing.JFrame;
import java.awt.*;

public class Ch5SampleGraphics2 {
    public static void main(String[] args) {
        JFrame win = new JFrame("Rectangles");
        win.setSize(300, 200);
        win.setLocation(100, 100);
        win.setVisible(true);

        Container contentPane = win.getContentPane();
        contentPane.setBackground(Color.LIGHT_GRAY);

        Graphics g = contentPane.getGraphics();

        g.setColor(Color.BLUE);
        g.drawRect(50, 50, 100, 100);
        
        g.setColor(Color.RED);
        g.fillRect(175, 50, 100, 100);
    }
}
