package part_08;

// Add custom exceptions to your class that report stack full and stack empty conditions.

class StackControl {
    public static void main(String[] args) {

        // call Stack class constructor
        Stack_02 exeStack = new Stack_02(52);

        // populate Stack in Stack class
        char val = 'A';
        for (int i = 0; i < 52; i++) {
            exeStack.push(val++);
        }

        // print current stack
        for (int i = 0; i < 52; i++) {
            char b = exeStack.pop();
            System.out.print(b + " | ");
        }


    }
}

class Stack_02 extends Exception {

    // Stack variables
    private char q[];
    private int index;


    // Stack Constructor (filler)
    Stack_02(int size) {
        q = new char[size];
        index = 0;
    }

    // push() - sets plates down
    void push(char x) {
        try {
            if (index == q.length) {
                return;
            }
        } catch (Exception d) {
            System.out.println(d + "The que is full.");
        }

        q[index++] = x;
    }


    // pop() - picks plate up
    char pop() {
        try {
            if (index == 0) {
                return 0;
            }
        } catch (Exception e) {
            System.out.println(e + "The queue is empty");
        }return q[--index];
    }
}
