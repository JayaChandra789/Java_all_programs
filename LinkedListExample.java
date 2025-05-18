package javaAdvance;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        // Adding elements
        list.add("Dog");
        list.add("Cat");
        list.add("Rabbit");

        // Adding at a specific position
        list.add(1, "Horse");

        // Iterating over elements
        System.out.println("LinkedList elements:");
        for (String animal : list) {
            System.out.println(animal);
        }

        // Removing the first element
        list.removeFirst();
        System.out.println("After removing first element: " + list);
    }
}
