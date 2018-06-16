package part_04;



import java.util.Scanner;

/**
 The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
Keep all other members of the Stack class private.
 */

class Exercise_07{
    public static void main(String[] args) {

        // call Stack class constructor
        Stack exeStack = new Stack(52);

        // populate Stack in Stack class
        char val = 'A';
        for (int i = 0; i < 52; i++) {
            exeStack.push(val++);
        }

        // print current stack
        for (int i = 0; i < 52; i++) {
            char b = exeStack.pop();
            System.out.print(b+ " | ");
        }


    }
}

class Stack {

    // Stack variables
    private char q[];
    private int index;


    // Stack Constructor (filler)
    Stack(int size) {
        q = new char[size];
        index = 0;
    }

    // push() - sets plates down
    void push(char x) {
        if (index == q.length) {
            System.out.println("Queue is full.");
            return;
        }
       q[index++] = x;
    }

    // pop() - picks plate up
    char pop(){
        if (index == 0){
            System.out.println("Queue is empty");
            return 0;
        }
        return q[--index];
    }
}