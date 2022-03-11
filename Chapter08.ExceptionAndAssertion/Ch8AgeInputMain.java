/**
 * Chapter 8 Sample Program: Input a person's age
 */

import javax.swing.*;
import java.util.*;

public class Ch8AgeInputMain {
    public static void main(String[] args) {
        Ch8AgeInputVer1 input = new Ch8AgeInputVer1();
        
        int age = input.getAge("How old are you?");

        GregorianCalendar today = new GregorianCalendar();

        int thisYear = today.get(Calendar.YEAR);

        int bornYear = thisYear - age;

        int answer = JOptionPane.showConfirmDialog(null, "Already had your birthday this year?", "", JOptionPane.YES_NO_OPTION);

        if (answer == JOptionPane.NO_OPTION) {
            bornYear--;
        }

        JOptionPane.showMessageDialog(null, "You were born in " + bornYear);
    }
}
