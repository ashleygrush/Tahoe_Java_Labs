package part_11;

/**
 * Write a generic method to exchange the positions of two different elements in an array.
 */

class Exercise_02 {
    public static void main(String[] args) {
        // initialize variables
        Integer myArray[] = {1, 2, 3, 4, 5};

        System.out.print(shuffle(myArray));
    }

    // generic method to change two elements of an array
    public static <T> int shuffle(T[] list) {

        // shuffle index 0 with index 4
        T temp = list[0];
        list[0] = list[4];
        list[4] = temp;
        return 1;
    }
}

