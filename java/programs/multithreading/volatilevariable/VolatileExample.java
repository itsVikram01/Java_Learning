package programs.multithreading.volatilevariable;

public class VolatileExample {
    // VisibilityPriority : volatile ensures visibility without locking.
    private volatile boolean stopFlag = false;

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();

        // Thread 1: Sets the stop flag
        Thread t1 = new Thread(() -> {
            //example.stop();
            if (example.isStopped()) {
                System.out.println("t1 is stopped : " + example.isStopped());
            } else {
                System.out.println("t1 is running : " + example.isStopped());
            }
        });

        // Thread 2: Checks the stop flag
        Thread t2 = new Thread(() -> {
            if (example.isStopped()) {
                System.out.println("t2 is stopped : " + example.isStopped());
            } else {
                System.out.println("t2 is running : " + example.isStopped());
            }
        });

        t1.start();
        t2.start();
    }

    public void stop() {
        stopFlag = true;
    }

    public boolean isStopped() {
        return stopFlag;
    }
}
