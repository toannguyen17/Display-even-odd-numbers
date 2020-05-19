package app;

public class Main {
    public static synchronized void show(int i) throws InterruptedException {
        while (i <= 10){
            System.out.println(i);
            i += 2;
            if (i%2 == 0){
                Thread.sleep(15);
            }else{
                Thread.sleep(10);
            }
        }
    }
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread  oddThread  = new OddThread();

        oddThread.start();
        evenThread.start();
    }
}
