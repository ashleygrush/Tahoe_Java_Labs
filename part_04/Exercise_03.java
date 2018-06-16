package part_04;

/**

 Create, populate, and print out a two-dimensional array that will show the following output:

 0 1 2 3 4 5 6 7 8 9
 10 11 12 13 14 15 16 17 18 19
 20 21 22 23 24 25 26 27 28 29
 30 31 32 33 34 35 36 37 38 39
 40 41 42 43 44 45 46 47 48 49

 */

public class Exercise_03 {

    public static void main(String[] strings) {

        int twoDiArray[][];
        twoDiArray = new int[5][10];
        int count = 0;

        // populates the array
        for (int rows = 0; rows < twoDiArray.length; rows++) {
            for (int columns = 0; columns < twoDiArray[0].length; columns++) {
                twoDiArray[rows][columns] = count;
                count++;
            }
        }

        // prints out the array
        for (int[] rowDisplay: twoDiArray) {
            for (int val : rowDisplay) {
                System.out.print(val+ " | ");
            }
            System.out.println();
        }
    }
}