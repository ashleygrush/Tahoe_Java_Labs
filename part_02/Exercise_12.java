package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {
    public static void main(String[] args) {

        System.out.println("Enter the miles to drive; MPG of your car and the cost of fuel per gallon.");

        Scanner scanner = new Scanner(System.in);

        int miles = scanner.nextInt();
        int mpg = scanner.nextInt();
        double price = scanner.nextDouble();

        double total = (miles / mpg) * price;

        System.out.println("Your trip will costs approximately $" + total);
    }
}