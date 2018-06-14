package part_03;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task. For instance, create a
 main() method, a multiply(int a, int b) method, and a divide(int a, int b) method. From the main method call the
 multiply and divide methods (both of which return an int) then add the two returned values together and print them out.

 */

class MathProblem{
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = multiply(a,b);
        int d = divide(a, b);
                System.out.println((c + d) + " is the sum of " + c + " and " + d);
    }

     public static int multiply(int a, int b){
         int i = a * b;
         return i;
     }

     public static int divide(int a, int b){
         int j = a/b;
         return j;
     }
}
