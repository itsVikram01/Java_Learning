package programs.collectionFramework.map.interfacesExtendsMap.concurrentMap.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

/*The ThreadSafeCounter class provides a simplified API for incrementing and retrieving counts.
It hides the complexity of using ConcurrentHashMap's compute method, making it easier to use.*/
public class ThreadSafeCounter {
    private final ConcurrentHashMap<String, Integer> counters = new ConcurrentHashMap<>();

    public void increment(String key) {
        counters.compute(key, (k, v) -> (v == null) ? 1 : v + 1);
    }

    public int getCount(String key) {
        Integer count = counters.get(key);
        return count == null ? 0 : count;
    }
}
