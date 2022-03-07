/*
    Chapter 3 Sample Program: Day of the week the Declaration of Independence was public
*/

import java.util.*;
import java.text.*;
import javax.swing.*;

public class Ch3IndependenceDay {
    public static void main(String[] args) {
        GregorianCalendar independenceDay = new GregorianCalendar(1945, Calendar.SEPTEMBER, 2);

        SimpleDateFormat df = new SimpleDateFormat("EEEE");

        JOptionPane.showMessageDialog(null, "It was public on " + df.format(independenceDay.getTime()));
    }
}
