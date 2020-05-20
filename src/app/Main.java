package app;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EvenThread evenThread = new EvenThread();
        OddThread  oddThread  = new OddThread();

        oddThread.start();
        oddThread.join(11000);
        evenThread.start();
    }
}
