/*
    Chapter 3 sample program: compute area and circumference of a circle
    with formatting using standard output.
*/

import javax.swing.*;
import java.text.*;

public class Ch3Circle2 {
    public static void main(String[] args) {
        final double PI = 3.14159; 
        
        String radiusStr = JOptionPane.showInputDialog("Enter radius: ");
        double radius = Double.parseDouble(radiusStr);

        DecimalFormat df = new DecimalFormat("0.000");

        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        // display the results
        System.out.println("Entered radius: " + radius);
        System.out.println("Area: " + df.format(area));
        System.out.println("Circumference: " + df.format(circumference));
    }
}
