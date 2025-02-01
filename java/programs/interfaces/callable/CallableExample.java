package programs.interfaces.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        FactorialTask task = new FactorialTask(5);
        Future<Integer> result = executor.submit(task);
        System.out.println("Factorial of 5 is: " + result.get());
        executor.shutdown();
    }
}