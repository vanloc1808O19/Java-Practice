/*
    Chapter 2 Sample Program: Simple string processing
*/

import javax.swing.*;
import java.lang.*;

public class Ch2String {
    public static void main(String[] args) {
        String fullName, firstName, lastName, space;

        fullName = new String("Hermione Granger");
        space = new String(" ");

        System.out.println(fullName.length());

        firstName = fullName.substring(0, fullName.indexOf(space));
        System.out.println(firstName);

        lastName = fullName.substring(fullName.indexOf(space) + 1);
        System.out.println(lastName);
    }
}
