/**
 * Chapter 6 Sample Program: Time the performance of gcd methods.
 */

import java.util.*;
import javax.swing.*;

public class Ch6TimeGcd {
    private static final int BRUTE_FORCE = 0;

    private static final int EUCLID = 1;

    public static void main(String[] args) {
        Ch6TimeGcd tester = new Ch6TimeGcd();

        tester.start();

        System.exit(0);
    }

    public Ch6TimeGcd() {

    }

    public void start() {
        long bfTime, eTime;
        int m, n;

        while (isContinue()) {
            m = getPositiveInteger();
            n = getPositiveInteger();

            // time the brute force method
            bfTime = timeMethod(m, n, BRUTE_FORCE);

            // time the Euclidean method
            eTime = timeMethod(m, n, EUCLID);

            System.out.println("M: " + m + " N: " + n);
            System.out.println("Brute Force Time: " + bfTime);
            System.out.println("Euclidean Time: " + eTime);
        }
    }

    private long timeMethod(int m, int n, int type) {
        Date startTime, endTime;

        startTime = new Date();

        if (type == BRUTE_FORCE) {
            gcd_bruteforce(m, n);
        } else {
            gcd_euclid(m, n);
        }

        endTime = new Date();

        return endTime.getTime() - startTime.getTime();
    }

    private int getPositiveInteger() {
        int input;
        String strInp;

        while (true) {
            strInp = JOptionPane.showInputDialog("Enter positive integer (0 is okay): ");

            input = Integer.parseInt(strInp);

            if (input >= 0) {
                break;
            }

            JOptionPane.showMessageDialog(null, "Please enter a positive integer.");
        }

        return input;
    }

    private boolean isContinue() {
        int result;
        result = JOptionPane.showConfirmDialog(null,
        /* prompt */ "Run test?",
        /* dialog title */ "Confirmation",
        /* button options */ JOptionPane.YES_NO_OPTION);

        return (result == JOptionPane.YES_OPTION);
    }

    private int gcd_bruteforce(int m, int n) {
        int last = Math.min(m, n);

        int gcd = 1, i = 1;

        while (i <= last) {
            if (m % i == 0 && n % i == 0) {
                gcd = i;
            }

            i++;
        }

        return gcd;
    }

    private int gcd_euclid(int m, int n) {
        int r = n % m;

        while (r != 0) {
            n = m;
            m = r;
            r = n % m;
        }

        return m;
    }
}
