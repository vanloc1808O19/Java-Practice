/*
    Chapter 2 sample Program: Shows a message dialog.
*/

import javax.swing.*;

public class Ch2ShowMessageDialog {
    public static void main(String[] args) {
        JFrame jFrame;

        jFrame = new JFrame();
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);

        JOptionPane.showMessageDialog(jFrame, "How are you?");
        JOptionPane.showMessageDialog(null, "Good bye!");
    }
}
