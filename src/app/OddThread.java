package app;

public class OddThread extends Thread {
    @Override
    public void run() {
        int i = 1;
        try {
            while (i <= 10){
                System.out.println(i);
                i += 2;
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
