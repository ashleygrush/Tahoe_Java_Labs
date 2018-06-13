package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 6:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "switch-case" statement.
 *
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {
        System.out.println("enter a number between 1-9.");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        switch (n){
            case 1:
                System.out.println("1 is one.");
            case 2:
                System.out.println("2 is two.");
            case 3:
                System.out.println("3 is three.");
            case 4:
                System.out.println("4 is four.");
            case 5:
                System.out.println("5 is five.");
            case 6:
                System.out.println("6 is six.");
            case 7:
                System.out.println("7 is seven.");
            case 8:
                System.out.println("8 is eight.");
            case 9:
                System.out.println("9 is nine.");
            default:
                System.out.println("Other; Not a number between 1-9.");
        }
    }

}