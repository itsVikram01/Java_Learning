package programs.dsa.dataStructures.avlTree;

class AVLTree {
    private Node root;

    public static void main(String[] args) {
        AVLTree avl = new AVLTree();
        avl.add(10);
        avl.add(20);
        avl.add(30);
        avl.add(40);
        avl.add(50);
        avl.add(25);

        System.out.println("In-order Traversal:");
        avl.inOrderTraversal(avl.root);
    }

    // Get the height of a node
    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    // Get balance factor
    private int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Right rotate
    private Node rotateRight(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotate
    private Node rotateLeft(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert a node
    public Node insert(Node node, int data) {
        if (node == null) return new Node(data);

        if (data < node.data) node.left = insert(node.left, data);
        else if (data > node.data) node.right = insert(node.right, data);
        else return node; // Duplicates not allowed

        // Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Get balance factor
        int balance = getBalance(node);

        // Balance the tree
        if (balance > 1 && data < node.left.data) return rotateRight(node);
        if (balance < -1 && data > node.right.data) return rotateLeft(node);
        if (balance > 1 && data > node.left.data) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if (balance < -1 && data < node.right.data) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void add(int data) {
        root = insert(root, data);
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
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.height = 1; // New node is initially at height 1
        }
    }
}
