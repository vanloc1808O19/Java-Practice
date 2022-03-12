/**
 * Chapter 12 Sample Program: Illustrate the use of FileInputStream.
 */

 import java.io.*;

public class Ch11FileInputStream {
    public static void main(String[] args) throws IOException {
        // setup file and stream
        File inFile = new File("sample1.data");
        FileInputStream inStream = new FileInputStream(inFile);

        // setup an array to read data in
        int fileSize = (int)inFile.length();
        byte[] arr = new byte[fileSize];

        // read data in and display them
        inStream.read(arr);

        for (int i = 0; i < fileSize; i++) {
            System.out.print(arr[i] + " ");
        }

        inStream.close();
    }
}
