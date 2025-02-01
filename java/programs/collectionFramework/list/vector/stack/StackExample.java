package programs.collectionFramework.list.vector.stack;

import java.util.Stack;

/* Stack is a class that represents a last-in, first-out (LIFO) stack of objects.
It is a part of the Java Collections Framework and extends the Vector class.
This means that Stack inherits all the properties of a Vector, such as dynamic resizing and thread safety.
Stack is considered a legacy class, originally part of Java 1.0. While it is still present in the Java API for backward compatibility. */
public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Date");
        System.out.println("Stack after pushing elements: " + stack);

        // Peek the top element
        System.out.println("Top element (peek): " + stack.peek());

        // Pop an element from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // Search for an element (returns 1-based index, or -1 if not found)
        int position = stack.search("Banana");
        System.out.println("Position of 'Banana' in stack: " + (position == -1 ? "Not Found" : position));

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Iterate through the stack using a for-each loop
        System.out.println("Iterating through the stack:");
        for (String item : stack) {
            System.out.println(item);
        }

        // Clear the stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);

        // Inherited Vector methods
        stack.add(1, "Blueberry"); // Vector method
        System.out.println("Stack after using add (Vector method): " + stack);

        // Using the inherited size() method
        System.out.println("Stack size: " + stack.size());

        // Removing an element using Vector's remove method
        stack.remove(2); // Removes "Banana"
        System.out.println("Stack after using remove (Vector method): " + stack);
    }
}