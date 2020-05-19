package app;

public class EvenThread extends Thread {
    @Override
    public void run() {
        try {
            Main.show(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
