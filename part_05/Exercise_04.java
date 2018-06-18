package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */

class Uno {
    public static void main(String[] args) {
        Dos dosClass = new Dos();

        System.out.println(dosClass.multiply(2,4)+ " Ints");
        System.out.println(dosClass.multiply(2,4.2)+ " Doubles");
        System.out.println(dosClass.multiply(2.2,4.2)+ " Mix");
    }
}

class Dos {
    private int a;
    private double b;
    private double c;

    // int overload (i) > a
    int multiply(int a, int b) {
        int i = a * b;
        return i;
    }

    // double overload (j) > b
    double multiply(double a, double b) {
        double j = a * b;
        return j;
    }

    // mix int/double overload (k) > c
    double multiply(int a, double b) {
        double k = a * b;
        return k;
    }
}