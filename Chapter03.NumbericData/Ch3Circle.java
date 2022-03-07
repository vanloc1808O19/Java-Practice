/*
    Chapter 3 Sample Program: compute area and circumference of a circle
*/

import javax.swing.*;
import java.text.*;

class Ch3Circle {
    public static void main(String[] args) {
        final double PI = 3.14159; // constant

        String radiusStr = JOptionPane.showInputDialog(null, "Enter radius: ");
        double radius = Double.parseDouble(radiusStr);

        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        JOptionPane.showMessageDialog(null, "Given radius: " + radius + "\n" + "Area: " + area + "\n" + "Circumference: " + circumference);
    }
}