import java.util.*;

public class DequeToArray {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(10);
        deque.add(15);
        deque.add(20);

        // Convert to array
        Integer[] array = deque.toArray(new Integer[0]);

        // Print the array elements
        System.out.println("ArrayDeque converted to Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
