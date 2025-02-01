package programs.dsa.dataStructures.redBlackTree;

class RedBlackTree {
    private Node root;

    public static void main(String[] args) {
        RedBlackTree rbt = new RedBlackTree();
        rbt.insert(10);
        rbt.insert(20);
        rbt.insert(30);
        rbt.insert(15);

        System.out.println("In-order Traversal (R for Red, B for Black):");
        rbt.inOrderTraversal(rbt.root);
    }

    // Rotate left
    private void rotateLeft(Node node) {
        Node temp = node.right;
        node.right = temp.left;
        if (temp.left != null) temp.left.parent = node;
        temp.parent = node.parent;
        if (node.parent == null) root = temp;
        else if (node == node.parent.left) node.parent.left = temp;
        else node.parent.right = temp;
        temp.left = node;
        node.parent = temp;
    }

    // Rotate right
    private void rotateRight(Node node) {
        Node temp = node.left;
        node.left = temp.right;
        if (temp.right != null) temp.right.parent = node;
        temp.parent = node.parent;
        if (node.parent == null) root = temp;
        else if (node == node.parent.right) node.parent.right = temp;
        else node.parent.left = temp;
        temp.right = node;
        node.parent = temp;
    }

    // Fix tree after insertion
    private void fixTree(Node node) {
        while (node != root && node.parent.isRed) {
            if (node.parent == node.parent.parent.left) {
                Node uncle = node.parent.parent.right;
                if (uncle != null && uncle.isRed) { // Case 1: Uncle is red
                    node.parent.isRed = false;
                    uncle.isRed = false;
                    node.parent.parent.isRed = true;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.right) { // Case 2: Node is a right child
                        node = node.parent;
                        rotateLeft(node);
                    }
                    // Case 3: Node is a left child
                    node.parent.isRed = false;
                    node.parent.parent.isRed = true;
                    rotateRight(node.parent.parent);
                }
            } else {
                Node uncle = node.parent.parent.left;
                if (uncle != null && uncle.isRed) {
                    node.parent.isRed = false;
                    uncle.isRed = false;
                    node.parent.parent.isRed = true;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.left) {
                        node = node.parent;
                        rotateRight(node);
                    }
                    node.parent.isRed = false;
                    node.parent.parent.isRed = true;
                    rotateLeft(node.parent.parent);
                }
            }
        }
        root.isRed = false;
    }

    // Insert a node
    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            root.isRed = false; // Root is always black
        } else {
            Node current = root, parent = null;
            while (current != null) {
                parent = current;
                if (data < current.data) current = current.left;
                else current = current.right;
            }
            newNode.parent = parent;
            if (data < parent.data) parent.left = newNode;
            else parent.right = newNode;

            fixTree(newNode); // Fix tree properties
        }
    }

    // In-order traversal
    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + (node.isRed ? "(R) " : "(B) "));
            inOrderTraversal(node.right);
        }
    }

    // Node class
    static class Node {
        int data;
        Node left, right, parent;
        boolean isRed;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.parent = null;
            this.isRed = true; // New nodes are always red
        }
    }
}
