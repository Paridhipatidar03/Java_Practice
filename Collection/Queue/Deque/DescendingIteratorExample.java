import java.util.*;

public class DescendingIteratorExample {
    public static void main(String[] args) {
        Deque<Double> deque = new ArrayDeque<>();
        deque.add(10.5);
        deque.add(20.3);
        deque.add(30.8);
        deque.add(40.2);

        System.out.println("Traversing in reverse order:");
        Iterator<Double> descIterator = deque.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.print(descIterator.next() + " ");
        }
    }
}
