package java.dsa.dataStructures.bPlusTree;

import java.util.ArrayList;

class BPlusTree {
    private static final int T = 2;
    private BPlusNode root;

    public BPlusTree() {
        root = new BPlusNode();
    }

    public static void main(String[] args) {
        BPlusTree bPlusTree = new BPlusTree();
        bPlusTree.insert(10);
        bPlusTree.insert(20);
        bPlusTree.insert(5);
        bPlusTree.insert(6);
        bPlusTree.insert(12);
        bPlusTree.insert(30);
        bPlusTree.insert(7);

        System.out.println("B+ Tree (inorder traversal):");
        bPlusTree.inorder();
    }

    public void insert(int key) {
        if (root.keys.size() == (2 * T - 1)) {
            BPlusNode newRoot = new BPlusNode();
            newRoot.children.add(root);
            split(newRoot, 0);
            root = newRoot;
        }
        insertNonFull(root, key);
    }

    private void split(BPlusNode parent, int index) {
        BPlusNode node = parent.children.get(index);
        BPlusNode newNode = new BPlusNode();
        parent.keys.add(index, node.keys.get(T - 1));
        parent.children.add(index + 1, newNode);

        newNode.isLeaf = node.isLeaf;
        newNode.keys.addAll(node.keys.subList(T, node.keys.size()));
        node.keys = new ArrayList<>(node.keys.subList(0, T - 1));

        if (node.isLeaf) {
            newNode.next = node.next;
            node.next = newNode;
        } else {
            newNode.children.addAll(node.children.subList(T, node.children.size()));
            node.children = new ArrayList<>(node.children.subList(0, T));
        }
    }

    private void insertNonFull(BPlusNode node, int key) {
        int i = node.keys.size() - 1;
        if (node.isLeaf) {
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

    public void inorder() {
        inorder(root);
    }

    private void inorder(BPlusNode node) {
        if (node != null) {
            for (int i = 0; i < node.keys.size(); i++) {
                if (!node.isLeaf) inorder(node.children.get(i));
                System.out.print(node.keys.get(i) + " ");
            }
            if (!node.isLeaf) inorder(node.children.get(node.keys.size()));
        }
    }

    private class BPlusNode {
        ArrayList<Integer> keys = new ArrayList<>();
        ArrayList<BPlusNode> children = new ArrayList<>();
        BPlusNode next; // For leaf node linking
        boolean isLeaf = true;
    }
}
