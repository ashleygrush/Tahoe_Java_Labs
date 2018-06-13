package part_01;

/**
 * Part 1 Exercise 9:
 *
 *      Write the necessary code to display the area of a rectangle, as well as the perimeter of
 *      a rectangle that has a width of 2.4 and a height of 6.4
 *
 */
public class Exercise_09 {
    public static void main(String[] args) {
        double w = 2.4;
        double h = 6.4;

        double area = w * h;
        double perimeter = 2*(h+w);

        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);

    }
}