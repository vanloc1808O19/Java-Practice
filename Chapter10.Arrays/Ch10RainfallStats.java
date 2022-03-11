/**
 * Chapter 10 Sample Program: Compute different statistics
 * from monthly rainfall averages.
 */

 import javax.swing.*;

public class Ch10RainfallStats {
    public static void main(String[] args) {
        String monthName[] = {"Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec"};

        double rainfall[] = new double[12];

        double quarterAverage[] = new double[4];

        double sum = 0;

        for (int i = 0; i < rainfall.length; i++) {
            rainfall[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter rainfall for month " + monthName[i]));
            sum += rainfall[i];
        }

        double average = sum / 12;

        System.out.format("Annual average rainfall: %6.2f\n\n", average);

        double oddMonthSum = 0, evenMonthSum = 0;

        for (int i = 0; i < rainfall.length; i++) {
            if (i % 2 == 1) {
                evenMonthSum += rainfall[i];
            } else {
                oddMonthSum += rainfall[i];
            }
        }

        double oddMonthAverage = oddMonthSum / 6;
        double evenMonthAverage = evenMonthSum / 6;

        System.out.format("Odd month rainfall: %6.2f\n", oddMonthAverage);
        System.out.format("Even month rainfall: %6.2f\n\n", evenMonthAverage);

        for (int i = 0; i < 4; i++) {
            quarterAverage[i] = 0;

            for (int j = 0; j < 3; j++) {
                quarterAverage[i] += rainfall[i * 3 + j];
            }

            quarterAverage[i] /= 3;

            System.out.format("Rainfall average %3d: %6.2f\n", i + 1, quarterAverage[i]);
        }
    }
}
