import java.util.*;

public class Ch6DroppingWatermelon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        scan.useDelimiter(System.getProperty("line.separator"));

        System.out.print("Initial Height: ");
        double initialHeight = scan.nextDouble();

        double touchTime = Math.sqrt(initialHeight / 16.00);
        touchTime = Math.round(touchTime * 10000.00) / 10000.00;

        // convert to four decimal places
        System.out.println("Time t Position at time t\n");

        for (int time = 0; time < touchTime; time++) {
            double position = -16.00 * time * time + initialHeight;
            System.out.println(time + " " + position);
        }

        // print the last second 
        System.out.println(touchTime + " 0.00");

        scan.close();
    }
}
