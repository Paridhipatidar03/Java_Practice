import java.util.*;

public class DequeOperations {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);
        deque.addFirst(20);
        deque.addLast(30);
        deque.addLast(40);

        System.out.println("Deque after insertions: " + deque);

        deque.removeFirst();
        System.out.println("After removeFirst(): " + deque);

        deque.removeLast();
        System.out.println("After removeLast(): " + deque);
    }
}
