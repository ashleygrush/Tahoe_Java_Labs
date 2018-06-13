package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        System.out.println("Enter a number in lbs.");
        Scanner scanner = new Scanner(System.in);

        double lbs = scanner.nextDouble();
        double kilos = lbs*0.454;

        System.out.println(lbs + " lbs. is " + kilos + " in kilograms.");

    }
}