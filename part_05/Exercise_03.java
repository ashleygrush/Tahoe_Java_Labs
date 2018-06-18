package part_05;

import java.sql.SQLOutput;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */

class One {
    public static void main(String[] args) {
        // instance of class two.
        Two two = new Two();

        System.out.println(two.divide(6,4)+ " multiply ints.");
        System.out.println(two.divide(6,4)+ " multiply mix int/double.");
        System.out.println(two.divide(6,4)+ " multiply doubles.");
    }
}

class Two {


    int divide(int a, int b) {
        int i = a / b;
        return i;
    }
    double divide(double a, double b) {
        double i = a / b;
        return i;
    }
    double divide( int a, double b) {
        double i = a / b;
        return i;
    }
}