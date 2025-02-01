package programs.collectionFramework.map.abstractMap.weakHashMap;

import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        // Create a WeakHashMap
        WeakHashMap<String, String> weakMap = new WeakHashMap<>();

        // Create some keys
        String key1 = "key1";
        String key2 = "key2";

        // Add entries to the WeakHashMap
        weakMap.put(key1, "value1");
        weakMap.put(key2, "value2");

        // Display the WeakHashMap contents before garbage collection
        System.out.println("Before garbage collection: " + weakMap);

        // Nullifying the strong reference to key1 and key2
        key1 = null;
        key2 = null;

        // Request garbage collection (not guaranteed to run immediately)
        System.gc();

        // Pause to allow GC to occur
        try {
            Thread.sleep(1000);  // wait for the garbage collector to run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the WeakHashMap contents after garbage collection
        System.out.println("After garbage collection: " + weakMap);
    }
}
