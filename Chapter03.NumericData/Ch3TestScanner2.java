/* Test scanner */

import java.util.*;

public class Ch3TestScanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.println("Enter two numbers: ");

        num1 = scanner.nextInt(); // get the first int
        num2 = scanner.nextInt(); // get the second int

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        scanner.close();
    }
}
