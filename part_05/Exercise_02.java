package part_05;

import java.util.Scanner;

/**
 * Write two classes.
 * In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance to a method_01 within Class_01.
 * <p>
 * Within method_01 you ust manipulate several private instance variables within Class_02.
 * Then, from within method_01, pass the instance of Class_02 to a new method, method_02.
 * <p>
 * Within method_02 modify the instance variables of Class_02 once again.
 * Use System.out.println at various points to demonstrate the flow of execution and the varying state of each private variable.
 * <p>
 * You can name these classes whatever you want.
 */


// Person Control - class 1
class Speaking {
    public static void main(String[] args) {

        Person max = new Person();

        System.out.println("Name : " +Person.nameProfile());
        System.out.println("Age: " +Person.ageProfile());
    }
    // enter age
    static int personAge(){
        int a = 30;
        return a;
    }
    static String personName(){
        String b = "Max";
        return b;
    }
}

class Person {
    // class two instance variables
    private String first_name = nameProfile();
    private int age = ageProfile();

    // update name
    static String nameProfile(){
        String n = Speaking.personName();
        return n;
    }

    // change age profile
    static int ageProfile(){
        int i = Speaking.personAge();
        return i;



    }
}


