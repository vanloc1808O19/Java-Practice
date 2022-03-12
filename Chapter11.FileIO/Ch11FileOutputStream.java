/**
 * Chapter 11 Sample Program: Illustrate the use of FileOutputStream.
 */

import java.io.*;

public class Ch11FileOutputStream {
    public static void main(String[] args) throws IOException {
        // setup file and stream
        File outFile = new File("sample1.data");

        FileOutputStream outStream = new FileOutputStream(outFile);

        // data to output
        byte arr[] = {10, 20, 30, 40, 50, 60, 70, 80};

        // write data to the stream
        outStream.write(arr);

        // output done, so close the stream
        outStream.close();
    }
}
