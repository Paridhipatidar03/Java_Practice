import java.util.*;

public class GenericArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Adding elements at both ends
        deque.addFirst(5);
        deque.add(10);
        deque.addLast(15);

        // Retrieving and Removing elements
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());
        System.out.println("Removed First: " + deque.pollFirst());
        System.out.println("Removed Last: " + deque.pollLast());

        // Checking and Iterating
        System.out.println("Contains 10? " + deque.contains(10));
        System.out.println("Size: " + deque.size());

        deque.clear();
        System.out.println("Deque Empty? " + deque.isEmpty());
    }
}
