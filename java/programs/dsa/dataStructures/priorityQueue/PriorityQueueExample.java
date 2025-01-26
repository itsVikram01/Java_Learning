package java.dsa.dataStructures.priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(10);
        pq.offer(20);
        pq.offer(5);
        pq.offer(15);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
