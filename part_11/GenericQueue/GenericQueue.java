package part_11.GenericQueue;

class GenericQueue<T> {

    // queue variables
    T[] vals;
    int putLoc, getLoc;

    // build queue
    public GenericQueue(int sizeQ) {
        vals = (T[]) new Object[sizeQ];
        putLoc = getLoc = 0;
    }

    // fill queue
    void put(T e) {
        // check if full
        if (putLoc == vals.length) {
            return;
        }
        // filling queue
        vals[putLoc++] = e;
    }

    // pull from queue
    public T get() {
        // check if empty
        if (getLoc == putLoc) {
            return null;
        }
        // pulling from queue
        return vals[getLoc++];
    }
}
