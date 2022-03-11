/**
 * Chapter 8 Sample Class: Class to input age
 */

 import javax.swing.*;

 class Ch8AgeInputVer1 {
     private static final String DEFAULT_MESSAGE = "Enter your age: ";

     public int getAge() {
         return getAge(DEFAULT_MESSAGE);
     }

     public int getAge(String prompt) {
         String inputStr = JOptionPane.showInputDialog(null, prompt);

         int age = Integer.parseInt(inputStr);

         return age;
     }
 }