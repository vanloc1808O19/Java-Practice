/**
 * Chapter 9 Sample Program: Check whether the input
 * string is a valid identifier. This version
 * uses the Matcher and Pattern classes.
 */

import javax.swing.*;
import java.util.regex.*;

public class Ch9MatchJavaIdentifier2 {
    private static final String STOP = "STOP";

    private static final String VALID = "Valid identifier";

    private static final String INVALID = "Invalid identifier";

    private static final String VALID_IDENTIFIER_PATTERN = "[a-zA-z][a-zA-z0-9_$]*";

    public static void main(String[] args) {
        String str, reply;

        Matcher matcher;

        Pattern pattern = Pattern.compile(VALID_IDENTIFIER_PATTERN);

        while (true) {
            str = JOptionPane.showInputDialog(null, "Identifier:");

            if (str.equals(STOP)) {
                break;
            }

            matcher = pattern.matcher(str);

            if (matcher.matches()) {
                reply = VALID;
            } else {
                reply = INVALID;
            }

            JOptionPane.showMessageDialog(null, reply);
        }
    }
}
