import javax.swing.*;

public class Ch8AgeInputVer3 {
    private static final String DEFAULT_MESSAGE = "Enter your age: ";

    public int getAge() {
        return getAge(DEFAULT_MESSAGE);
    }

    public int getAge(String prompt) {
        String inputStr;

        int age = -1;

        while (true) {
            inputStr = JOptionPane.showInputDialog(null, prompt);

            try {
                age = Integer.parseInt(inputStr);


                if (age < 0) {
                    throw new Exception("Negative age is invalid");
                }

                return age; // input okay so return the value & exit loop
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "'" + inputStr + "' is invalid\nPlease enter digits only");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    }
}
