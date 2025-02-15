import java.util.*;

public class MinMaxArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(15);
        deque.add(8);
        deque.add(25);
        deque.add(10);
        // deque.add(5);

        int max = Collections.max(deque);
        int min = Collections.min(deque);

        System.out.println("ArrayDeque: " + deque);
        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);
    }
}
