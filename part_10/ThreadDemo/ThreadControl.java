package part_10.ThreadDemo;

public class ThreadControl {

    public static void main(String[] args) {


        System.out.println("Starting main thread...");

        ThreadClass t1 = new ThreadClass("Thread 1");
        ThreadClass t2 = new ThreadClass("Thread 2");
        ThreadClass t3 = new ThreadClass("Thread 3");

        RunnableClass r1 = new RunnableClass("Runner 1");

        // joining threads together.
        // notice, "main thread complete" below will not execute until the threads are joined.
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("Main thread complete.");

    }
}
