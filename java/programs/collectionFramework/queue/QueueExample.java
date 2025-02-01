package programs.collectionFramework.queue;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueExample {
    public static void main(String[] args) {

        // Queue (PriorityQueue) - Elements prioritized based on natural ordering or comparator (default: min heap)
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("High priority task");
        queue.offer("Normal priority task");
        queue.offer("Urgent task"); // Urgent task will be processed first

        System.out.println("Tasks Queue (PriorityQueue): " + queue); // [Urgent task, High priority task, Normal priority task] (order based on priority)

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

    }
}
