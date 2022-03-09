/*
    Chapter 5 Sample Program: Compute circle area and circumference.
*/

import java.text.DecimalFormat;
import javax.swing.*;

public class Ch5Sample1 {
    public static void main(String[] args) {
        double radius, area, circumference;

        radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the radius of the circle: "));

        Ch5Circle circle = new Ch5Circle(radius);

        DecimalFormat df = new DecimalFormat("0.000");

        if (circle.getRadius() == Ch5Circle.INVALID_DIMENSION) {
            JOptionPane.showMessageDialog(null, "Invalid radius.");
        } else {
            area = circle.getArea();
            circumference = circle.getCircumference();

            JOptionPane.showMessageDialog(null, "The area of the circle is " + df.format(area) + " and the circumference is " + df.format(circumference));
        }
    }
}
