package part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */


public class Exercise_05 {

    public static void main(String[] strings) {

        int array[] = {1,2,3,4,5};

        for ( int x : array) {
            System.out.print(x+ " | ");
        }


    }
}