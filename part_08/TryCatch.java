package part_08;

    //   Write a class with at least one method that uses a try/catch statement. Make sure the catch block is executed, ie
    //   generate an error an catch it in the catch block.

class TryCatch {
    public static void main(String args[]) {

        int array[] = new int[4];
        try {
            array[5] = 10;
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
        }
    }
}