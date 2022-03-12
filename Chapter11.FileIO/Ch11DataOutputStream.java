/**
 * Chapter 12 Sample Program: Illustrate the use of DataOutputStream.
 */

 import java.io.*;

public class Ch11DataOutputStream {
    public static void main(String[] args) throws IOException {
        // setup the streams
        File outFile = new File("sample2.data");
        FileOutputStream outFileStream = new FileOutputStream(outFile);
        DataOutputStream outDataStream = new DataOutputStream(outFileStream);

        // write values of primitive data types to the stream
        outDataStream.writeInt(987654321);
        outDataStream.writeLong(1111111L);
        outDataStream.writeFloat(222222F);
        outDataStream.writeDouble(3333333D);
        outDataStream.writeBoolean(true);
        outDataStream.writeChar('a');

        // output done, so close the stream
        outDataStream.close();
    }
}
