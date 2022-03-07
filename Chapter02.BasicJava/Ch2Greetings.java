/*
    Chapter 2 Sample Program: Reads a string input
*/

import javax.swing.*;

public class Ch2Greetings {
    public static void main(String[] args) {
        String name;

        name = JOptionPane.showInputDialog(null, "What is your name?");

        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
    }
}
