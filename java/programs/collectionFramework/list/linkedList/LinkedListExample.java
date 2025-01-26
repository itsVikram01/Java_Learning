package java.collectionFramework.list.linkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node middleNode = findMiddleNode(head);
        System.out.println("Middle node: " + middleNode.data);

        int maxElement = findMax(head);
        System.out.println("Maximum element: " + maxElement);

        int minElement = findMin(head);
        System.out.println("minimum element: " + minElement);

        double average = findAverage(head);
        System.out.println("Average value: " + average);
    }

    static Node findMiddleNode(Node head) {
        Node oneStep = head;
        Node twoStep = head;

        while (twoStep != null && twoStep.next != null) {
            oneStep = oneStep.next;
            twoStep = twoStep.next.next;
        }
        return oneStep;
    }

    static int findMax(Node head) {
        if (head == null) {
            return Integer.MIN_VALUE; // Or throw an exception
        }

        int max = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    static int findMin(Node head) {
        if (head == null) {
            return Integer.MAX_VALUE; // Or throw an exception
        }

        int min = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    static double findAverage(Node head) {
        if (head == null) {
            return 0.0; // Or throw an exception
        }

        int count = 0;
        int sum = 0;
        Node current = head;

        while (current != null) {
            count++;
            sum += current.data;
            current = current.next;
        }
        return (double) sum / count;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
