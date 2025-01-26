package java.dsa.dataStructures.bTree;

import java.util.ArrayList;

class BTree {
    private static final int T = 2; // Minimum degree (defines the range for number of children)
    private BTreeNode root;

    public BTree() {
        root = new BTreeNode();
    }

    public static void main(String[] args) {
        BTree bTree = new BTree();
        bTree.insert(10);
        bTree.insert(20);
        bTree.insert(5);
        bTree.insert(6);
        bTree.insert(12);
        bTree.insert(30);
        bTree.insert(7);

        System.out.println("B-Tree (inorder traversal):");
        bTree.inorder();
    }

    // Insert a key
    public void insert(int key) {
        if (root.keys.size() == (2 * T - 1)) {
            BTreeNode newRoot = new BTreeNode();
            newRoot.children.set(0, root);
            split(newRoot, 0);
            root = newRoot;
        }
        insertNonFull(root, key);
    }

    // Split a node
    private void split(BTreeNode parent, int index) {
        BTreeNode node = parent.children.get(index);
        BTreeNode newNode = new BTreeNode();
        parent.keys.add(index, node.keys.get(T - 1));
        parent.children.add(index + 1, newNode);
        newNode.leaf = node.leaf;
        newNode.keys.addAll(node.keys.subList(T, node.keys.size()));
        node.keys = new ArrayList<>(node.keys.subList(0, T - 1));

        if (!node.leaf) {
            newNode.children.addAll(node.children.subList(T, node.children.size()));
            node.children = new ArrayList<>(node.children.subList(0, T));
        }
    }

    // Insert key into non-full node
    private void insertNonFull(BTreeNode node, int key) {
        int i = node.keys.size() - 1;
        if (node.leaf) {
            while (i >= 0 && key < node.keys.get(i)) {
                i--;
            }
            node.keys.add(i + 1, key);
        } else {
            while (i >= 0 && key < node.keys.get(i)) {
                i--;
            }
            i++;
            if (node.children.get(i).keys.size() == (2 * T - 1)) {
                split(node, i);
                if (key > node.keys.get(i)) {
                    i++;
                }
            }
            insertNonFull(node.children.get(i), key);
        }
    }

    // In-order traversal to print B-Tree
    public void inorder() {
        inorder(root);
    }

    private void inorder(BTreeNode node) {
        if (node != null) {
            int i;
            for (i = 0; i < node.keys.size() && node.keys.get(i) != null; i++) {
                if (!node.leaf) inorder(node.children.get(i));
                System.out.print(node.keys.get(i) + " ");
            }
            if (!node.leaf) inorder(node.children.get(i));
        }
    }

    // B-Tree Node
    private class BTreeNode {
        ArrayList<Integer> keys = new ArrayList<>();
        ArrayList<BTreeNode> children = new ArrayList<>();
        boolean leaf = true;

        public BTreeNode() {
            // Initializing keys and children
            for (int i = 0; i < 2 * T - 1; i++) {
                keys.add(null);
            }
            for (int i = 0; i < 2 * T; i++) {
                children.add(null);
            }
        }
    }
}
