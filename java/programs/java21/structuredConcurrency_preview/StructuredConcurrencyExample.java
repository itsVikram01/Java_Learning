package programs.java21.structuredConcurrency_preview;

/*import java.util.concurrent.*;
import jdk.incubator.concurrent.StructuredTaskScope;

public class StructuredConcurrencyExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            Future<String> task1 = scope.fork(() -> {
                Thread.sleep(1000);
                return "Result from Task 1";
            });

            Future<String> task2 = scope.fork(() -> "Result from Task 2");

            scope.join(); // Wait for all tasks
            scope.throwIfFailed();

            System.out.println(task1.resultNow());
            System.out.println(task2.resultNow());
        }
    }
}*/


// Simplifies managing concurrent tasks by grouping them into a structured task lifecycle.