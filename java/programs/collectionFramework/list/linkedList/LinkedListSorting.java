/*
package collectionFramework.list.linkedList;

public class LinkedListSorting {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node bubbleSort = bubbleSort(head);
        System.out.println("bubbleSort data: " + bubbleSort.data);

        Node insertionSort = insertionSort(head);
        System.out.println("insertionSort data: " + insertionSort.data);

        Node mergeSort = mergeSort(head);
        System.out.println("mergeSort data: " + mergeSort.data);
    }

    */
/*1. Bubble Sort*//*

    static Node bubbleSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        boolean swapped;
        Node curr;

        do {
            swapped = false;
            curr = head;

            while (curr.next != null) {
                if (curr.data > curr.next.data) {
                    // Swap data
                    int temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;
                    swapped = true;
                }
                curr = curr.next;
            }
        } while (swapped);
        return head;
    }

    */
/*2. Insertion Sort*//*

    static Node insertionSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node sorted = head;
        Node current = head.next;
        sorted.next = null;

        while (current != null) {
            Node next = current.next;
            Node sortedPtr = sorted;

            while (sortedPtr != null && sortedPtr.data < current.data) {
                sortedPtr = sortedPtr.next;
            }

            if (sortedPtr == null) {
                sorted.next = current;
            } else {
                current.next = sortedPtr.next;
                sortedPtr.next = current;
            }

            current = next;
        }
        return sorted;
    }

    */
/*3. Merge Sort*//*

    static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMiddle(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    // Helper function to get the middle node
    static Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Helper function to merge two sorted lists
    static Node merge(Node left, Node right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        Node result;
        if (left.data <= right.data) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }
        return result;
    }
}
*/
