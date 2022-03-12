/**
 * Chapter 11 Sample Program: Illustrate the use of DataInputStream.
 */

import java.io.*;

public class Ch11DataInputStream {
    public static void main(String[] args) throws IOException {
        // setup file and stream
        File inFile = new File("sample2.data");
        FileInputStream inFileStream = new FileInputStream(inFile);
        DataInputStream inDataStream = new DataInputStream(inFileStream);

        // read values of primitive data types from the stream
        System.out.println(inDataStream.readInt());
        System.out.println(inDataStream.readLong());
        System.out.println(inDataStream.readFloat());
        System.out.println(inDataStream.readDouble());
        System.out.println(inDataStream.readBoolean());
        System.out.println(inDataStream.readChar());

        inDataStream.close();
    }
}
