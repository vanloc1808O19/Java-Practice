/**
 * Chapter 11 Sample Program: Illustrate how to filter only
 * Java source files for listing in JFileChooser
 */

 import java.io.File;
 import javax.swing.*;
 import javax.swing.filechooser.*;

public class Ch11JavaFilter {
    private static final String JAVA = "java";

    private static final char DOT = '.';

    // accept only directories and 
    // files with .java extension only
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        if (extension(f).equalsIgnoreCase(JAVA)) {
            return true;
        }

        return false;
    }

    // description of the filtered files
    public String getDescription() {
        return "Java source files (.java)";
    }

    // extract the extension from the filename
    private String extension(File f) {
        String fileName = f.getName();

        int filt = fileName.lastIndexOf(DOT);

        if (filt > 0 && filt < fileName.length() - 1) {
            // make sure the dot is not
            // at the first or the last character position
            return fileName.substring(filt + 1);
        }

        return "";
    }
}
