package programs.multithreading.synchronize;

public class SynchronizedExample {
    // MutualExclusionPriority : synchronized provides mutual exclusion (only one thread at a time in a critical section).
    private int sharedCounter = 0;

    public static void main(String[] args) throws InterruptedException {
        SynchronizedExample example = new SynchronizedExample();

        // Create multiple threads to increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                example.increment();
                System.out.println("t1 : " + example.getCounter());
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                example.increment();
                System.out.println("t2 : " + example.getCounter());
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final counter value: " + example.getCounter());
    }

    public synchronized void increment() {
        sharedCounter++;
    }

    public int getCounter() {
        return sharedCounter;
    }
}
