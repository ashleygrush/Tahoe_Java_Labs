package part_10.RaceDemo;

public class RaceControl {
    public static void main(String[] args) {

        System.out.println("Race Begins in 3... 2... 1.  GO!");

        ExtThread t1 = new ExtThread("Ashley");
        ExtThread t2 = new ExtThread("Nami");
        ExtThread t3 = new ExtThread("Madoka");

        RunThread r1 = new RunThread("Ryan");
        RunThread r2 = new RunThread("Saulo");
        RunThread r3 = new RunThread("Duncan");

    }
}
