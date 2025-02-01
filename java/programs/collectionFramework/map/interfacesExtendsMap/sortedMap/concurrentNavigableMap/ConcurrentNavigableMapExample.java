package programs.collectionFramework.map.interfacesExtendsMap.sortedMap.concurrentNavigableMap;

import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentNavigableMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentNavigableMap using ConcurrentSkipListMap
        ConcurrentNavigableMap<Integer, String> map = new ConcurrentSkipListMap<>();

        // Adding key-value pairs to the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        // Display the entire map
        System.out.println("ConcurrentNavigableMap: " + map);

        // Navigating through the map using methods from NavigableMap
        System.out.println("First entry: " + map.firstEntry());
        System.out.println("Last entry: " + map.lastEntry());
        System.out.println("Entry higher than 2: " + map.higherEntry(2));
        System.out.println("Entry lower than 3: " + map.lowerEntry(3));
        System.out.println("Ceiling entry for 3: " + map.ceilingEntry(3));
        System.out.println("Floor entry for 2: " + map.floorEntry(2));

        // Navigating using submaps
        System.out.println("Submap from 2 (inclusive) to 4 (exclusive): " + map.subMap(2, true, 4, false));

        // Removing an entry
        map.remove(4);
        System.out.println("After removing entry 4: " + map);
    }
}
