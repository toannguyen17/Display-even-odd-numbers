package app;

public class EvenThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        try {
            while (i <= 10){
                System.out.println(i);
                i += 2;
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
