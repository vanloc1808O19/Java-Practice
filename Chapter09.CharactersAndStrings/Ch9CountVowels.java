/**
 * Chapter 9 Sample Program: Count the number of vowels in a string.
 */

 import javax.swing.*;

public class Ch9CountVowels {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "What is your name?");

        int numberOfCharacters = name.length();

        int vowelsCount = 0;

        for (int i = 0; i < numberOfCharacters; i++) {
            char letter = name.charAt(i);

            if (letter == 'a' || letter == 'A' ||
                letter == 'e' || letter == 'E' ||
                letter == 'i' || letter == 'I' ||
                letter == 'o' || letter == 'O' ||
                letter == 'u' || letter == 'U') {
                vowelsCount++;
                }
        }

        JOptionPane.showMessageDialog(null, name + ", you have " + vowelsCount + " vowels.");
    }
}