package part_09;

import java.io.*;

// file location: "/Users/ashleyalmeida/Desktop/CodingNomads/file"

// Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
//be sure to close all connections

public class Exercise_03 {
    public static void main(String[] args) {

        // inport file.
        args = new String[1];
        args[0] = "/Users/ashleyalmeida/Desktop/CodingNomads/file.txt";

        // variables
        String line;
        int i;
        FileInputStream filein;
        BufferedReader bufferRe;

        // file specified.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile File");
            return;
        }

        // read file
        try {
            filein = new FileInputStream(args[0]);
        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }


        // read()
        try {
            do {
                i = filein.read();
                if (i != 0) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Error reading file." + exc);



            // close file
            try {
                filein.close();
            } catch (IOException ecf) {
                System.out.println("Error closing file.");
            }
        }
    }
}
