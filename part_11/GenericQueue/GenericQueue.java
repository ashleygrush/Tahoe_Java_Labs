//package part_11.GenericQueue;
//
//class GenericQueue<T> {
//
//    // queue variables
//    T[] vals;
//    int putLoc, getLoc;
//
//    // build queue
//    public GenericQueue(int sizeQ) {
//        vals = (T[]) new Object[sizeQ];
//        putLoc = getLoc = 0;
//    }
//
//    // fill queue
//    void put(T e) {
//        if (putLoc = vals.length) {
//            return;
//        }
//        vals[putLoc++] = e;
//    }
//
//    // pull from queue
//    public T[] get() {
//        if (getLoc = putLoc) {
//            return 0;
//        }
//        return vals[Object++];
//    }
//}
