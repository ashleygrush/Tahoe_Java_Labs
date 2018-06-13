package part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {
    public static void main(String[] args) {

        int n;

        for (n = 1; n <= 100; n++) {
            boolean prime = true;
            for (int x = n - 1; x > 1; x--) {
                if (n % x == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println(n);
            }
        }
    }
}