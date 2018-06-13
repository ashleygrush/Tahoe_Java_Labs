package part_02;


import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {

        System.out.println("Enter a number in minutes up to 1,000,000.");
        Scanner scanner = new Scanner(System.in);

        double m = scanner.nextDouble();

        double year = m/525600;
        double days = m/1440;

        System.out.println(m + " minutes is " + year + " year(s) and " + days + " days.");
    }
}


