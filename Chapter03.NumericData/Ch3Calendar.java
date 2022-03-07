/*
    Chapter 3 Sample Program: Display calendar info
*/

import java.util.*;

public class Ch3Calendar {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();

        // GregorianCalendar birthday = new GregorianCalendar(2002, Calendar.AUGUST, 18);

        System.out.println(cal.getTime());

        // System.out.println(birthday);

        System.out.println("YEAR: " + cal.get(Calendar.YEAR));
        System.out.println("MONTH: " + cal.get(Calendar.MONTH));
        System.out.println("DATE: " + cal.get(Calendar.DATE));

        System.out.println("DAY_OF_WEEK: " + cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_MONTH: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR: " + cal.get(Calendar.DAY_OF_YEAR));

        System.out.println("WEEK_OF_YEAR: " + cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println("WEEK_OF_MONTH: " + cal.get(Calendar.WEEK_OF_MONTH));

        System.out.println("AM_PM: " + cal.get(Calendar.AM_PM));

        System.out.println("HOUR: " + cal.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY: " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE: " + cal.get(Calendar.MINUTE));
        System.out.println("SECOND: " + cal.get(Calendar.SECOND));
    }
}
