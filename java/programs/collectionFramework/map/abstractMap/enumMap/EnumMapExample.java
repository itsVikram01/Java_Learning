package programs.collectionFramework.map.abstractMap.enumMap;

import java.util.EnumMap;

enum Fruit {
    APPLE, BANANA, CHERRY, DATE
}

public class EnumMapExample {
    public static void main(String[] args) {
        // Create an EnumMap with Enum as the key type
        EnumMap<Fruit, String> map = new EnumMap<>(Fruit.class);

        // Adding key-value pairs to the map
        map.put(Fruit.APPLE, "Red");
        map.put(Fruit.BANANA, "Yellow");
        map.put(Fruit.CHERRY, "Red");
        map.put(Fruit.DATE, "Brown");

        // Display the map
        System.out.println("EnumMap: " + map);

        // Retrieve a value using a key
        System.out.println("Color of Banana: " + map.get(Fruit.BANANA));

        // Check if the map contains a specific key
        System.out.println("Contains key CHERRY? " + map.containsKey(Fruit.CHERRY));

        // Check if the map contains a specific value
        System.out.println("Contains value 'Red'? " + map.containsValue("Red"));

        // Remove an entry
        map.remove(Fruit.DATE);
        System.out.println("After removing key DATE: " + map);

        // Display the size of the map
        System.out.println("Size of the map: " + map.size());

        // Iterating through the EnumMap
        System.out.println("Iterating through EnumMap:");
        for (Fruit key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
