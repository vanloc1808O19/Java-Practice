/*
    Program: Ch2Sample1.java
    Notes: Displaying a Window
*/

import javax.swing.*;

class Ch2Sample1 {
    public static void main(String[] args) {
        JFrame myWindow;

        myWindow = new JFrame(); // JFrame is one of system classes of Java/Java standard classes

        myWindow.setSize(300, 200);
        myWindow.setTitle("My First Java Program");
        myWindow.setVisible(true);
    }
}