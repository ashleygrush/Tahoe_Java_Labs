package part_04;


import java.util.Arrays;
import java.util.Scanner;
/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */

class TenIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers.");

        int i;
        int numArry[] = new int[10];

        // input user numbers into an array
        for (i = 0; i < numArry.length; i ++) {
            numArry[i] = scanner.nextInt();
            System.out.println("Enter another number.");
        }
        // display user input (for each loop)
        for (int number : numArry){
            System.out.print(number+ " | ");
        }
        System.out.println(); // break

        // print 2, 4, 6, 8 , 10th location
        System.out.println(); //break
        for (i = 1; i < numArry.length; i = i + 2) {
            System.out.print(numArry[i] + " | ");
        }

        // prints 1, 3, 5, 7, 9.
        for (i = 0; i < numArry.length; i = i + 2) {
            System.out.print(numArry[i] + " | ");
        }

    }
}