/**
 * Chapter 9 Sample Program: Count the number of times the
 * word 'java' appears in the input using pattern matching
 * technique. THe program terminates when the word STOP (case-sensitive) is entered.
 */

import javax.swing.*;
import java.util.regex.*;

public class Ch9CountJava {
    public static void main(String[] args) {
        int javaCount = 0;

        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);

        String document = JOptionPane.showInputDialog(null, "Enter a string:");

        Matcher matcher = pattern.matcher(document);

        while (matcher.find()) {
            javaCount++;
        }

        JOptionPane.showMessageDialog(null, "The word 'java' appears " + javaCount + " times.");
    }
}
