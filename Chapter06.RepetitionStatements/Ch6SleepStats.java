/**
 * Chapter 6 Sample Program: Sleep Statistics for Dorm Residents
 * Compute the average sleeping time
 * of dorm residents.
 */

 import javax.swing.*;
 import java.text.*;

class Ch6SleepStats {
    public static void main(String[] args) {
        Ch6SleepStats prog = new Ch6SleepStats();

        prog.start();
    }

    // top level control of the program
    public void start() {
        double sleepHour, sum = 0;
        int cnt = 0;

        // enter the dorm name
        String dorm = JOptionPane.showInputDialog(null, "Dorm name:");

        // loop: get hours of sleep for each resident
        // until 0 is entered.
        sleepHour = getDouble("Enter sleep hours (0 - to stop):");

        while (sleepHour != 0) {
            sum += sleepHour;
            cnt++;
            sleepHour = getDouble("Enter sleep hours (0 - to stop):");
        }

        if (cnt == 0) {
            JOptionPane.showMessageDialog(null, "No data entered.\n");
        } else {
            DecimalFormat df = new DecimalFormat("0.000");

            JOptionPane.showMessageDialog(null, "Average sleep time for " + dorm + " is " + df.format(sum / cnt) + " hours.\n");
        }
    }

    // return the double value entered by the user
    private double getDouble(String message) {
        double result;

        String str = JOptionPane.showInputDialog(null, message);

        result = Double.parseDouble(str);

        return result;
    }
}