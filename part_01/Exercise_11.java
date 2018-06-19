package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */


public class Exercise_11 {
    public static void main(String[] args) {

        int born = 60/6;
        int dies = 60/12;
        int immigrates = 60/40;

        long year = 525600;
        long popIncrease = ((year*3)*((born+immigrates) - dies)) + 380123456;

        System.out.println("The new population in 3 years will be " + popIncrease);

    }
}

