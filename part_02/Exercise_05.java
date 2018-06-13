package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {
    public static void main(String[] args) {

        System.out.println("Enter a number between 1-9.");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n <= 9) {
            if (n == 1) {
                System.out.println("1 is one.");
            } else if (n == 2) {
                System.out.println("2 is two.");
            } else if (n == 3) {
                System.out.println("3 is three");
            } else if (n == 4) {
                System.out.println("4 is four.");
            } else if (n == 5) {
                System.out.println("5 is five.");
            } else if (n == 6) {
                System.out.println("6 is six.");
            } else if (n == 7) {
                System.out.println("7 is seven.");
            } else if (n == 8) {
                System.out.println("8 is eight.");
            } else if (n == 9) {
                System.out.println("9 is nine.");
            }
        } else if (n < 0 | n > 9) {
            System.out.println("Other; not 1-9.");
        }
    }
}

