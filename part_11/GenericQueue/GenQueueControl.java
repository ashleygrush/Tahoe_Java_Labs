package part_11.GenericQueue;

class GenQueueControl{
    public static void main(String[] args) {

        // call from FirstQueue Class
        GenericQueue<Integer> genQueue = new GenericQueue(100);

        // populate GenericQueue
        for (int i = 0; i < 100; i++) {
            genQueue.put(i);
        }

        // pull every other value from Generic Queue class
        for (int x = 0; x < 100; x++) {
            int a = genQueue.get();
            if (x % 2 == 0) {
                System.out.println(a+ " | ");
            }
        }
    }
}
