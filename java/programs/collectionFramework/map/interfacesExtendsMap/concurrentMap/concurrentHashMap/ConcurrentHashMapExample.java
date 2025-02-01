package programs.collectionFramework.map.interfacesExtendsMap.concurrentMap.concurrentHashMap;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("apple", 10);
        concurrentHashMap.put("banana", 20);
        concurrentHashMap.put("orange", 30);

        // Retrieving a value
        int appleCount = concurrentHashMap.get("apple");
        System.out.println("Apple count: " + appleCount);

        // Removing an element
        concurrentHashMap.remove("banana");

        // Iterating over the map (not thread-safe using for loop)
        /*for (String key : concurrentHashMap.keySet()) {
            System.out.println(key + ": " + concurrentHashMap.get(key));
        }*/

        /*thread-safe using forEach loop*/
        concurrentHashMap.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
        // OR
        Set<String> keys = new HashSet<>(concurrentHashMap.keySet());
        for (String key : keys) {
            System.out.println(key + ": " + concurrentHashMap.get(key));
        }

        /* ConcurrentModificationException: Iterating over the map while it's being modified by other threads can lead to this exception.*/
        // Incrementing a counter concurrently
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                concurrentHashMap.compute("counter", (k, v) -> (v == null) ? 1 : v + 1);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                concurrentHashMap.compute("counter", (k, v) -> (v == null) ? 1 : v + 1);
            }
        });
        /*ThreadSafeCounter counter = new ThreadSafeCounter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment("count");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment("count");
            }
        });*/
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int finalCount = concurrentHashMap.getOrDefault("counter", 0);
        System.out.println("Final count: " + finalCount);

    }
}
