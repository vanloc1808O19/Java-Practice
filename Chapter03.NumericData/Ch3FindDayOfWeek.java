import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
    Chapter 3 Sample Program: Find the day of the week of a given date
*/

public class Ch3FindDayOfWeek {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        scan.useDelimiter(System.getProperty("line.separator"));
        
        System.out.print("Year (yyyy: ");
        int year = scan.nextInt();

        System.out.print("Month (1-12): ");
        int month = scan.nextInt();

        System.out.print("Day (1-31): ");
        int day = scan.nextInt();

        GregorianCalendar cal = new GregorianCalendar(year, month - 1, day);

        SimpleDateFormat df = new SimpleDateFormat("EEEE");

        System.out.println(df.format(cal.getTime()));

        scan.close();
    }
}
