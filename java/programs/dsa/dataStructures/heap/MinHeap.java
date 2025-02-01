package programs.dsa.dataStructures.heap;

import java.util.ArrayList;

class MinHeap {
    private final ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(5);
        minHeap.insert(7);
        minHeap.insert(2);

        System.out.println("Heap after insertion:");
        minHeap.printHeap();

        System.out.println("Extract Min: " + minHeap.extractMin());
        minHeap.printHeap();

        System.out.println("Extract Min: " + minHeap.extractMin());
        minHeap.printHeap();
    }

    // Get parent index
    private int parent(int i) {
        return (i - 1) / 2;
    }

    // Get left child index
    private int leftChild(int i) {
        return 2 * i + 1;
    }

    // Get right child index
    private int rightChild(int i) {
        return 2 * i + 2;
    }

    // Insert a new value into the heap
    public void insert(int value) {
        heap.add(value); // Add the new value to the end
        int currentIndex = heap.size() - 1;

        // Bubble up the value to maintain heap property
        while (currentIndex > 0 && heap.get(currentIndex) < heap.get(parent(currentIndex))) {
            // Swap with parent
            int temp = heap.get(currentIndex);
            heap.set(currentIndex, heap.get(parent(currentIndex)));
            heap.set(parent(currentIndex), temp);

            currentIndex = parent(currentIndex);
        }
    }

    // Remove and return the minimum value (root) from the heap
    public int extractMin() {
        if (heap.size() == 0) throw new IllegalStateException("Heap is empty");

        int min = heap.get(0); // Root value
        int lastValue = heap.remove(heap.size() - 1);

        if (heap.size() > 0) {
            heap.set(0, lastValue); // Move last value to root
            heapify(0); // Restore heap property
        }

        return min;
    }

    // Heapify downwards
    private void heapify(int i) {
        int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        // Find the smallest value among the current node and its children
        if (left < heap.size() && heap.get(left) < heap.get(smallest)) smallest = left;
        if (right < heap.size() && heap.get(right) < heap.get(smallest)) smallest = right;

        // If the smallest is not the current node, swap and continue heapifying
        if (smallest != i) {
            int temp = heap.get(i);
            heap.set(i, heap.get(smallest));
            heap.set(smallest, temp);

            heapify(smallest);
        }
    }

    // Print the heap
    public void printHeap() {
        System.out.println(heap);
    }
}
