import java.util.*;

public class NonGenericArrayDeque {
    public static void main(String[] args) {
        ArrayDeque deque = new ArrayDeque();
        deque.add("Hello");
        deque.add(100);
        deque.add(15.75);
        deque.add(true);

        System.out.println("Non-Generic ArrayDeque: " + deque);
    }
}
