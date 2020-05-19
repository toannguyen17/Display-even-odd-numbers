package app;

public class OddThread extends Thread {
    @Override
    public void run() {
        try {
            Main.show(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
