/*
    Chapter 2 Program: Displays formatted date information
    https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
*/

import javax.swing.*;
import java.util.*; // for Date
import java.text.*; // for SimpleDateFormat

class Ch2DateDisplay {
    public static void main(String[] args) {
        Date today;
        SimpleDateFormat df1, df2;
        
        today = new Date();

        df1 = new SimpleDateFormat();
        df2 = new SimpleDateFormat("EEEE MMMM dd, YYYY"); 
        // default short format display
        JOptionPane.showMessageDialog(null, "Today is " + df1.format(today));

        //programmer-designated long format display
        JOptionPane.showMessageDialog(null, "Today is " + df2.format(today));
    }
}