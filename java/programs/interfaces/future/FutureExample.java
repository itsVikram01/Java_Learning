package programs.interfaces.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> {
            // Simulate a long-running task
            Thread.sleep(2000);
            return "Task completed";
        });

        // Do other work while the task is running

        System.out.println("Waiting for result...");
        String result = future.get();
        System.out.println("Result: " + result);

        executor.shutdown();
    }
}