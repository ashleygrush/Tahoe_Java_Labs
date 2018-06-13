package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {
    public static void main(String[] args) {

        System.out.println("Enter a number between 1 - 1,000,000,000.");

        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double t = 1;

        while (t <= 1000000000) {
            if(t == n) break;
            t++;
        }
        System.out.println("your number is " +n);
    }
}

