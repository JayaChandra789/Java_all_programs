package javaAdvance;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        // Pushing elements onto the stack
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        // Peek the top element
        System.out.println("Top element: " + stack.peek());

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
