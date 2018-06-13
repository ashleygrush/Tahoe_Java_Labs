package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 1:
 *      Celsius to Fahrenheit
 *
 *      Write the necessary code to read a degree in Celsius (as a double) from the console
 *      then convert it to fahrenheit and print it to the console.
 *
 *          F = 9 * (C / 5) + 32;
 *
 *      Output should read like - "27.4 degrees celsius = 81.32 degrees fahrenheit"
 */

public class Exercise_01 {
    public static void main(String[] args) {

        double fahrenheit;

        System.out.println("Enter a number in Celsius.");
        Scanner scanner = new Scanner(System.in);
        double c = scanner.nextDouble();

        fahrenheit = 9*(c/5)+32;

        System.out.println("Number above is " + fahrenheit + "degrees fahrenheit.");

    }
}