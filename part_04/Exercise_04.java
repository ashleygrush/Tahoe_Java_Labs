package part_04;

/**
 *
 */

class Exercise_04 {
    public static void main(String[] args) {
        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}
        };
        // uncomment the lines below when your methods are ready
        System.out.println(getMaxVal(dataArray));
        System.out.println(getMinVal(dataArray));
    }

    // write a method called getMaxVal that takes in a 2D array and iterates through the array to determine the max value in array
    public static int getMaxVal(int[][] vals) {
        int maxVal = vals[0][0];

        // finds the maximum value
        for (int row = 0; row < vals.length; row++) {
            for (int column = 0; column < vals[0].length; column++) {
                if (vals[row][column] > maxVal) {
                    maxVal = vals[row][column];
                }
            }
        }
        return maxVal;
    }

    // write a method called getMinVal that takes in a 2D array and iterates through the array to determine the min value in array
    public static int getMinVal(int[][] vals) {
        int minVal = vals[0][0];

        // finds the minimum value
        for (int[] arr : vals){
            for (int i : arr) {
                if (i < minVal) {
                    minVal = i;
                }
            }
        }
        return minVal;
    }
}