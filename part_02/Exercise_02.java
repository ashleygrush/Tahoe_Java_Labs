package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {
    public static void main(String[] args) {

        System.out.println("Enter a radius and length.");
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble();
        double l =  scanner.nextDouble();

        double area = r*r*3.1415;
        double volume = 3.1415*(r*r)*l;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

    }
}