package programs.multithreading.deadlock;

public class DeadlockExample {
    private final Object resource1 = new Object();
    private final Object resource2 = new Object();

    private void method1() {
        System.out.println("method1.........");
        // Locking resource1
        synchronized (resource1) {
            System.out.println(Thread.currentThread().getName() + " locked resource1");
            System.out.println("method1...synchronized (resource1)......");
            try {
                Thread.sleep(500); // Simulate some processing time
                System.out.println("method1...synchronized (resource1)...try...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // Attempting to lock resource2.
            // If another thread already holds resource2, the current thread will wait here.
            System.out.println(Thread.currentThread().getName() + " waiting for resource2");
            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " locked resource2");
                // Critical section: both resources are now locked.
                System.out.println("method1...synchronized (resource1)...synchronized (resource2)......");
            }
            // At this point, resource2 is automatically released when the inner block ends.
            System.out.println(Thread.currentThread().getName() + " released resource2");
        }
        // Here, resource1 is automatically released when the outer block ends.
        System.out.println(Thread.currentThread().getName() + " released resource1");
    }

    private void method2() {
        System.out.println("method2.........");
        // Locking resource2
        synchronized (resource2) {
            System.out.println("method2...synchronized (resource2)......");
            System.out.println(Thread.currentThread().getName() + " locked resource2");
            try {
                Thread.sleep(500); // Simulate some processing time
                System.out.println("method2...synchronized (resource2)...try...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // Attempting to lock resource1.
            // If another thread holds resource1, the current thread will wait here.
            System.out.println(Thread.currentThread().getName() + " waiting for resource1");
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " locked resource1");
                // Critical section: both resources are now locked.
                System.out.println("method2...synchronized (resource2)...synchronized (resource1)......");
            }
            // resource1 is released automatically when exiting the inner synchronized block.
            System.out.println(Thread.currentThread().getName() + " released resource1");
        }
        // resource2 is released automatically when exiting the outer synchronized block.
        System.out.println(Thread.currentThread().getName() + " released resource2");
    }



    private final Object resource3 = new Object();
    private final Object resource4 = new Object();

    // thread safe to avoid deadlock
    private void safeMethod1() {
        System.out.println("safeMethod1.........");
        // Locking resource1
        synchronized (resource3) {
            System.out.println(Thread.currentThread().getName() + " locked resource3");
            System.out.println("safeMethod1...synchronized (resource3)......");
            try {
                Thread.sleep(500); // Simulate some processing time
                System.out.println("safeMethod1...synchronized (resource3)...try...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // Attempting to lock resource4.
            // If another thread already holds resource4, the current thread will wait here.
            System.out.println(Thread.currentThread().getName() + " waiting for resource4");
            synchronized (resource4) {
                System.out.println(Thread.currentThread().getName() + " locked resource4");
                // Critical section: both resources are now locked.
                System.out.println("safeMethod1...synchronized (resource3)...synchronized (resource4)......");
            }
            // At this point, resource2 is automatically released when the inner block ends.
            System.out.println(Thread.currentThread().getName() + " released resource4");
        }
        // Here, resource1 is automatically released when the outer block ends.
        System.out.println(Thread.currentThread().getName() + " released resource3");
    }
    private void safeMethod2() {
        System.out.println("safeMethod2.........");
        // Acquire locks in the same order as safeMethod1 to avoid deadlock
        // Locking resource1
        synchronized (resource3) {
            System.out.println(Thread.currentThread().getName() + " locked resource3");
            System.out.println("safeMethod2...synchronized (resource3)......");
            try {
                Thread.sleep(500); // Simulate some processing time
                System.out.println("method3...synchronized (resource3)...try...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // Attempting to lock resource2.
            // If another thread holds resource2, the current thread will wait here.
            System.out.println(Thread.currentThread().getName() + " : Waiting for resource4");
            synchronized (resource4) {
                System.out.println(Thread.currentThread().getName() + " locked resource4");
                // Critical section: both resources are now locked.
                System.out.println("safeMethod2...synchronized (resource3)...synchronized (resource4)......");
            }
            // resource2 is released automatically when exiting the inner synchronized block.
            System.out.println(Thread.currentThread().getName() + " released resource4");
        }
        // resource1 is released automatically when exiting the outer synchronized block.
        System.out.println(Thread.currentThread().getName() + " released resource3");
    }


    public static void main(String[] args) {

        DeadlockExample example = new DeadlockExample();

        Thread thread1 = new Thread(() -> example.method1(), "Thread-1");
        Thread thread2 = new Thread(() -> example.method2(), "Thread-2");
        thread1.start();
        thread2.start();

        Thread safeThread1 = new Thread(() -> example.safeMethod1(), "Thread-3");
        Thread safeThread2 = new Thread(() -> example.safeMethod2(), "Thread-4");
        safeThread2.start();
        safeThread1.start();


        // Thread 1 to print even numbers
        System.out.println("Even no : ");
        Thread evenThread = new Thread(() -> {
            for (int i = 0; i <= 10; i += 2) {
                System.out.println(i);
            }
        });

        // Thread 2 to print odd numbers
        System.out.println("Odd no : ");
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 9; i += 2) {
                System.out.println(i);
            }
        });

        // Start the threads
        evenThread.start();
        oddThread.start();
    }

}
