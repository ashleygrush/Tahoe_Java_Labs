
package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {
    public static void main(String[] args) {

        System.out.println("Enter your investment amount, interest rate percentage and number of years.");

        Scanner scanner = new Scanner(System.in);

        double invest_amount = scanner.nextDouble();
        double percentage = scanner.nextDouble();
        double years = scanner.nextDouble();

        double balance = ((percentage/100)*invest_amount)*years;

        System.out.println("with a starting amount of " + invest_amount +
                ", you will see a new balance of " + (balance+invest_amount) + " after " + years + " number of years.");

    }

}


