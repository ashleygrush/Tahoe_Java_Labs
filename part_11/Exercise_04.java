package part_11;

/**
 make a new generic method called sumArray that will return the
 sum of all numbers in the array (no matter data type of numbers
 the array has in it)
 */

class Exercise_04 {
    public static void main(String[] args) {

        Double[] doubleArray = {1.5, 2.2, 3.3, 4.4};
        Integer[] intArray = {1, 2, 3, 4};

        System.out.println(sumArray(doubleArray));
        System.out.println(sumArray(intArray));
    }

    public static <T extends Number> double sumArray(T[] vals) {

        double sum = 0;

        for (Number i : vals) {
            // method on the NumberClass (number > double)
            sum += i.doubleValue();
        }
        return sum;
    }
}




