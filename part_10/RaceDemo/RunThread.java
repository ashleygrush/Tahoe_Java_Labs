package part_10.RaceDemo;

public class RunThread implements Runnable {

    // implement thread
    Thread thread;

    // RunThread Constructor
    public RunThread(String name) {

        // implement thread to start()
        thread = new Thread(this, name);
        thread.start();
    }
    // run()
    @Override
    public void run() {

        // do something = lap
        for (int i = 1; i < 5; i++) {
            // sleep for awhile
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // lap results
            System.out.println(thread.getName() + " is on lap " + i);

        }
    }
}
