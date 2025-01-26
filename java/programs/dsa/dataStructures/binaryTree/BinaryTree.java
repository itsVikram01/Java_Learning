package java.dsa.dataStructures.binaryTree;

class BinaryTree {
    private Node root;

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createTree();
        System.out.println("In-order Traversal:");
        bt.inOrderTraversal(bt.root);
    }

    // Add a node (for simplicity, a manual insertion)
    public void createTree() {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
    }

    // In-order traversal
    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
