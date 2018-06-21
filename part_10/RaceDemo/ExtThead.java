package part_10.RaceDemo;

class ExtThread extends Thread {

    // ExtThread Constructor
    public ExtThread (String name){
        // because it extends Thread, start() works out the gate.
        super(name);
        // start
        start();
        }

        // run()
    @Override
    public void run() {
        super.run();

        // do something = lap
        for (int i = 1; i < 5; i++) {
            // sleep for awhile
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // lap results
            System.out.println(getName()+ " is on lap " +i);
        }
    }
}
