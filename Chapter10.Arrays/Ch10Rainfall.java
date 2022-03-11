/**
 * Chapter 10 Sample Program: Compute the annual average rain fall
 * and the variation from monthly average.
 */

import javax.swing.*;

public class Ch10Rainfall {
    public static void main(String[] args) {
        double rainfall[] = new double [12];

        double sum = 0;
        double difference;

        for (int i = 0; i < 12; i++) {
            rainfall[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter rainfall for month " + (i + 1)));
            sum += rainfall[i];
        }

        double average = sum / 12;

        System.out.println("The average rainfall for the year is " + average);

        for (int i = 0; i < 12; i++) {
            System.out.format("%3d", i + 1);

            System.out.format("%15.2f", rainfall[i]);

            difference = Math.abs(rainfall[i] - average);

            System.out.format("%15.2f\n", difference);
        }
    }
}