/*Task 4 
1) Create a CustomStack class with operations Push, Pop, Peek, and IsEmpty. Demonstrate its LIFO behavior by pushing integers onto the stack, then popping and displaying them until the stack is empty.
*/
package assignment;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class CustomStack {
    private List<Integer> stack;

    public CustomStack() {
        stack = new ArrayList<>();
    }

    // Push operation: Add an element to the top of the stack
    public void push(int value) {
        stack.add(value);
    }

    // Pop operation: Remove and return the top element of the stack
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    // Peek operation: Return the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Create a CustomStack object
        CustomStack stack = new CustomStack();

        // Push integers onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // Pop and display elements until the stack is empty (LIFO behavior)
        System.out.println("Popping elements from the stack:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
