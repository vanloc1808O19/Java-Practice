import java.text.DecimalFormat;

/*
    Chapter 3 Sample Program: Compute area and circumference of a circle
    with formatting using standard input and standard output.
*/

import java.util.*;
import java.text.*;

public class Ch3Circle3 {
    public static void main(String[] args) {
        final double PI = 3.14159;

        double radius;

        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("Enter radius: ");
        radius = scanner.nextDouble();

        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        // display the results
        System.out.println("Entered radius: " + radius);
        System.out.println("Area: " + df.format(area));
        System.out.println("Circumference: " + df.format(circumference));

        scanner.close();
    }
}
