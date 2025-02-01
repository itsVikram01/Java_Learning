package programs.collectionFramework.map.interfacesExtendsMap.sortedMap.navigableMap.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding key-value pairs to the map
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(4, "Cherry");
        map.put(2, "Date");

        // Display the entire map
        System.out.println("TreeMap: " + map);

        // Retrieve values using keys
        System.out.println("Value for key 3: " + map.get(3));

        // Getting the first (lowest) and last (highest) entries
        System.out.println("First entry: " + map.firstEntry());
        System.out.println("Last entry: " + map.lastEntry());

        // Getting the first (lowest) and last (highest) keys
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        // Getting a portion of the map (submap)
        System.out.println("Submap from 2 (inclusive) to 4 (inclusive): " + map.subMap(2, true, 4, true));

        // Checking if a key exists
        System.out.println("Contains key 2? " + map.containsKey(2));

        // Checking if a value exists
        System.out.println("Contains value 'Apple'? " + map.containsValue("Apple"));

        // Remove an entry from the map
        map.remove(4);
        System.out.println("After removing key 4: " + map);

        // Display size of the map
        System.out.println("Size of the map: " + map.size());

        // Navigating through the map using iterators
        System.out.println("Iterating through the TreeMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
