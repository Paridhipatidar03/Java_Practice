import java.util.*;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(10, 15, 20, 25, 30));

        Iterator<Integer> iterator = deque.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("Deque after removing even numbers: " + deque);
    }
}
