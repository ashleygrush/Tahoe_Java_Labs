package part_11;

/**
 * Let's say you have an integer array and a string array. Write a single method printArray that can print all
 * the elements of both arrays. The method should be able to accept both integer arrays or string arrays.
 * <p>
 * Complete the code so that it prints the following lines:
 * <p>
 * 1
 * 2
 * 3
 * Hello
 * World
 **/

public class Exercise_01{
    public static void main(String[] args) {
        // set variables
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        // print results
        printArray(intArray);
        printArray(stringArray);
    }

    // build array
    public static <T> void printArray(T[] newArray) {
        for (T element : newArray) {
            System.out.println(element);
        }
    }
}









