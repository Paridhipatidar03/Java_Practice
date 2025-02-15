import java.util.*;

public class QueueUsingDeque {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Queue after insertions: " + queue);
        System.out.println("Polled element: " + queue.poll());
        System.out.println("Queue after polling: " + queue);
    }
}
