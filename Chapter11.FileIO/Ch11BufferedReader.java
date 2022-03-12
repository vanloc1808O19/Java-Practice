/**
 * Chapter 11 Sample Program: Illustrate the use of BufferedReader.
 */

import java.io.*;

public class Ch11BufferedReader {
    public static void main(String[] args) throws IOException {
        // setup file and stream
        File inFile = new File("sample3.data");
        FileReader fileReader = new FileReader(inFile);
        BufferedReader in = new BufferedReader(fileReader);

        String str;

        // get integer
        str = in.readLine();
        int i = Integer.parseInt(str);

        // get long
        str = in.readLine();
        long l = Long.parseLong(str);

        // get float
        str = in.readLine();
        float f = Float.parseFloat(str);

        // get double
        str = in.readLine();
        double d = Double.parseDouble(str);

        // get char
        str = in.readLine();
        char c = str.charAt(0);

        // get boolean
        str = in.readLine();
        boolean b = Boolean.parseBoolean(str);

        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);

        // input done, close stream
        in.close();
    }
}
