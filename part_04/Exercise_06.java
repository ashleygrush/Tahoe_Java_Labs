package part_04;


import java.util.Queue;

/**
 * Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 * it cannot be retrieved again) of integers 0 through 100. Then print out every other
 * value in the queue.
 * <p>
 * expected output: 0,2,4,6,8.....100
 */

class QueueController {
    public static void main(String[] args) {
        // call from FirstQueue Class
        FirstQueue secondQueue = new FirstQueue(100);

        // populate secondQueue (FirstQueue constructor in FirstQueue class)
        for (int i = 0; i < 100; i++) {
            secondQueue.put(i);
        }

        // pull every other value from FirstQueue class via secondQueue
        for (int x = 0; x < 100; x++) {
            int a = secondQueue.get();
            if (x % 2 == 0) {
                System.out.println(a+ " | ");
            }
        }

    }
}

// create queue class}
class FirstQueue {
    private int q[];
    private int putlocation, getlocation;

    // create the queue
    FirstQueue(int size) {
        q = new int[size];
        putlocation = getlocation = 0;
    }


    // fill queue
    void put(int val) {
        if (putlocation == q.length) {
            System.out.println(" -- Queue is full.");
            return;
        }
        q[putlocation++] = val;
    }


    // get character from queue
    int get() {
        if (getlocation == putlocation) {
            System.out.println(" -- Que is empty.");
            return 0;
        }
        return q[getlocation++];
    }
}
