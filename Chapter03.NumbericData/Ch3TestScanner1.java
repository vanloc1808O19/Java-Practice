/* Test scanner */

import java.util.*;

public class Ch3TestScanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        
        System.out.println("How old are you?");

        age = scanner.nextInt();

        System.out.println("You are " + age + " years old.");

        scanner.close();
    }     
}
