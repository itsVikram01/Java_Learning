package java.dsa.dataStructures.doublyLinkedList;

class DoublyLinkedList {
    private Node head;

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(10);
        dll.add(20);
        dll.add(30);

        dll.printForward();
        dll.printBackward();
    }

    // Add a node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Print the list from head to tail
    public void printForward() {
        Node current = head;
        System.out.println("Doubly Linked List (Forward):");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Print the list from tail to head
    public void printBackward() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        System.out.println("Doubly Linked List (Backward):");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    // Node class
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
}
