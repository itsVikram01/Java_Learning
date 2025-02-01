package programs.collectionFramework.list.linkedList;

public class LinkedListInternalImpl<E> {
    private Node<E> head; // First node of the LinkedList
    private Node<E> tail; // Last node of the LinkedList
    private int size; // Size of the LinkedList

    // Main method for testing
    public static void main(String[] args) {
        LinkedListInternalImpl<Integer> linkedList = new LinkedListInternalImpl<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("Initial LinkedList:");
        linkedList.printList(); // Output: 10 -> 20 -> 30 -> null

        linkedList.add(1, 15); // Add at index 1
        System.out.println("After adding 15 at index 1:");
        linkedList.printList(); // Output: 10 -> 15 -> 20 -> 30 -> null

        linkedList.remove(2); // Remove element at index 2
        System.out.println("After removing element at index 2:");
        linkedList.printList(); // Output: 10 -> 15 -> 30 -> null

        System.out.println("Element at index 1: " + linkedList.get(1)); // Output: 15
        System.out.println("Size of LinkedList: " + linkedList.size()); // Output: 3
    }

    // Adds an element to the end of the LinkedList
    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Adds an element at a specific position
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node<E> newNode = new Node<>(element);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            if (size == 0) {
                tail = newNode;
            }
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
        }
        size++;
    }

    // Removes an element from a specific position
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node<E> removedNode;
        if (index == 0) {
            removedNode = head;
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedNode = current.next;
            current.next = removedNode.next;
            if (current.next == null) {
                tail = current;
            }
        }

        size--;
        return removedNode.data;
    }

    // Retrieves an element at a specific position
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Returns the size of the LinkedList
    public int size() {
        return size;
    }

    // Prints the LinkedList elements
    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Node class represents an individual element in the LinkedList
    private static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}