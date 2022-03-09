/**
 * Chapter 5 Sample Program: Draw a square on a frame
 */

import javax.swing.*; // for JFrame
import java.awt.*; // for Graphics & Container

class Ch5SampleGraphics {
    public static void main(String[] args) {
        JFrame window = new JFrame("My First Rectangle");
        
        window.setSize(300, 200);
        window.setLocation(100, 100);
        window.setVisible(true);
        // window must be visible on the screen before
        // we get its content pane.

        Container contentPane = window.getContentPane();

        Graphics graphic = contentPane.getGraphics();

        graphic.drawRect(50, 50, 100, 30);
    }
}