package part_09;
//Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

import java.io.*;

class Exercise_02 extends Exception {
    public static void main(String[] args) {

        // inport file.
        args = new String[1];
        args[0] = "/Users/ashleyalmeida/Desktop/CodingNomads/file.txt";

        // variables
        int i;
        FileInputStream filein;

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

        // read bytes
        try {
            do {
                i = filein.read();
                if (i != 0) System.out.print((char) i+ " , ");
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Error reading file.");

            // close file
            try {
                filein.close();
            } catch (IOException ecf) {
                System.out.println("Error closing file.");
            }
        }
    }
}