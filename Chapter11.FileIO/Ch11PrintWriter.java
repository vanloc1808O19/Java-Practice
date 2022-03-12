/**
 * Chapter 11 Sample Program: Illustrate the use of PrintWriter.
 */

 import java.io.*;

public class Ch11PrintWriter {
    public static void main(String[] args) throws IOException {
        // setup file and stream
        File outFile = new File("sample3.data");
        FileOutputStream outStream = new FileOutputStream(outFile);
        PrintWriter out = new PrintWriter(outStream);

        // write values of primitive data types to the stream
        out.println(987654321);
        out.println(1111111L);
        out.println(222222F);
        out.println(333333D);
        out.println('a');
        out.println(true);

        // output done, close stream
        out.close();
    }
}
