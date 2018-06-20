package part_08;

import java.util.Scanner;

public class TryCatch_02 {
    public static void main(String[] args) {
        int x = 1;

        do {

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a number.");
                int n1 = scanner.nextInt();

                System.out.println("Enter a second number.");
                int n2 = scanner.nextInt();
                int r = n1 / n2;

                System.out.println("Your number is " + r);
                x = 2;
            } catch (Exception e) {
                System.out.println("Doesn't work; please try again.");
            }
        }
        while (x == 1);
    }

}

