/**
 * Chapter 9 Sample Program: Replace every vowel in a given
 * sentence with 'X' using StringBuffer.
 */

 import javax.swing.*;

public class Ch9ReplaceVowels {
    public static void main(String[] args) {
        String inSentence = JOptionPane.showInputDialog(null, "Enter a sentence:");

        StringBuffer tempStringBuffer = new StringBuffer(inSentence);

        int num = tempStringBuffer.length();

        for (int i = 0; i < num; i++) {
            char ch = tempStringBuffer.charAt(i);

            if (ch == 'a' || ch == 'A' ||
                ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' ||
                ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U') {
                tempStringBuffer.setCharAt(i, 'X');
            }
        }
        
        System.out.println("Input: " + inSentence);
        System.out.println("Output: " + tempStringBuffer);
    }
}
