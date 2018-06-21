package part_10.ThreadDemo;

public class RunnableClass implements Runnable {

    // RunnableClass Thread variable
    Thread thread;

    // Runnable constructor
    public  RunnableClass(String name) {

        // tell this class vs main Thread class.
        // this, is used to link to this thread = RunnableClass Thread (target)
        thread = new Thread(this, name);
        thread.start();
    }

    // must implement run()
    @Override
    public void run() {

    // do something
        for (int i = 0; i < 5; i++) {
            try {
                // pauses for 2,000 milliseconds before continuing
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName() + " is on count " + i);

        }
    }
}
