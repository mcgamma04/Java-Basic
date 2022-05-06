package mutithreading;

public class MyRunnable implements Runnable {

    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("h1 #" + i);

            try {
                Thread.sleep(2000);
                System.out.println(12/0);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());

            }
        }
        System.out.println("Thread hi finished ");
    }
}
