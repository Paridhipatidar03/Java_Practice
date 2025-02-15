import java.util.*;

public class GenericDeque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Adding Elements
        deque.addFirst("Mango");
        deque.add("Apple");
        deque.addLast("Peach");

        // Retrieving and Removing Elements
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());
        System.out.println("Removed First: " + deque.pollFirst());
        System.out.println("Removed Last: " + deque.pollLast());

        // Checking and Iterating
        System.out.println("Contains 'Apple'? " + deque.contains("Apple"));
        System.out.println("Size: " + deque.size());

        deque.clear();
        System.out.println("Deque Empty? " + deque.isEmpty());
    }
}
