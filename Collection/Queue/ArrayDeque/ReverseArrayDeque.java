import java.util.*;

public class ReverseArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        // deque.add(4);
        // deque.add(5);

        System.out.println("Original ArrayDeque: " + deque);

        // Reverse using a stack (another deque)
        ArrayDeque<Integer> reversedDeque = new ArrayDeque<>();
        while (!deque.isEmpty()) {
            reversedDeque.push(deque.pop());
        }

        System.out.println("Reversed ArrayDeque: " + reversedDeque);
    }
}
