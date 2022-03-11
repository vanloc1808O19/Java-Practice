import javax.swing.*;

public class Ch8AgeInputVer2 {
    private static final String DEFAULT_MESSAGE = "Enter your age: ";

    public int getAge() {
        return getAge(DEFAULT_MESSAGE);
    }

    public int getAge(String prompt) {
        String inputStr;

        int age = -1;

        boolean keepGoing = true;

        while (keepGoing) {
            inputStr = JOptionPane.showInputDialog(null, prompt);

            try {
                age = Integer.parseInt(inputStr);

                keepGoing = false; // input opk, so stop looping
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                "," + inputStr + "' is invalid\n Please enter digits only");
            }
        }

        return age;
    }
}
