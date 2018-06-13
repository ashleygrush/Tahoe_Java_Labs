package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {
    public static void main(String[] args) {

        System.out.println("Enter a number in feet.");
        Scanner scanner = new Scanner(System.in);

        double f = scanner.nextDouble();

        double meter = f*.305;

        System.out.println(f + " feet is approx " + meter + " meters.");

    }
}