/*
    Chapter 3 Sample Program: Select the winning number
*/

import java.util.*;

class Ch3SelectWinner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // get two input values
        System.out.println("Enter the starting number M: ");
        int startingNumber = scan.nextInt();

        System.out.println("Enter the number of participants N: " );
        int count = scan.nextInt();

        // select the winner
        int min = startingNumber + 1;
        int max = startingNumber + count;

        int winningNumber = (int)(Math.floor(Math.random() * (max - min + 1)) + min);

        System.out.println("The winning number is " + winningNumber);

        scan.close();
    }
}