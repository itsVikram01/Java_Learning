package java21.virtualThread_finalized;

// Virtual threads allow lightweight and scalable thread management, enabling high-concurrency applications.
/*public class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is running on " + Thread.currentThread());
                Thread.sleep(1000); // Simulates work
            });
        }

        executor.close(); // Properly close the executor
    }
}*/
