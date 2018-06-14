package part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999
        System.out.println("Enter a number between 1 - 1,000,000,000.");
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();

        boolean fourAndSeven = false;
        // use the && operator to see if the user's number is divisible by both 4 and 7
        if (sc % 4 == 0 && sc % 7 == 0) {
            System.out.println(sc + " is divisible by 4 & 7.");
        }

        // use the || operator to see if the user's number is divisible by 4 or 7
        if (sc % 4 == 0 || sc % 7 == 0) {
            if (sc % 4 == 0) {
                System.out.println(sc + " is divisible by 4.");
            }
            if (sc % 7 == 0) {
                System.out.println(sc + " is divisible by 7.");
            }

            // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
            if (sc % 4 == 0 ^ sc % 7 == 0) {
                if (sc % 4 == 0) {
                    System.out.println(sc + " is divisible by 4.");
                }
                if (sc % 7 == 0) {
                    System.out.println(sc + " is divisible by 7.");
                }

                // print out the results
                // see above.
            }
        }
    }
}

