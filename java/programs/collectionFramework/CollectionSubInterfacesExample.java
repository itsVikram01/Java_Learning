package java.collectionFramework;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CollectionSubInterfacesExample {
    public static void main(String[] args) {

        // List (ArrayList) - Ordered collection, duplicates allowed
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(5);
        numbersList.add(15);
        numbersList.add(5); // Duplicates allowed

        System.out.println("Numbers List (ArrayList): " + numbersList); // [10, 5, 15, 5]

        // List (LinkedList) - Doubly-linked list, efficient for insertions/removals at any position
        List<String> colorsList = new LinkedList<>();
        colorsList.add("Red");
        colorsList.add(0, "Green"); // Efficient insertion at index 0
        colorsList.add("Blue");

        System.out.println("Colors List (LinkedList): " + colorsList); // [Green, Red, Blue]

        // List (Vector) - Thread-safe version of ArrayList (mostly legacy, use ArrayList for new code)
        List<Integer> agesList = new Vector<>();
        agesList.add(25);
        agesList.add(30);
        agesList.add(20);

        System.out.println("Ages List (Vector): " + agesList); // [25, 30, 20]

        // List (Stack) - LIFO (Last-In-First-Out) order for element access (consider using Deque for more flexibility)
        Stack<String> booksStack = new Stack<>();
        booksStack.push("Java for Beginners");
        booksStack.push("Data Structures and Algorithms");
        booksStack.push("Software Design Patterns");

        System.out.println("Books Stack: " + booksStack); // [Software Design Patterns, Data Structures and Algorithms, Java for Beginners] (top element first)


        // Queue (PriorityQueue) - Elements prioritized based on natural ordering or comparator (default: min heap)
        Queue<String> tasksQueue = new PriorityQueue<>();
        tasksQueue.offer("High priority task");
        tasksQueue.offer("Normal priority task");
        tasksQueue.offer("Urgent task"); // Urgent task will be processed first

        System.out.println("Tasks Queue (PriorityQueue): " + tasksQueue); // [Urgent task, High priority task, Normal priority task] (order based on priority)

        // Queue (LinkedList) - Can also be used as a Queue (FIFO - First-In-First-Out)
        Queue<Integer> numbersQueue = new LinkedList<>();
        numbersQueue.offer(1);
        numbersQueue.offer(3);
        numbersQueue.offer(2);

        System.out.println("Numbers Queue (LinkedList): " + numbersQueue); // [1, 3, 2] (FIFO order)

        // Queue (ArrayDeque) - Array-based Deque, efficient for adding/removing from both ends
        Queue<Character> charsQueue = new ArrayDeque<>();
        charsQueue.add('A');
        charsQueue.add('B');
        charsQueue.add('C');

        System.out.println("Characters Queue (ArrayDeque): " + charsQueue); // [A, B, C] (FIFO order)

        // Queue (ConcurrentLinkedQueue) - Thread-safe Queue implementation
        Queue<String> tasksQueues = new ConcurrentLinkedQueue<>();
        tasksQueues.offer("Task 1");
        tasksQueues.offer("Task 2");
        tasksQueues.offer("Task 3");

        System.out.println("Tasks Queue (ConcurrentLinkedQueue): " + tasksQueues); // [Task 1, Task 2, Task 3] (FIFO order, thread-safe)

        // Deque (LinkedList) - Can add/remove from both ends efficiently (also implements List)
        Deque<Character> charactersDeque = new LinkedList<>();
        charactersDeque.addLast('A');
        charactersDeque.addFirst('B');
        charactersDeque.addLast('C');

        System.out.println("Characters Deque (LinkedList): " + charactersDeque); // [B, A, C]


        // Set (HashSet) - Unique elements, no order
        Set<String> fruitsSet = new HashSet<>();
        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Orange");
        //fruitsSet.add("Orange"); // Duplicate won't be added

        System.out.println("Fruits Set (HashSet): " + fruitsSet); // [Apple, Banana, Orange] (order may vary)

        // Set (LinkedHashSet) - Remembers insertion order while maintaining uniqueness
        Set<String> fruitsSets = new LinkedHashSet<>();
        fruitsSets.add("Apple");
        fruitsSets.add("Banana");
        fruitsSets.add("Orange");
        fruitsSets.add("Orange"); // Duplicate won't be added

        System.out.println("Fruits Set (LinkedHashSet): " + fruitsSets); // [Apple, Banana, Orange] (maintains insertion order)

        // Set (TreeSet) - Sorted set based on natural ordering or comparator
        Set<Integer> numbersSet = new TreeSet<>();
        numbersSet.add(10);
        numbersSet.add(5);
        numbersSet.add(15);
        numbersSet.add(5); // Duplicates won't be added (as it's a Set)

        System.out.println("Numbers Set (TreeSet): " + numbersSet); // [5, 10, 15] (sorted in ascending order)


        // Map (HashMap) - Key-value pairs, unique keys
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 95); // Overwrites existing key "Charlie"

        System.out.println("Student Grades (HashMap): " + studentGrades); // {Alice=90, Bob=85, Charlie=95}

        // Map (LinkedHashMap) - Maintains insertion order for key-value pairs
        Map<String, String> countriesMap = new LinkedHashMap<>();
        countriesMap.put("India", "New Delhi");
        countriesMap.put("China", "Beijing");
        countriesMap.put("Brazil", "Brasilia");

        System.out.println("Countries Map (LinkedHashMap): " + countriesMap); // {India=New Delhi, China=Beijing, Brazil=Brasilia} (maintains insertion order)

        // Map (TreeMap) - Sorted map based on natural ordering or comparator for keys
        Map<Integer, String> studentAgesMap = new TreeMap<>();
        studentAgesMap.put(18, "Alice");
        studentAgesMap.put(20, "Bob");
        studentAgesMap.put(19, "Charlie");

        System.out.println("Student Ages Map (TreeMap): " + studentAgesMap); // {18=Alice, 19=Charlie, 20=Bob} (sorted by key in ascending order)

        // Map (ConcurrentHashMap) - Thread-safe implementation of HashMap
        Map<String, Double> employeeSalariesMap = new ConcurrentHashMap<>();
        employeeSalariesMap.put("Alice", 85000.0);
        employeeSalariesMap.put("Bob", 90000.0);
        employeeSalariesMap.put("Charlie", 78000.0);

        System.out.println("Employee Salaries Map (ConcurrentHashMap): " + employeeSalariesMap); // {Alice=85000.0, Bob=90000.0, Charlie=78000.0} (thread-safe)

        // Map (HashTable) - Legacy thread-safe implementation (less efficient than ConcurrentHashMap, use ConcurrentHashMap for new code)
        Map<String, String> coursesMap = new Hashtable<>();
        coursesMap.put("Java", "Introduction to Java Programming");
        coursesMap.put("Python", "Python for Beginners");
        coursesMap.put("C++", "Fundamentals of C++");

        System.out.println("Courses Map (HashTable): " + coursesMap); // {Java=Introduction to Java Programming, Python=Python for Beginners, C++=Fundamentals of C++} (thread-safe, legacy)

        // Map (IdentityHashMap) - Uses object identity for comparisons (reference equality)
        Map<Object, String> studentsMap = new IdentityHashMap<>();
        /*Student student1 = new Student("Alice", 18);
        Student student2 = new Student("Bob", 20);*/
        Object student1 = new Object();
        Object student2 = new Object();
        Object student3 = student1; // Same object as student1

        studentsMap.put(student1, "Java");
        studentsMap.put(student2, "Python");
        studentsMap.put(student3, "C++"); // Will overwrite the entry for student1 since they refer to the same object

        System.out.println("Students Map (IdentityHashMap): " + studentsMap); // {Student(name=Alice, age=18)=Java, Student(name=Bob, age=20)=Python} (uses reference equality)

        // Map (EnumMap) - Compact map specifically designed for enum keys
        enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY}

        Map<Day, String> weekdaysMap = new EnumMap<>(Day.class);
        weekdaysMap.put(Day.MONDAY, "Monday Motivation");
        weekdaysMap.put(Day.WEDNESDAY, "Hump Day!");
        weekdaysMap.put(Day.FRIDAY, "TGIF!"); // Only enum values of Day can be used as keys

        System.out.println("Weekdays Map (EnumMap): " + weekdaysMap); // {MONDAY=Monday Motivation, WEDNESDAY=Hump Day!, FRIDAY=TGIF!}


    }
}
