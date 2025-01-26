package java.dsa.dataStructures.circularLinkedList;

class CircularLinkedList {
    private Node head;

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.add(10);
        cll.add(20);
        cll.add(30);

        cll.printList();
    }

    // Add a node to the circular linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Point to itself
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    // Print the circular linked list
    public void printList() {
        if (head == null) return;

        Node current = head;
        System.out.println("Circular Linked List:");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head)");
    }

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
