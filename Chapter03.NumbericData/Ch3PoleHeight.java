/* 
    Chapter 3 Sample Program: Estimate the pole height
    https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
*/

import java.text.*;
import java.util.*;

public class Ch3PoleHeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // get three input values
        double alpha, beta;
        System.out.print("Angle alpha in degree: ");
        alpha = scan.nextDouble();
        System.out.print("Angle beta in degree: ");
        beta = scan.nextDouble();

        double distance;
        System.out.print("Distance between point A and point B (ft): ");
        distance = scan.nextDouble();

        // compute the height of the tower
        double alphaRad = Math.toRadians(alpha);
        double betaRad = Math.toRadians(beta);

        double height = (distance * Math.sin(alphaRad) * Math.sin(betaRad)) / (Math.sqrt(Math.sin(alphaRad + betaRad) - Math.sin(alphaRad - betaRad)));

        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("Estimated height of the pole: " + df.format(height) + " ft");

        scan.close();
    }
}
