package part_10.ThreadDemo;

class ThreadClass extends Thread {

    // ThreadClass Constructor
    public ThreadClass(String name) {

        // calls Thread super class)
        super(name);

        // Thread class/object calls your run() after you call start()
        // can also "start" from Controller since it extends Thread
        start();
    }

    // whatever is in the run() is what will execute on the thread
    @Override // Override not needed; just need void run.
    public void run() {

        // loop that counts up to 5; sleeps on each loop
        for (int i = 0; i < 5; i++) {
            try {
                // pauses for 2,000 milliseconds before continuing
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " is on count " + i);

        }
        // demonstrates calling another method from within run().
        example(getName());
    }

     // just to demonstrate that not all of your code must be inside the run method.
    public void example(String name) {
            System.out.println("example " + name);

    }
}
