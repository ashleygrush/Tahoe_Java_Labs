package part_01;

/**
 * Part 1 Exercise 6:
 *
 *      Write the necessary code to print out the result of the following:
 *
 *￼         1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
