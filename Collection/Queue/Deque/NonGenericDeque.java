import java.util.*;

public class NonGenericDeque {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque();
        deque.add("Hello");
        deque.add(100);
        deque.add(15.75);
        deque.add(true);

        System.out.println("Non-Generic Deque: " + deque);
    }
}
