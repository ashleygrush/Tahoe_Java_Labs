package part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */

class Years {
    public static void main(String[] args) {

     int yearsArray[] = new int[2018];
    // count to 2017
     for ( int counter = 0; counter < yearsArray.length; counter++){
         yearsArray[counter] = counter;
         System.out.println(yearsArray[counter]);
     }
        System.out.println(" ----------- line break ------------- ");
        // print odd numbers
     for (int i = yearsArray.length-1 ; i > 1; i--) {
         if (yearsArray[i] % 2 == 0) {
             System.out.println(yearsArray[i]);
         }
     }

    }
}