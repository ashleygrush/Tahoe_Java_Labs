package part_01;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {

     double time = 30.30;
     double km = 12/1.6;

     double mph = time/km;
        System.out.println("The runner's average is " + mph + " mph.");
    }
}