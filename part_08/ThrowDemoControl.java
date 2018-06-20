package part_08;

class ThrowDemoControl {
    public static void main(String[] args) {

        ThrowDemo demo = new ThrowDemo();
        System.out.println(demo.divide(4,0));

    }
}

class ThrowDemo extends Exception {

    public int divide ( int a, int b) {
        try {
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println("Exceptpion : " + e);
        } return 1;
    }
}

