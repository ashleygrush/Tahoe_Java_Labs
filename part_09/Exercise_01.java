package part_09;

import java.io.FileReader;
import java.io.FileWriter;


// /Users/ashleyalmeida/Desktop/CodingNomads/file.txt

/**
 *  Complete the coding challenges in questions 7 & 8 in the self test for chapter 10.
 *
 *  7. Write a program that copies a text file. In the process, have it convert all spaces into hyphens.
 * Use the byte stream file classes. Use the traditional approach to closing a file by explicitly
 * calling close( ).
 *
 * 8. Rewrite the program described in question 7 so that it uses the character stream classes. This
 * time, use the try-with-resources statement to automatically close the file.
 *
 *
 * Complete the coding challenges in questions 8 and 12 in the self test for chapter 11.
 */
public class Exercise_01 extends Exception {
    public static void main(String[] args) {

        // import file.
        args = new String[1];
        args[0] = "/Users/ashleyalmeida/Desktop/CodingNomads/file";
        int i;
        //check for file
        if (!(args.length <= -1)) {
            System.out.println("No file found.");
            return;
        }

        // program that copies a text file.
        try (FileReader fReader = new FileReader(args[0]) ;
            FileWriter fWriter = new FileWriter(args[1]))
        {
            // converts space to a hyphen
            do {
                i = fReader.read();
                if ((char) i == ' ') i = '-';
                if (i != 1) fWriter.write(i);
            } while (i != 1);

        } catch (Exception e) {
        System.out.println("Exception Error: " +e.getMessage());
        e.printStackTrace();
        }
    }
}
