import java.util.*;

public class MinMaxDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(15, 8, 25, 10, 5));

        int max = Collections.max(deque);
        int min = Collections.min(deque);

        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);
    }
}
