/**
 * Chapter 12 Sample Program: Illustrate the use of the JFileChooser and File classes. 
 */

import java.io.*;
import javax.swing.*;

public class Ch11JFileChooser {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();

        int status;

        File file, directory;

        // chooser = new JFileChooser(System.getProperty("user.dir"));

        // chooser = new JFileChooser("F:/GitHub");

        // status = chooser.showDialog(null, "Run"); // customized label

        // chooser.setFileFilter(new JavaFilter()); // filter only .java files

        status = chooser.showOpenDialog(null);

        if (status == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
            directory = chooser.getCurrentDirectory();

            System.out.println("Directory: " + directory.getName());

            System.out.println("File selected to open: " + file.getName());

            System.out.println("Full path name: " + file.getAbsolutePath());
        } else {
            JOptionPane.showMessageDialog(null, "Open File dialog cancelled");
        }

        System.out.println("\n\n");

        status = chooser.showSaveDialog(null);

        if (status == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
            directory = chooser.getCurrentDirectory();

            System.out.println("Directory: " + directory.getName());

            System.out.println("File selected to save: " + file.getName());

            System.out.println("Full path name: " + file.getAbsolutePath());
        } else {
            JOptionPane.showMessageDialog(null, "Save File dialog cancelled");
        }
    }
}