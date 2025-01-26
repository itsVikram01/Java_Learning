package java.dsa.algorithms.tree.avlTreeBalancing;

class AVLTreeBalancing {
    // Get the height of a node
    public static int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    // Calculate the balance factor of a node
    public static int getBalance(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    // Perform a right rotation
    public static Node rotateRight(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x; // Return new root
    }

    // Perform a left rotation
    public static Node rotateLeft(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y; // Return new root
    }

    // Insert a node into the AVL tree and balance it
    public static Node insert(Node node, int key) {
        // Perform standard BST insertion
        if (node == null) return new Node(key);
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            // Duplicate keys not allowed
            return node;
        }

        // Update height of this node
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        // Get the balance factor to check for imbalance
        int balance = getBalance(node);

        // Perform rotations to balance the tree

        // Left-Left (LL) Case
        if (balance > 1 && key < node.left.key) {
            return rotateRight(node);
        }

        // Right-Right (RR) Case
        if (balance < -1 && key > node.right.key) {
            return rotateLeft(node);
        }

        // Left-Right (LR) Case
        if (balance > 1 && key > node.left.key) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // Right-Left (RL) Case
        if (balance < -1 && key < node.right.key) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node; // Return the (unchanged) node pointer
    }

    // In-order traversal of the tree
    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }

    // Main method to test the AVL Tree
    public static void main(String[] args) {
        Node root = null;

        // Insert nodes
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        // Print in-order traversal (sorted order)
        System.out.println("In-order traversal of the AVL tree:");
        inOrder(root);
    }

    static class Node {
        int key, height;
        Node left, right;

        Node(int key) {
            this.key = key;
            height = 1; // Initial height is 1
        }
    }
}
