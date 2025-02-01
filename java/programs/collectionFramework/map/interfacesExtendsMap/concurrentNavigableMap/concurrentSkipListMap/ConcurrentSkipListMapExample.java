package programs.collectionFramework.map.interfacesExtendsMap.concurrentNavigableMap.concurrentSkipListMap;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentSkipListMap
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();

        // Adding key-value pairs to the map
        map.put(1, "Apple");
        map.put(3, "Banana");
        map.put(2, "Cherry");
        map.put(4, "Date");

        // Display the entire map
        System.out.println("ConcurrentSkipListMap: " + map);

        // Retrieve values using keys
        System.out.println("Value for key 3: " + map.get(3));
        System.out.println("Value for key 1: " + map.get(1));

        // Navigate through the map
        System.out.println("First entry: " + map.firstEntry());
        System.out.println("Last entry: " + map.lastEntry());
        System.out.println("Entry higher than 2: " + map.higherEntry(2));
        System.out.println("Entry lower than 3: " + map.lowerEntry(3));

        // Navigating using submaps
        System.out.println("Submap from 2 (inclusive) to 4 (exclusive): " + map.subMap(2, true, 4, false));

        // Remove an entry from the map
        map.remove(4);
        System.out.println("After removing key 4: " + map);

        // Display size of the map
        System.out.println("Size of the map: " + map.size());

        // Checking if map contains a certain key or value
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));
    }
}

