/**
 * Chapter 9 Sample Program: Check whether the input string
 * is a valid identifier
 */

 import javax.swing.*;

public class Ch9MatchJavaIdentifier {
    private static final String STOP = "STOP";

    private static final String VALID = "Valid Java Identifier";

    private static final String INVALID = "Not a valid Java Identifier";

    private static final String VALID_IDENTIFIER_PATTERN = "[a-zA-Z][a-zA-Z0-9_]*";

    public static void main(String[] args) {
        String str, reply;

        while (true) {
            str = JOptionPane.showInputDialog(null, "Identifier:");

            if (str.equals(STOP)) {
                break;
            }

            if (str.matches(VALID_IDENTIFIER_PATTERN)) {
                reply = VALID;
            } else {
                reply = INVALID;
            }

            JOptionPane.showMessageDialog(null, str + ":\n" + reply);
        }
    }
}