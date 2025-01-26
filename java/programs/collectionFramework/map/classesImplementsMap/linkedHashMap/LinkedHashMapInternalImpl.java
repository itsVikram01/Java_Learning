package java.collectionFramework.map.classesImplementsMap.linkedHashMap;

public class LinkedHashMapInternalImpl<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private final Entry<K, V>[] table; // Hash table
    private Entry<K, V> head;
    private Entry<K, V> tail;
    private int size;
    @SuppressWarnings("unchecked")
    public LinkedHashMapInternalImpl() {
        table = new Entry[INITIAL_CAPACITY];
        size = 0;
    }

    public static void main(String[] args) {
        LinkedHashMapInternalImpl<String, Integer> linkedHashMap = new LinkedHashMapInternalImpl<>();
        linkedHashMap.put("apple", 1);
        linkedHashMap.put("banana", 2);
        linkedHashMap.put("cherry", 3);
        linkedHashMap.put("date", 4);

        System.out.println("Insertion order:");
        linkedHashMap.printInsertionOrder(); // Output: [apple=1] [banana=2] [cherry=3] [date=4]

        System.out.println("Get value for 'banana': " + linkedHashMap.get("banana")); // Output: 2
        System.out.println("Removing 'cherry': " + linkedHashMap.remove("cherry")); // Output: 3

        System.out.println("After removal:");
        linkedHashMap.printInsertionOrder(); // Output: [apple=1] [banana=2] [date=4]

        System.out.println("Size: " + linkedHashMap.size()); // Output: 3
    }

    private int hash(K key) {
        return key == null ? 0 : key.hashCode();
    }

    private boolean keysAreEqual(K key1, K key2) {
        return key1 == null && key2 == null || key1 != null && key1.equals(key2);
    }

    public void put(K key, V value) {
        int hash = hash(key);
        int index = hash & (table.length - 1);

        // Insert into hash table (chaining for collision resolution)
        Entry<K, V> existing = table[index];
        while (existing != null) {
            if (keysAreEqual(existing.key, key)) {
                existing.value = value; // Update value if key exists
                return;
            }
            existing = existing.next;
        }

        // Create new entry and add it to the hash table
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = table[index];
        table[index] = newEntry;

        // Maintain insertion order in the doubly linked list
        if (head == null) {
            head = tail = newEntry; // First element
        } else {
            tail.after = newEntry;
            newEntry.before = tail;
            tail = newEntry;
        }

        size++;
    }

    public V get(K key) {
        int hash = hash(key);
        int index = hash & (table.length - 1);

        Entry<K, V> current = table[index];
        while (current != null) {
            if (keysAreEqual(current.key, key)) {
                return current.value;
            }
            current = current.next;
        }
        return null; // Key not found
    }

    public V remove(K key) {
        int hash = hash(key);
        int index = hash & (table.length - 1);

        // Remove from hash table
        Entry<K, V> current = table[index];
        Entry<K, V> previous = null;

        while (current != null) {
            if (keysAreEqual(current.key, key)) {
                if (previous == null) {
                    table[index] = current.next; // Remove head of chain
                } else {
                    previous.next = current.next; // Bypass the current entry
                }

                // Remove from doubly linked list
                if (current.before != null) {
                    current.before.after = current.after;
                } else {
                    head = current.after; // Removing head of the list
                }

                if (current.after != null) {
                    current.after.before = current.before;
                } else {
                    tail = current.before; // Removing tail of the list
                }

                size--;
                return current.value;
            }

            previous = current;
            current = current.next;
        }

        return null; // Key not found
    }

    public void printInsertionOrder() {
        Entry<K, V> current = head;
        while (current != null) {
            System.out.print("[" + current.key + "=" + current.value + "] ");
            current = current.after;
        }
        System.out.println();
    }

    public int size() {
        return size;
    }

    // Entry class for LinkedHashMap (extends HashMap Entry concept)
    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next; // For chaining (hash bucket)
        Entry<K, V> before, after; // For maintaining insertion order

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
