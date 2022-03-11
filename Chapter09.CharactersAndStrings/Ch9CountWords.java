/**
 * Chapter 9 Sample Program: Count the number of words in a string.
 */

import javax.swing.*;

public class Ch9CountWords {
    private static final char BLANK = ' ';

    public static void main(String[] args) {
        String sentence = JOptionPane.showInputDialog(null, "Enter a sentence:");

        int num = sentence.length();
        int idx = 0;
        int wordCount = 0;

        while (idx < num) {
            // ignore blank spaces

            while (idx < num && sentence.charAt(idx) == BLANK) {
                idx++;
            }

            // now locate the end of the word
            while (idx < num && sentence.charAt(idx) != BLANK) {
                idx++;
            }

            // another word is found, so increase the counter
            wordCount++;
        }

        // display the result
        JOptionPane.showMessageDialog(null, sentence + " has " + wordCount + " words.");
    }
}
