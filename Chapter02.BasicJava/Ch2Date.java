/*
    Chapter 2 Sample Program: Date
*/

import javax.swing.*;
import java.util.*;

public class Ch2Date {
    public static void main(String[] args) {
        Date today = new Date();

        JOptionPane.showMessageDialog(null, today.toString());
    }
}
